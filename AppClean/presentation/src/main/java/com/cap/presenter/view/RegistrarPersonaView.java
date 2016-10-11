package com.cap.presenter.view;

import com.cap.presenter.viewmodel.PersonaModel;

/**
 * Created by CAP on 30/09/2016.
 */

public interface RegistrarPersonaView extends BaseView{

    void showRegistroPersonaSuccess(String mensaje);

    void showValidacionCampos(String mensaje);
}
