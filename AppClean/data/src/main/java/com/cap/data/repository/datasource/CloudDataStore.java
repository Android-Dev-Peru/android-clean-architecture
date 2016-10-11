package com.cap.data.repository.datasource;

import android.util.Log;

import com.cap.data.entity.PersonaEntity;
import com.cap.data.entity.PersonaResponse;
import com.cap.data.net.ApiConnectionImpl;
import com.cap.data.net.RestApi;
import com.cap.domain.repository.RepositoryCallback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by CAP on 01/10/2016.
 */

public class CloudDataStore implements  DataStore{

    private RestApi restApi;

    public CloudDataStore() {
        restApi = ApiConnectionImpl.openConnectionApi();
    }



    @Override
    public void dataRegistrarPersona(final PersonaEntity personaEntity, final RepositoryCallback repositoryCallback) {
        Call<PersonaEntity> personaEntityCall = restApi.registrarPersotaApi(personaEntity);
        personaEntityCall.enqueue(new Callback<PersonaEntity>() {
            @Override
            public void onResponse(Call<PersonaEntity> call, Response<PersonaEntity> response) {
                if(response != null) {
                    repositoryCallback.onSuccess(response.body());
                }else {
                    repositoryCallback.onError("");
                }
            }

            @Override
            public void onFailure(Call<PersonaEntity> call, Throwable t) {
                String message="";
                if(t!=null) {
                    message= t.getMessage();
                }
                Log.v("ERROR API",message);
                repositoryCallback.onError("");
            }
        });

    }

    @Override
    public void dataListarPersona(final RepositoryCallback repositoryCallback) {
        Call<PersonaResponse> personaResponseCall = restApi.listarPersotaApi();
        personaResponseCall.enqueue(new Callback<PersonaResponse>() {
            @Override
            public void onResponse(Call<PersonaResponse> call, Response<PersonaResponse> response) {
                if(response != null){
                    repositoryCallback.onSuccess(response.body());
                }else {
                    repositoryCallback.onError("");
                }
            }

            @Override
            public void onFailure(Call<PersonaResponse> call, Throwable t) {
                String message="";
                if(t!=null) {
                    message= t.getMessage();
                }
                Log.v("ERROR API",message);
                repositoryCallback.onError("");
            }
        });
    }

}
