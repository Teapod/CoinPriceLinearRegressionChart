package MathForPredicttion;

import java.util.List;

public class LinearRegression {
    private final double slope;
    private final double intercept;

    public LinearRegression (List<Double> x, List<Double> y) {
        if (x.size() != y.size()) {
            throw new IllegalArgumentException("arrays lengths are not equal");
        }

        int numberOfDataValues = x.size();

        double sumX = 0.0;
        double sumY = 0.0;
        double sumOfXSquared = 0.0;
        double sumOfXMultipliedByY = 0.0;

        for (int i = 0; i < numberOfDataValues; i++) {
            sumX += x.get(i);
            sumY += y.get(i);
            sumOfXSquared += x.get(i)*x.get(i);
            sumOfXMultipliedByY += x.get(i)*y.get(i);
        }

        double slopeNominator = numberOfDataValues * sumOfXMultipliedByY - sumX * sumY;
        double slopeDenominator = numberOfDataValues * sumOfXSquared - Math.pow(sumX, 2);
        this.slope =  slopeNominator / slopeDenominator;

        double interceptNominator = sumY - sumX * slope;
        double interceptDenominator = numberOfDataValues;
        this.intercept = interceptNominator / interceptDenominator;


    }


    public double predict(double x) {
        return slope * x + intercept;
    }
}