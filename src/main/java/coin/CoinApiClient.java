package coin;

import coin.domain.MarketChart;

public class CoinApiClient {
    private final CoinApiService coinApiService;
    private final CoinApi coinApi;

    public CoinApiClient() {
        this.coinApi = new CoinApi();
        this.coinApiService = coinApi.createService();
    }

    public MarketChart getCoinMarketChartById(String id, String vsCurrency, Integer days, String interval) {
        return coinApi.executeSync(coinApiService.getCoinMarketChartById(id, vsCurrency, days, interval));
    }

}
