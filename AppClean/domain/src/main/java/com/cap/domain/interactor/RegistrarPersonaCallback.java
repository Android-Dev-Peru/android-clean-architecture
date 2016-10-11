package com.cap.domain.interactor;

import com.cap.domain.model.Persona;

/**
 * Created by CAP on 04/10/2016.
 */

public interface RegistrarPersonaCallback {

    void onRegistrarPersonaSuccess(Persona persona);
    void onRegistrarPersonaError(String mensaje);

}
