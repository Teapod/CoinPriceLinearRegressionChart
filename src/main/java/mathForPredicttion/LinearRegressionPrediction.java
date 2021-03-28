package mathForPredicttion;

import java.util.ArrayList;
import java.util.List;

public class LinearRegressionPrediction {
    private LinearRegression linearRegression;
    private List<Double> pricesRegression;

    public LinearRegressionPrediction(List<Double> dateStamps, List<Double> prices, int daysToPredict) {
        this.linearRegression = new LinearRegression(dateStamps, prices);
        this.pricesRegression = new ArrayList<>(prices);
        for (int i = 1; i <= daysToPredict; i++) {
            double dateToPredict = 86400000 * i + dateStamps.get(dateStamps.size() - 1);
            pricesRegression.add(linearRegression.predict(dateToPredict));
        }
    }

    public List<Double> getPricesRegression() {
        return pricesRegression;
    }
}
