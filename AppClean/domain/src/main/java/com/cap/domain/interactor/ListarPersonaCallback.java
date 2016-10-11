package com.cap.domain.interactor;

import com.cap.domain.model.Persona;

import java.util.ArrayList;

/**
 * Created by CAP on 05/10/2016.
 */

public interface ListarPersonaCallback {

    void onListarPersonaSuccess(ArrayList<Persona> persona);
    void onListarPersonaError(String mensaje);
}
