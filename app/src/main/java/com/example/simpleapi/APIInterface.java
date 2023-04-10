package com.example.simpleapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    // https://run.mocky.io/v3/    18c6ec13-37b6-4ab8-a2e8-89a50f357f46

    @GET("v3/18c6ec13-37b6-4ab8-a2e8-89a50f357f46")
    Call<Model> getData();

}
