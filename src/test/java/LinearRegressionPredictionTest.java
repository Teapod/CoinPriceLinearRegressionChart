import MathForPredicttion.LinearRegressionPrediction;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinearRegressionPredictionTest {

    /**
     * getPricesRegression should return list with size equals -
     * sum of daysToPredict and size of element in list for Y axis in linear regression
     */
    @Test
    void getPricesRegression() {
        int daysToPredict = 3;
        List<Double> x = Arrays.asList(5.0, 4.0, 7.0, 6.0);
        List<Double> y = Arrays.asList(10.0, 20.0, 15.0, 30.0);
        LinearRegressionPrediction linearRegressionPrediction = new LinearRegressionPrediction(x, y, daysToPredict);

        assertEquals(daysToPredict + y.size(), linearRegressionPrediction.getPricesRegression().size());
    }
}