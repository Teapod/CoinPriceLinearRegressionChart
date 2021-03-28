import ChartView.CoinChartMaker;
import Coin.BitCoinPriceCheck;
import MathForPredicttion.LinearRegressionPrediction;

public class Starter {
    public static void main(String[] args) {
        
        int daysToPredict = 7;

        BitCoinPriceCheck bitCoinPriceCheck = new BitCoinPriceCheck(daysToPredict);

        LinearRegressionPrediction linearRegressionPrediction = new LinearRegressionPrediction(
                bitCoinPriceCheck.getDateStamps(), bitCoinPriceCheck.getBitPrices(), daysToPredict);

        new CoinChartMaker(daysToPredict, linearRegressionPrediction.getPricesRegression()).displayChart();
    }

}
