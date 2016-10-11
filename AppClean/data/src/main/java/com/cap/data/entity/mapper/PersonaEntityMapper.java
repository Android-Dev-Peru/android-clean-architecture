package com.cap.data.entity.mapper;

import com.cap.data.entity.PersonaEntity;
import com.cap.data.entity.PersonaResponse;
import com.cap.domain.model.Persona;

import java.util.ArrayList;

/**
 * Created by CAP on 30/09/2016.
 */

public class PersonaEntityMapper extends Mapper<Persona,PersonaEntity>{
    @Override
    public PersonaEntity map(Persona value) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setPersonaNombre(value.getPersonaNombre());
        personaEntity.setPersonaApellidoPaterno(value.getPersonaApellidoPaterno());
        personaEntity.setPersonaApellidoMaterno(value.getPersonaApellidoMaterno());
        personaEntity.setPersonaCorreo(value.getPersonaCorreo());
        personaEntity.setPersonaTelefono(value.getPersonaTelefono());
        return personaEntity;
    }

    @Override
    public Persona reverseMap(PersonaEntity value) {
        Persona persona = new Persona();
        persona.setObjectId(value.getObjectId());
        persona.setPersonaNombre(value.getPersonaNombre());
        persona.setPersonaApellidoPaterno(value.getPersonaApellidoPaterno());
        persona.setPersonaApellidoMaterno(value.getPersonaApellidoMaterno());
        persona.setPersonaCorreo(value.getPersonaCorreo());
        persona.setPersonaTelefono(value.getPersonaTelefono());
        return persona;
    }

    public ArrayList<Persona> mapListPersona(PersonaResponse personaResponse){
        ArrayList<Persona> personaList = new ArrayList<>();
        for(PersonaEntity personaEntity : personaResponse.getData()){
            personaList.add(reverseMap(personaEntity));
        }
        return personaList;
    }
}
