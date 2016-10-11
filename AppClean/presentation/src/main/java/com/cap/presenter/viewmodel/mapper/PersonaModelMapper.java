package com.cap.presenter.viewmodel.mapper;

import com.cap.data.entity.mapper.Mapper;
import com.cap.domain.model.Persona;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

/**
 * Created by CAP on 30/09/2016.
 */

public class PersonaModelMapper extends Mapper<PersonaModel,Persona>{
    @Override
    public Persona map(PersonaModel value) {
        Persona persona = new Persona();
        persona.setPersonaNombre(value.getPersonaNombre());
        persona.setPersonaApellidoPaterno(value.getPersonaApellidoPaterno());
        persona.setPersonaApellidoMaterno(value.getPersonaApellidoMaterno());
        persona.setPersonaCorreo(value.getPersonaCorreo());
        persona.setPersonaTelefono(value.getPersonaTelefono());
        return persona;
    }

    @Override
    public PersonaModel reverseMap(Persona value) {
        PersonaModel personaModel = new PersonaModel();
        personaModel.setPersonaNombre(value.getPersonaNombre());
        personaModel.setPersonaApellidoPaterno(value.getPersonaApellidoPaterno());
        personaModel.setPersonaApellidoMaterno(value.getPersonaApellidoMaterno());
        personaModel.setPersonaCorreo(value.getPersonaCorreo());
        personaModel.setPersonaTelefono(value.getPersonaTelefono());
        return personaModel;
    }

    public ArrayList<PersonaModel> mapListPersonaModel(ArrayList<Persona> personaList){
        ArrayList<PersonaModel> personaModelList = new ArrayList<>(personaList.size());
        for(Persona  persona: personaList){
            personaModelList.add(reverseMap(persona));
        }
        return personaModelList;
    }
}
