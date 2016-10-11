package com.cap.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CAP on 30/09/2016.
 */

public class PersonaEntity {

    @SerializedName("objectId")
    private String objectId;

    @SerializedName("persona_nombre")
    private String personaNombre;

    @SerializedName("persona_apellido_paterno")
    private String personaApellidoPaterno;

    @SerializedName("persona_apellido_materno")
    private String personaApellidoMaterno;

    @SerializedName("persona_correo")
    private String personaCorreo;

    @SerializedName("persona_telefono")
    private String personaTelefono;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getPersonaApellidoMaterno() {
        return personaApellidoMaterno;
    }

    public void setPersonaApellidoMaterno(String personaApellidoMaterno) {
        this.personaApellidoMaterno = personaApellidoMaterno;
    }

    public String getPersonaApellidoPaterno() {
        return personaApellidoPaterno;
    }

    public void setPersonaApellidoPaterno(String personaApellidoPaterno) {
        this.personaApellidoPaterno = personaApellidoPaterno;
    }

    public String getPersonaCorreo() {
        return personaCorreo;
    }

    public void setPersonaCorreo(String personaCorreo) {
        this.personaCorreo = personaCorreo;
    }

    public String getPersonaNombre() {
        return personaNombre;
    }

    public void setPersonaNombre(String personaNombre) {
        this.personaNombre = personaNombre;
    }

    public String getPersonaTelefono() {
        return personaTelefono;
    }

    public void setPersonaTelefono(String personaTelefono) {
        this.personaTelefono = personaTelefono;
    }
}
