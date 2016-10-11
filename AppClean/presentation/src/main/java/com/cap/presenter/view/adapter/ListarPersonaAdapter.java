package com.cap.presenter.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cap.presenter.R;
import com.cap.presenter.viewmodel.PersonaModel;

import java.util.ArrayList;

/**
 * Created by CAP on 30/09/2016.
 */

public class ListarPersonaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<PersonaModel> adapterPersonaModelesLista;

    public ListarPersonaAdapter() {
        this.adapterPersonaModelesLista = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.persona_row,parent,false);
        return new ListarPersonaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ListarPersonaViewHolder listarPersonaViewHolder = (ListarPersonaViewHolder) holder;
        final PersonaModel personaModel = adapterPersonaModelesLista.get(position);
        listarPersonaViewHolder.render(personaModel);
    }

    @Override
    public int getItemCount() {
        return adapterPersonaModelesLista.size();
    }

    public void setItemPersona(ArrayList<PersonaModel> itemPersona){
        adapterPersonaModelesLista = itemPersona;
    }
}
