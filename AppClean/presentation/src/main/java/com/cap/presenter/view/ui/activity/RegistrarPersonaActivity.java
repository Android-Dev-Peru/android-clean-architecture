package com.cap.presenter.view.ui.activity;

import android.os.Bundle;

import com.cap.presenter.R;
import com.cap.presenter.view.ui.fragment.RegistrarPersonaFragment;

/**
 * Created by CAP on 30/09/2016.
 */

public class RegistrarPersonaActivity extends BaseActivity{
    @Override
    protected int getLayoutId() {
        return R.layout.activity_registrar_persona;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if(savedInstanceState == null){
            showFragment(new RegistrarPersonaFragment(),R.id.frPersona,null);
        }
    }
}
