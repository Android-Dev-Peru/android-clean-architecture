package com.cap.presenter.view;

import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAP on 05/10/2016.
 */

public interface ListarPersonaView extends BaseView {

    void listenerListarPersona(ArrayList<PersonaModel> renderListaPersona);
    void showLoading();
    void hideLoading();
}
