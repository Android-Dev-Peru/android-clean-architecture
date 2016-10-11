package com.cap.domain.interactor;

import com.cap.domain.model.Persona;
import com.cap.domain.repository.RegistrarPersonaRepository;

/**
 * Created by CAP on 30/09/2016.
 */

public class RegistrarPersonaInteractor{

    private RegistrarPersonaRepository registrarPersonaRepository;

    public RegistrarPersonaInteractor(RegistrarPersonaRepository registrarPersonaRepository) {
        this.registrarPersonaRepository = registrarPersonaRepository;
    }

    public void setRegistrarPersonaInteractor(Persona persona,RegistrarPersonaCallback registrarPersonaCallback){
        try {
            registrarPersonaRepository.domainRegistrarPersonaRepository(persona, registrarPersonaCallback);
        }catch (Exception e){
            e.toString();
        }
    }


}
