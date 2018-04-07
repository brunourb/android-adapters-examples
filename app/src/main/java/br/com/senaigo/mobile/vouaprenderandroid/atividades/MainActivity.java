package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.content.Intent;
import android.sax.TextElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void simpleAdapterExemplo(View view) {

        startActivity(new Intent(this,SimpleAdapterExemplo.class));
    }

    public void arrayAdapterExemplo(View view) {
        startActivity(new Intent(this,ArrayAdapterExemplo.class));
    }

    public void baseAdapterExemplo(View view) {
        startActivity(new Intent(this,BaseAdapterExemplo.class));
    }
}
