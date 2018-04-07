package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Pessoa;

public class ArrayAdapterExemplo extends DefaultAtctivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter_exemplo);
    }

    public void adicionar(View view) {

        //ENTRADA DE DADOS
        //Captura o componente EditText da VIEW
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtSenha = findViewById(R.id.txtTelefone);
        txtConfirmaSenha = findViewById(R.id.txtConfirmaSenha);

        String nome, email, telefone, senha, confirmarSenha;

        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();
        telefone = txtTelefone.getText().toString();
        senha = txtSenha.getText().toString();
        confirmarSenha = txtConfirmaSenha.getText().toString();

        Pessoa pessoa = new Pessoa(nome, email, telefone, senha);

        lista.add(pessoa);

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);

        //ARRAY ADAPTER
        ArrayAdapter<Pessoa> arrayAdapter =
                new ArrayAdapter<Pessoa>(this,
                        android.R.layout.simple_list_item_1, lista);
        minhaLista.setAdapter(arrayAdapter);
    }
}
