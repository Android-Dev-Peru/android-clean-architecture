package com.cap.data.net;

import com.cap.data.entity.PersonaEntity;
import com.cap.data.entity.BaseResponse;
import com.cap.data.entity.PersonaResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by CAP on 30/09/2016.
 */

public interface RestApi {


    @Headers({"application-id: DCAC950C-7918-7E8C-FF41-480831648000",
            "secret-key: F60BF035-F84E-8BC9-FF2A-C76626429D00",
            "Content-Type: application/json",
            "application-type: REST"})
    @POST("/v1/data/tab_persona")
    Call<PersonaEntity> registrarPersotaApi(@Body PersonaEntity personaEntity);

    @Headers({"application-id: DCAC950C-7918-7E8C-FF41-480831648000",
            "secret-key: F60BF035-F84E-8BC9-FF2A-C76626429D00",
            "Content-Type: application/json",
            "application-type: REST"})
    @GET("/v1/data/tab_persona")
    Call<PersonaResponse> listarPersotaApi();





}
