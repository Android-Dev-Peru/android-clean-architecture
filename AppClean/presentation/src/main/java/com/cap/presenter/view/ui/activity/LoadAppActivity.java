package com.cap.presenter.view.ui.activity;

import android.os.Bundle;

import com.cap.presenter.R;
import com.cap.presenter.navigation.Navigator;
import com.cap.presenter.view.ui.fragment.LoadAppFragment;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

/**
 * Created by CAP on 07/10/2016.
 */

public class LoadAppActivity extends BaseActivity implements LoadAppFragment.RenderListarPersona{

    private Navigator navigator;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_load_app;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if(savedInstanceState == null){
            showFragment(new LoadAppFragment(),R.id.frLoadApp,null);
        }
    }

    @Override
    public void renderListarPersonaItem(ArrayList<PersonaModel> renderListaPersona) {
        navigator = new Navigator();
        if(renderListaPersona !=null) {
            navigator.navigateToListarPersona(LoadAppActivity.this, renderListaPersona);
        }
    }

}
