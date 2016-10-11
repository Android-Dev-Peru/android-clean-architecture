package com.cap.presenter.view.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.cap.presenter.R;
import com.cap.presenter.navigation.Navigator;
import com.cap.presenter.view.ui.fragment.ListarPersonaFragment;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

import butterknife.OnClick;

public class ListarPersonaActivity extends BaseActivity {

    public static Intent getCallingIntent(Context context,ArrayList<PersonaModel> personaModelArrayList){
        Intent callingIntent = new Intent(context,ListarPersonaActivity.class);
        callingIntent.putExtra("INTENT_PERSONA",personaModelArrayList);
        return callingIntent;
    }

    private Navigator navigator;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_listar_persona;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if(savedInstanceState == null){
            Bundle bundle = getIntent().getExtras();
            showFragment(new ListarPersonaFragment(),R.id.frListarPersona,bundle);
        }
    }

    @OnClick(R.id.fabOpenRegistrarPersona)
    void onClickRegistrarPersona(){
        navigator = new Navigator();
        navigator.navigateToRegistrarPersona(ListarPersonaActivity.this);
    }
}
