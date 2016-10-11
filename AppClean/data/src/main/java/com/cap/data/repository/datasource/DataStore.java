package com.cap.data.repository.datasource;

import com.cap.data.entity.PersonaEntity;
import com.cap.domain.repository.RepositoryCallback;

/**
 * Created by CAP on 01/10/2016.
 */

public interface DataStore {

    void dataRegistrarPersona(PersonaEntity personaEntity, RepositoryCallback repositoryCallback);

    void dataListarPersona(RepositoryCallback repositoryCallback);
}
