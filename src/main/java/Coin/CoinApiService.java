package Coin;

import Coin.Domain.MarketChart;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CoinApiService {
    @GET("coins/{id}/market_chart")
    Call<MarketChart> getCoinMarketChartById(
            @Path("id") String id,
            @Query("vs_currency") String vsCurrency,
            @Query("days") Integer days,
            @Query("interval") String interval);

    @GET("coins/{id}/market_chart")
    Call<MarketChart> getCoinMarketChartById(
            @Path("id") String id,
            @Query("vs_currency") String vsCurrency,
            @Query("days") Integer days);
}
