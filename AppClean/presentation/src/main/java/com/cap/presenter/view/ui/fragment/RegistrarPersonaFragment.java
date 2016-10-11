package com.cap.presenter.view.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.cap.presenter.R;
import com.cap.presenter.presenter.RegistrarPersonaPresenter;
import com.cap.presenter.view.RegistrarPersonaView;
import com.cap.presenter.viewmodel.PersonaModel;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by CAP on 30/09/2016.
 */

public class RegistrarPersonaFragment extends BaseFragment implements RegistrarPersonaView{


    @BindView(R.id.etNombre)
    EditText nombreEt;

    @BindView(R.id.etApellidoPaterno)
    EditText apellidoPaternoEt;

    @BindView(R.id.etApellidoMaterno)
    EditText apellidoMaternoEt;

    @BindView(R.id.etCorreo)
    EditText correoEt;

    @BindView(R.id.etTelefono)
    EditText telefonoEt;

    private RegistrarPersonaPresenter registrarPersonaPresenter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_registrar_persona;
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
        registrarPersonaPresenter = new RegistrarPersonaPresenter();
        registrarPersonaPresenter.setView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        registrarPersonaPresenter.destroy();
    }

    @Override
    public void showRegistroPersonaSuccess(String mensaje) {
        Toast.makeText(getContext(),mensaje,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showValidacionCampos(String mensaje) {
        Toast.makeText(getContext(),mensaje,Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.fabRegistrarPersona)
    void onClickRegistrarPersona(){
        registrarPersonaPresenter.setDatosPersonaModel(
                nombreEt.getText().toString(),
                apellidoPaternoEt.getText().toString(),
                apellidoMaternoEt.getText().toString(),
                correoEt.getText().toString(),
                telefonoEt.getText().toString());
        limpiarCamposRegistrarPersona();
    }

    private void limpiarCamposRegistrarPersona(){
        nombreEt.setText("");
        apellidoPaternoEt.setText("");
        apellidoMaternoEt.setText("");
        correoEt.setText("");
        telefonoEt.setText("");
    }

    @Override
    public Context context() {
        return getActivity().getApplication();
    }
}
