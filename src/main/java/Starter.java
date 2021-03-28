import chartView.CoinChartMaker;
import coin.BitCoinPriceCheck;
import mathForPredicttion.LinearRegressionPrediction;

public class Starter {
    public static void main(String[] args) {

        // Days to predict - one week
        int daysToPredict = 7;

        BitCoinPriceCheck bitCoinPriceCheck = new BitCoinPriceCheck(daysToPredict);

        LinearRegressionPrediction linearRegressionPrediction = new LinearRegressionPrediction(
                bitCoinPriceCheck.getDateStamps(),
                bitCoinPriceCheck.getBitPrices(),
                daysToPredict);

        new CoinChartMaker(daysToPredict, linearRegressionPrediction.getPricesRegression()).displayChart();
    }

}
