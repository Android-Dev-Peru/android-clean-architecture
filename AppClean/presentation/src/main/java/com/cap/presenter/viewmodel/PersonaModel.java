package com.cap.presenter.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CAP on 30/09/2016.
 */

public class PersonaModel implements Parcelable {

    private String objectId;
    private String personaNombre;
    private String personaApellidoPaterno;
    private String personaApellidoMaterno;
    private String personaCorreo;
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.objectId);
        dest.writeString(this.personaNombre);
        dest.writeString(this.personaApellidoPaterno);
        dest.writeString(this.personaApellidoMaterno);
        dest.writeString(this.personaCorreo);
        dest.writeString(this.personaTelefono);
    }

    public PersonaModel() {
    }

    protected PersonaModel(Parcel in) {
        this.objectId = in.readString();
        this.personaNombre = in.readString();
        this.personaApellidoPaterno = in.readString();
        this.personaApellidoMaterno = in.readString();
        this.personaCorreo = in.readString();
        this.personaTelefono = in.readString();
    }

    public static final Creator<PersonaModel> CREATOR = new Creator<PersonaModel>() {
        @Override
        public PersonaModel createFromParcel(Parcel source) {
            return new PersonaModel(source);
        }

        @Override
        public PersonaModel[] newArray(int size) {
            return new PersonaModel[size];
        }
    };
}
