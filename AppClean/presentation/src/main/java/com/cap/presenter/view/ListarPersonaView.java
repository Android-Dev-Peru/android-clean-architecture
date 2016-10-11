package com.cap.presenter.view;

import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

/**
 * Created by CAP on 09/10/2016.
 */

public interface ListarPersonaView extends BaseView{

    void configurarRecyclerView();
    void renderPersonaListener(ArrayList<PersonaModel> personaModelListener);

}
