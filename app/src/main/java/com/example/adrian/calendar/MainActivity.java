package com.example.adrian.calendar;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {
    private TextView lblGotoRegister;
    private Button btnLogin;
    private EditText inputUsuario;
    private EditText inputPassword;
    private TextView loginErrorMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsuario = (EditText) findViewById(R.id.txtUsuario);
        inputPassword = (EditText) findViewById(R.id.txtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        loginErrorMsg = (TextView) findViewById(R.id.login_error);
        lblGotoRegister = (TextView) findViewById(R.id.link_to_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String usuario = inputUsuario.getText().toString().replace(" ","");
                String password = inputPassword.getText().toString().replace(" ","");
                if(usuario.equalsIgnoreCase("")||password.equalsIgnoreCase("")){
                    if(usuario.equalsIgnoreCase("")){
                        inputUsuario.setError("Campo no puede estar vacio");
                    }
                    if(password.equalsIgnoreCase("")){
                        inputPassword.setError("Campo no puede estar vacio");
                    }
                }
                else{
                    //aqui llamamos al controlador donde este el WS
                }
                Toast.makeText(MainActivity.this,"No existe cuenta relacionada", Toast.LENGTH_SHORT).show();
            }
        });

        lblGotoRegister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent (view.getContext(), registro1.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}

