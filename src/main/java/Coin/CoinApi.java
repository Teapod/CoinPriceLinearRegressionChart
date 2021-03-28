package Coin;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

public class CoinApi {
    private final String API_BASE_URL = "https://api.coingecko.com/api/v3/";
    private Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create());
    private Retrofit retrofit = builder.build();

    public <S> S createService (Class<S> serviceClass){
return retrofit.create(serviceClass);
    }

public <T> T executeSync(Call<T> call){
    try {
        Response<T> response =call.execute();
        if( response.isSuccessful()){
return response.body();
        } else {
            // Add correct way to handle unsuccessful response!!!!
            System.out.println("Response code "+response.code());
        }
    } catch (IOException e) {
        // Add correct way to handle exception!!!!
        System.out.println("Error to handle!!!" + e.getMessage());
    }
    return null;
}
}
