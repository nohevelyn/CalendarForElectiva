package com.example.adrian.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registro1 extends Activity {

    private TextView lblGotoLogin;
    private Button btnRegister;
    private EditText inputUserName;
    private EditText inputEmail;
    private EditText inputPassword;
    private EditText inputPassword2;
    private TextView registerErrorMsg;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro1);

        inputUserName = (EditText) findViewById(R.id.txtUserName);
        inputEmail = (EditText) findViewById(R.id.txtEmail);
        inputPassword = (EditText) findViewById(R.id.txtPass);
        inputPassword2 = (EditText) findViewById(R.id.txtPass2);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        registerErrorMsg = (TextView) findViewById(R.id.register_error);
        lblGotoLogin=(TextView) findViewById(R.id.link_to_login);

        btnRegister.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                String correo=inputEmail.getText().toString().replace(" ","");
                String usuario=inputUserName.getText().toString().replace(" ","");
                String pass1=inputPassword.getText().toString().replace(" ","");
                String pass2=inputPassword2.getText().toString().replace(" ","");
                if(correo.equalsIgnoreCase("")||usuario.equalsIgnoreCase("")||pass1.equalsIgnoreCase("")||pass2.equalsIgnoreCase("")){
                    if (correo.equalsIgnoreCase("")){
                        inputEmail.setError("Campo no puede estar vacio");
                    }
                    if (usuario.equalsIgnoreCase("")){
                        inputUserName.setError("Campo no puede estar vacio");
                    }
                    if (pass1.equalsIgnoreCase("")){
                        inputPassword.setError("Campo no puede estar vacio");
                    }
                    if(pass2.equalsIgnoreCase("")){
                        inputPassword2.setError("Campo no puede estar vacio");
                    }
                }
                else if(pass1.length()<6){
                    inputPassword.setError("Contraseña debe tener minimo 6 caracteres");
                }
                else if (pass1!=pass2){
                    inputPassword2.setError("Contraseña no coincide");
                }
                else{
                    //aqui va verificacion de correo y llamas al ws
                }
            }
        });

        lblGotoLogin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent (view.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

    }

    public boolean VerificaCorreoValido(String correo){
        return false;
    }


}
