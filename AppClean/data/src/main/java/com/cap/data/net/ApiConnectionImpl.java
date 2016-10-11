package com.cap.data.net;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CAP on 30/09/2016.
 */

public class ApiConnectionImpl{

    private static RestApi restApi;
    private static OkHttpClient okHttpClient;
    private static Retrofit retrofit;


    public static RestApi openConnectionApi() {
        okHttpClient = new OkHttpClient.Builder().addInterceptor(new LogInterceptor()).build();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.backendless.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
        restApi = retrofit.create(RestApi.class);
        return restApi;
    }
}
