package com.cap.domain.interactor;

import com.cap.domain.repository.ListarPersonaRepository;

/**
 * Created by CAP on 30/09/2016.
 */

public class ListarPersonaInteractor {

    private final ListarPersonaRepository listarPersonaRepository;

    public ListarPersonaInteractor(ListarPersonaRepository listarPersonaRepository) {
        this.listarPersonaRepository = listarPersonaRepository;
    }

    public void getListarPersonaInteractor(ListarPersonaCallback listarPersonaCallback){
        listarPersonaRepository.domainListarPersonaRepository(listarPersonaCallback);
    }
}
