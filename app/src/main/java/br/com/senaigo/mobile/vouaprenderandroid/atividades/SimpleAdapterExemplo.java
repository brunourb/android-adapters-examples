package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Pessoa;

public class SimpleAdapterExemplo extends DefaultAtctivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_exemplo);
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

        //PROCESSAMENTO
        //Convertendo a lista em um List<HashMap<String,String>
        //para o simpleAdapter

        List<String> colecaoArrayAdapter = new ArrayList<>();

        List<HashMap<String, String>> colecao = new ArrayList<>();
        //criando colecao para o adapter
        for (Pessoa p : lista) {
            HashMap<String, String> map = new HashMap<>();
            map.put("nome", p.getNome());
            map.put("email", p.getEmail());
            map.put("telefone", p.getTelefone());
            map.put("senha", p.getSenha());

            colecao.add(map);
            colecaoArrayAdapter.add(p.getNome());
        }

        //Fazer o mapeamento da colecao com o layout do item
        String[] de = {"nome", "email", "telefone"};
        int[] para = {R.id.txtItemNome, R.id.txtItemEmail, R.id.txtItemTelefone};

        //SAIDA

        minhaLista = findViewById(R.id.minhaLista);

        //SIMPLE ADAPTER
        SimpleAdapter adapter =
                new SimpleAdapter(this,colecao,
                        R.layout.item,de,para);


        minhaLista.setAdapter(adapter);

    }
}
