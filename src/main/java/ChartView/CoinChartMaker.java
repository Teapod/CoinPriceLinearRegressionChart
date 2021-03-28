package ChartView;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

import java.util.ArrayList;
import java.util.List;

public class CoinChartMaker {
   private XYChart chart;

    public CoinChartMaker(int daysToPredict, List<Double> prices){
        List<Double> daysPastFuture = new ArrayList<>();
        for (double i = daysToPredict*-1.0; i <=daysToPredict ; i++) {
            daysPastFuture.add(i);
        }
        this.chart = QuickChart.getChart(
                "BitcoinRegression", "DaysFromToday", "Price", "LinearRegrresion",
                daysPastFuture, prices );
    }

    public void displayChart(){
        new SwingWrapper(chart).displayChart();
    }
}
