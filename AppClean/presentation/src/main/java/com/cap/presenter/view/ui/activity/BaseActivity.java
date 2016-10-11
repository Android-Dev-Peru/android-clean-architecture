package com.cap.presenter.view.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by CAP on 30/09/2016.
 */

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        bindView();
        initView(savedInstanceState);
    }

    public void initView(Bundle savedInstanceState){}

    public void showFragment(Fragment fragment,int containerViewId, Bundle bundle){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(bundle!=null){
            fragment.setArguments(bundle);
        }
        fragmentTransaction.add(containerViewId,fragment);
        fragmentTransaction.commit();
    }

    protected abstract int getLayoutId();

    private void bindView(){ButterKnife.bind(this);}

}
