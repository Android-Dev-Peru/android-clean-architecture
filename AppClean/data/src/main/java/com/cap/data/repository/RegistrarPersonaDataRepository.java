package com.cap.data.repository;

import com.cap.data.entity.PersonaEntity;
import com.cap.data.entity.mapper.PersonaEntityMapper;
import com.cap.data.repository.datasource.DataStore;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.RegistrarPersonaCallback;
import com.cap.domain.model.Persona;
import com.cap.domain.repository.RegistrarPersonaRepository;
import com.cap.domain.repository.RepositoryCallback;

/**
 * Created by CAP on 30/09/2016.
 */

public class RegistrarPersonaDataRepository implements  RegistrarPersonaRepository {

    private final DataStoreFactory dataStoreFactory;
    private final PersonaEntityMapper personaEntityMapper;

    public RegistrarPersonaDataRepository(DataStoreFactory dataStoreFactory, PersonaEntityMapper personaEntityMapper) {
        this.dataStoreFactory = dataStoreFactory;
        this.personaEntityMapper = personaEntityMapper;
    }

    @Override
    public void domainRegistrarPersonaRepository(final Persona persona, final RegistrarPersonaCallback registrarPersonaCallback) {
        final DataStore dataStore = dataStoreFactory.createDataStore();
        dataStore.dataRegistrarPersona(personaEntityMapper.map(persona), new RepositoryCallback() {
            @Override
            public void onError(Object object) {
                String message = "";
                if(object!=null){
                    message= object.toString();
                }
                registrarPersonaCallback.onRegistrarPersonaError(message);
            }

            @Override
            public void onSuccess(Object object) {
                PersonaEntity personaEntity = (PersonaEntity) object;
                registrarPersonaCallback.onRegistrarPersonaSuccess(personaEntityMapper.reverseMap(personaEntity));
            }
        });
    }
}
