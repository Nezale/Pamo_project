package com.example.beerlab.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BeerlabAuthService {
    @POST("/api/auth/signin")
    Call<LoginPayload> login(@Body LoginPayload loginPayload);

    @POST("/api/auth/signup")
    Call<RegisterPayload> register(@Body RegisterPayload registerPayload);
}