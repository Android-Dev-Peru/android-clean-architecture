package com.cap.domain.repository;

import com.cap.domain.interactor.RegistrarPersonaCallback;
import com.cap.domain.model.Persona;

/**
 * Created by CAP on 30/09/2016.
 */

public interface RegistrarPersonaRepository {

    void domainRegistrarPersonaRepository(Persona persona,RegistrarPersonaCallback registrarPersonaCallback);
}
