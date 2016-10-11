package com.cap.presenter.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cap.presenter.R;
import com.cap.presenter.viewmodel.PersonaModel;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by CAP on 30/09/2016.
 */

public class ListarPersonaViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.tvNombrePersona)
    TextView nombre;

    @BindView(R.id.tvTelefono)
    TextView telefono;

    @BindView(R.id.tvCorreo)
    TextView correo;

    @BindView(R.id.ivPersonaNombre)
    ImageView imageViewPersonaNombre;

    @BindView(R.id.ivPersonaTelefono)
    ImageView imageViewPersonaTelefono;

    @BindView(R.id.ivPersonaCorreo)
    ImageView imageViewPersonaCorreo;

    public ListarPersonaViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void render(PersonaModel personaModel){
        nombre.setText(personaModel.getPersonaNombre() + " " +
        personaModel.getPersonaApellidoPaterno() + " " +
        personaModel.getPersonaApellidoMaterno());
        telefono.setText(personaModel.getPersonaTelefono());
        correo.setText(personaModel.getPersonaCorreo());
        renderIconoItemPersona();
    }

    private void renderIconoItemPersona() {
        renderIconoNombrePersona(imageViewPersonaNombre);
        renderIconoTelefonoPersona(imageViewPersonaTelefono);
        renderIconoCorreoPersona(imageViewPersonaCorreo);
    }

    private void renderIconoCorreoPersona(ImageView imageView) {
        Picasso.with(getContext()).load(R.mipmap.ic_persona_correo).fit().centerCrop().into(imageView);
    }

    private void renderIconoTelefonoPersona(ImageView imageView) {
        Picasso.with(getContext()).load(R.mipmap.ic_persona_telefono).fit().centerCrop().into(imageView);
    }

    private void renderIconoNombrePersona(ImageView imageView) {
        Picasso.with(getContext()).load(R.mipmap.ic_persona_nombre).fit().centerCrop().into(imageView);
    }

    private Context getContext(){
        return itemView.getContext();
    }
}
