package com.example.steph.to_buy_it;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button bRegisto;
    EditText etNome,etIdade, etNomeUtilizador,etPalavraPasse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNome = (EditText) findViewById(R.id.etNome);
        etIdade = (EditText) findViewById(R.id.etIdade);
        etNomeUtilizador = (EditText) findViewById(R.id.etNomeUtilizador);
        etPalavraPasse  = (EditText) findViewById(R.id.etPalavraPasse);
        bRegisto = (Button) findViewById(R.id.bRegisto);

        bRegisto.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bRegisto:

                String name = etNome.getText().toString();
                String nomeUtlizador = etNomeUtilizador.getText().toString();
                String palavraPasse = etPalavraPasse.getText().toString();

                int idade = Integer.parseInt(etIdade.getText().toString());

                User registeredData = new User (name,idade,nomeUtlizador,palavraPasse);

                break;

        }
    }

}
