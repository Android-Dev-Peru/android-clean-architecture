package com.cap.data.repository;

import android.util.Log;

import com.cap.data.entity.PersonaResponse;
import com.cap.data.entity.mapper.PersonaEntityMapper;
import com.cap.data.repository.datasource.DataStore;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.ListarPersonaCallback;
import com.cap.domain.model.Persona;
import com.cap.domain.repository.ListarPersonaRepository;
import com.cap.domain.repository.RepositoryCallback;

import java.util.ArrayList;

/**
 * Created by CAP on 05/10/2016.
 */

public class ListarPersonaDataRepository implements ListarPersonaRepository {

    private final DataStoreFactory dataStoreFactory;
    private final PersonaEntityMapper personaEntityMapper;


    public ListarPersonaDataRepository(DataStoreFactory dataStoreFactory, PersonaEntityMapper personaEntityMapper) {
        this.dataStoreFactory = dataStoreFactory;
        this.personaEntityMapper = personaEntityMapper;
    }

    @Override
    public void domainListarPersonaRepository(final ListarPersonaCallback listarPersonaCallback) {
        final DataStore dataStore = dataStoreFactory.createDataStore();
        dataStore.dataListarPersona(new RepositoryCallback() {
            @Override
            public void onError(Object object) {
                String message = "";
                if(object!=null){
                    message= object.toString();
                }
                Log.i("ERROR DATA=",message.toString());
                listarPersonaCallback.onListarPersonaError(message);
            }

            @Override
            public void onSuccess(Object object) {
                PersonaResponse personaResponse = (PersonaResponse) object;
                ArrayList<Persona> personaArrayList = personaEntityMapper.mapListPersona(personaResponse);
                listarPersonaCallback.onListarPersonaSuccess(personaArrayList);
            }
        });
    }
}
