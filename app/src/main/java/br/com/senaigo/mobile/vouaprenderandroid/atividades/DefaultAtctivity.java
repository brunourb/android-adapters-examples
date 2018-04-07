package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Pessoa;

/**
 * Created by bruno on 07/04/18.
 */

public class DefaultAtctivity extends AppCompatActivity {

    public EditText txtNome;
    public EditText txtEmail;
    public EditText txtTelefone;
    public EditText txtSenha;
    public EditText txtConfirmaSenha;
    public List<Pessoa> lista = new ArrayList<>();
    public ListView minhaLista;

}
