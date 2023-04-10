package com.example.simpleapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.simpleapi.databinding.ActivityMainBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

   // ArrayList<Model> UserList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIInterface apiInterface = retrofit.create(APIInterface.class);

        Call<Model> call = apiInterface.getData();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {

                if(response.code()!= 200){
                    binding.UserName.setText("Check the Connection");
                    return;
                }
                //String ID = String.valueOf(response.body().getUserID());
                String Name = response.body().getName();
                String Position = response.body().getPosition();

                binding.UserName.append(Name);
                binding.UserPosition.append(Position);
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {

            }
        });

    }
}