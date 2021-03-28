package Coin;

import Coin.Domain.MarketChart;

import java.util.ArrayList;
import java.util.List;

public class BitCoinPriceCheck {
    private List<Double> dateStamps = new ArrayList<>();
    private List<Double> bitPrices = new ArrayList<>();

    public BitCoinPriceCheck(int daysToCheck) {
        MarketChart mc = new CoinApiClient().getCoinMarketChartById("bitcoin", "usd", daysToCheck, "daily");
        for (List<String> x : mc.getPrices()) {
            dateStamps.add(Double.parseDouble(x.get(0)));
            bitPrices.add(Double.parseDouble(x.get(1)));
        }
    }

    public List<Double> getDateStamps() {
        return dateStamps;
    }

    public List<Double> getBitPrices() {
        return bitPrices;
    }
}
