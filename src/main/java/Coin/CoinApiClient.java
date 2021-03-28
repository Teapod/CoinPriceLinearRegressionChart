package Coin;

import Coin.Domain.MarketChart;

public class CoinApiClient {
    private CoinApiService coinApiService;
    private CoinApi coinApi;

    public CoinApiClient() {
        this.coinApi = new CoinApi();
        this.coinApiService = coinApi.createService(CoinApiService.class);
    }

    public MarketChart getCoinMarketChartById(String id, String vsCurrency, Integer days) {
        return coinApi.executeSync(coinApiService.getCoinMarketChartById(id, vsCurrency, days));
    }

    public MarketChart getCoinMarketChartById(String id, String vsCurrency, Integer days, String interval) {
        return coinApi.executeSync(coinApiService.getCoinMarketChartById(id, vsCurrency, days, interval));
    }

}
