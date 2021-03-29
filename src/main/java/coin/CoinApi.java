package coin;

import org.apache.log4j.Logger;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class CoinApi {
    private final Retrofit retrofit;
    private final Logger logger = Logger.getLogger(this.getClass());

    public CoinApi() {
        String API_BASE_URL = "https://api.coingecko.com/api/v3/";
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create());
        retrofit = builder.build();
    }

    CoinApiService createService() {
        return retrofit.create(CoinApiService.class);
    }

    <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                // Add correct way to handle unsuccessful response!!!!
                logger.warn("Response code " + response.code());
                throw new RuntimeException("Bad response code");
            }
        } catch (IOException e) {
            // Add correct way to handle exception!!!!
            logger.error("Couldn't execute...", e);
            throw new RuntimeException(e);
        }
    }
}
