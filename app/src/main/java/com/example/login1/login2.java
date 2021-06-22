package com.example.login1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login2 extends AppCompatActivity {

    EditText etUser, etPass;
    Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        etUser = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPass);

        btnLogIn = (Button) findViewById(R.id.btnLog);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });
    }
    public void Check() {
        if (etUser.getText().toString().equals("Juan") && etPass.getText().toString().equals("123456")) {
            Toast.makeText(this, "Bienvenido",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Acceso Denegado",Toast.LENGTH_LONG).show();
        }
    }
}