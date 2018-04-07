package br.com.senaigo.mobile.vouaprenderandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Pessoa;

/**
 * Created by bruno on 07/04/18.
 */

public class PessoaAdapter extends BaseAdapter {


    Context context;
    List<Pessoa> colecao;
    LayoutInflater inflter;

    public PessoaAdapter(final Context applicationContext,
                         final List<Pessoa> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }

    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Pessoa parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_pessoa,
                            viewGroup, false);
        }

        // pega o objeto corrente da lista
        Pessoa pessoa = parsetItem(i);

        //Neste ponto vc ira popular os dados do seu layout,
        //utilizando JAVA.

        TextView campoNome, campoEmail;

        //CASO não queria declarar um campo
        //((TextView)view.findViewById(R.id.txtItemNome)).setText(pessoa.getNome());

        campoNome = view.findViewById(R.id.txtItemNome);
        campoEmail = view.findViewById(R.id.txtItemEmail);

        campoNome.setText(pessoa.getNome());
        campoEmail.setText(pessoa.getEmail());

        return view;
    }
}
