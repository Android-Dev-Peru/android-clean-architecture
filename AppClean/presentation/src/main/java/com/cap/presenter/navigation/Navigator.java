package com.cap.presenter.navigation;

import android.content.Context;
import android.content.Intent;

import com.cap.presenter.view.ui.activity.ListarPersonaActivity;
import com.cap.presenter.view.ui.activity.RegistrarPersonaActivity;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

/**
 * Created by CAP on 30/09/2016.
 */

public class Navigator {

    public void navigateToRegistrarPersona(Context context){
        Intent intentToRegistrarPersona = new Intent(context, RegistrarPersonaActivity.class);
        context.startActivity(intentToRegistrarPersona);
    }

    public void navigateToListarPersona(Context context, ArrayList<PersonaModel> navigateListarPersona){
        ArrayList<PersonaModel> personaModelArrayList = navigateListarPersona;
        Intent intent = ListarPersonaActivity.getCallingIntent(context,personaModelArrayList);
        context.startActivity(intent);
    }
}
