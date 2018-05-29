package com.example.steph.to_buy_it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button blogin;
    EditText etUsername,etPassword;
    TextView tvRegistoLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etNomeUtilizador);
        etPassword = (EditText) findViewById(R.id.etPalavraPasse);
        blogin = (Button) findViewById(R.id.blogin);
        tvRegistoLink = (TextView) findViewById(R.id.tvRegistoLink);

        blogin.setOnClickListener(this);
        tvRegistoLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.blogin:

                break;

            case R.id.tvRegistoLink:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}
