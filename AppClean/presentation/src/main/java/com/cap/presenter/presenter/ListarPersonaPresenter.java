package com.cap.presenter.presenter;

import android.util.Log;

import com.cap.data.entity.mapper.PersonaEntityMapper;
import com.cap.data.repository.ListarPersonaDataRepository;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.ListarPersonaCallback;
import com.cap.domain.interactor.ListarPersonaInteractor;
import com.cap.domain.model.Persona;
import com.cap.domain.repository.ListarPersonaRepository;
import com.cap.presenter.view.LoadAppView;
import com.cap.presenter.viewmodel.PersonaModel;
import com.cap.presenter.viewmodel.mapper.PersonaModelMapper;

import java.util.ArrayList;

/**
 * Created by CAP on 30/09/2016.
 */

public class ListarPersonaPresenter implements Presenter<LoadAppView>, ListarPersonaCallback {

    private ListarPersonaInteractor listarPersonaInteractor;
    private LoadAppView loadAppView;
    private PersonaModelMapper personaModelMapper;
    private ArrayList<PersonaModel> personaModelArrayList;


    @Override
    public void setView(LoadAppView view) {
        this.loadAppView =  view;
        ListarPersonaRepository listarPersonaRepository =
                new ListarPersonaDataRepository(
                        new DataStoreFactory(
                                this.loadAppView.context()
                        ),
                        new PersonaEntityMapper()
                );
        listarPersonaInteractor = new ListarPersonaInteractor(listarPersonaRepository);
    }

    public void getListarPersonaPresenter(){
        listarPersonaInteractor.getListarPersonaInteractor(this);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        loadAppView = null;
        listarPersonaInteractor = null;
    }

    @Override
    public void onListarPersonaSuccess(ArrayList<Persona> persona) {

        personaModelMapper = new PersonaModelMapper();
        personaModelArrayList = personaModelMapper.mapListPersonaModel(persona);
        this.loadAppView.listenerListarPersona(personaModelArrayList);
    }

    @Override
    public void onListarPersonaError(String mensaje) {
        Log.i("ERROR=",mensaje.toString());
    }
}
