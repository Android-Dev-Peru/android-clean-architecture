package com.cap.presenter.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;

import com.cap.presenter.R;
import com.cap.presenter.presenter.ListarPersonaPresenter;
import com.cap.presenter.view.LoadAppView;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by CAP on 07/10/2016.
 */

public class LoadAppFragment extends BaseFragment implements LoadAppView {



    public interface RenderListarPersona{
        void renderListarPersonaItem(ArrayList<PersonaModel> renderListaPersona);
    }

    @BindView(R.id.lyLoadRegistrarPersona)
    RelativeLayout linearLayoutLoad;

    private ListarPersonaPresenter listarPersonaPresenter;

    private RenderListarPersona renderListarPersona;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_load_app;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof RenderListarPersona){
            renderListarPersona = (RenderListarPersona) context;
        }
    }

    @Override
    public void initViewFragment(Bundle bundle) {
        super.initViewFragment(bundle);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listarPersonaPresenter = new ListarPersonaPresenter();
        listarPersonaPresenter.setView(this);
        if(savedInstanceState == null){
            listarPersonaPresenter.getListarPersonaPresenter();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        listarPersonaPresenter.destroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        renderListarPersona = null;
    }

    @Override
    public void listenerListarPersona(ArrayList<PersonaModel> itemListaPersona) {
        if(itemListaPersona != null) {
            renderListarPersona.renderListarPersonaItem(itemListaPersona);
        }
    }

    @Override
    public Context context() {
        return getActivity().getApplication();
    }
}
