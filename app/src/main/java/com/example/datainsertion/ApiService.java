package com.example.datainsertion;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/add-user")
    Call<User> addUser(@Body User user);
}
