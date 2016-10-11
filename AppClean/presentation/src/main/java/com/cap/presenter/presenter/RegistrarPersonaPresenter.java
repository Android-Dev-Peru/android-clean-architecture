package com.cap.presenter.presenter;

import android.util.Log;

import com.cap.data.entity.mapper.PersonaEntityMapper;
import com.cap.data.repository.RegistrarPersonaDataRepository;
import com.cap.data.repository.datasource.DataStoreFactory;
import com.cap.domain.interactor.RegistrarPersonaCallback;
import com.cap.domain.interactor.RegistrarPersonaInteractor;
import com.cap.domain.model.Persona;
import com.cap.domain.repository.RegistrarPersonaRepository;
import com.cap.presenter.view.RegistrarPersonaView;
import com.cap.presenter.viewmodel.PersonaModel;
import com.cap.presenter.viewmodel.mapper.PersonaModelMapper;

/**
 * Created by CAP on 30/09/2016.
 */

public class RegistrarPersonaPresenter implements Presenter<RegistrarPersonaView>,RegistrarPersonaCallback {

    private PersonaModelMapper personaModelMapper;
    private RegistrarPersonaView registrarPersonaView;
    private RegistrarPersonaInteractor registrarPersonaInteractor;

    @Override
    public void setView(RegistrarPersonaView view){
        this.registrarPersonaView = view;
        RegistrarPersonaRepository registrarPersonaRepository
                = new RegistrarPersonaDataRepository(
                    new DataStoreFactory(
                            this.registrarPersonaView.context()
                        ),
                    new PersonaEntityMapper()
                );
        registrarPersonaInteractor = new RegistrarPersonaInteractor(registrarPersonaRepository);
    }

    public void setDatosPersonaModel(String nombre,String apellidoPaterno, String apellidoMaterno, String correo, String telefono){
        if(nombre.equals("") || apellidoPaterno.equals("") || apellidoMaterno.equals("") || correo.equals("") || telefono.equals("")) {
            registrarPersonaView.showValidacionCampos("Completar todos los campos");
        }else {
            PersonaModel personaModel = new PersonaModel();
            personaModel.setPersonaNombre(nombre);
            personaModel.setPersonaApellidoPaterno(apellidoPaterno);
            personaModel.setPersonaApellidoMaterno(apellidoMaterno);
            personaModel.setPersonaCorreo(correo);
            personaModel.setPersonaTelefono(telefono);
            setRegistrarPersonaPresenter(personaModel);
        }
    }

    private void setRegistrarPersonaPresenter(PersonaModel personaModel){
        try {
            personaModelMapper = new PersonaModelMapper();
            registrarPersonaInteractor.setRegistrarPersonaInteractor(personaModelMapper.map(personaModel), this);
        }catch (Exception e){
            Log.i("ERROR PRESENTER=",e.toString());
        }
    }


    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        registrarPersonaView = null;
        registrarPersonaInteractor = null;
    }

    @Override
    public void onRegistrarPersonaSuccess(Persona persona) {
        Log.i("OK=",persona.getObjectId().toString());
        if(persona.getObjectId().toString() != null) {
            this.registrarPersonaView.showRegistroPersonaSuccess("Registro correcto");
        }
    }

    @Override
    public void onRegistrarPersonaError(String mensaje) {
        Log.i("ERROR="," :( ");
    }
}
