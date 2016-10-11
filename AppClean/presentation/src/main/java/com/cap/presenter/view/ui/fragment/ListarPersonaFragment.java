package com.cap.presenter.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.cap.presenter.R;
import com.cap.presenter.view.ListarPersonaView;
import com.cap.presenter.view.adapter.ListarPersonaAdapter;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by CAP on 30/09/2016.
 */

public class ListarPersonaFragment extends BaseFragment implements ListarPersonaView{

    @BindView(R.id.rvListaPersona)
    RecyclerView recyclerView;

    private ListarPersonaAdapter listarPersonaAdapter ;

    private ArrayList<PersonaModel> listarPersonaArrayList;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_listar_persona;
    }

    @Override
    public void initViewFragment(Bundle bundle) {
        super.initViewFragment(bundle);
        listarPersonaAdapter = new ListarPersonaAdapter();
        listarPersonaArrayList = getArguments().getParcelableArrayList("INTENT_PERSONA");
        configurarRecyclerView();
        renderPersonaListener(listarPersonaArrayList);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void configurarRecyclerView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(context()));
        recyclerView.setAdapter(listarPersonaAdapter);
    }

    @Override
    public void renderPersonaListener(ArrayList<PersonaModel> personaModelListener) {
        listarPersonaAdapter.setItemPersona(personaModelListener);
        listarPersonaAdapter.notifyDataSetChanged();
    }

    @Override
    public Context context() {
        return getActivity().getApplication();
    }
}
