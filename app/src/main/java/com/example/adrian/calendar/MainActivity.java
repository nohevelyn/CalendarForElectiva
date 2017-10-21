package com.example.adrian.calendar;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=(Button)findViewById(R.id.Boton_Prueba);
        boton.setText("Click en mi");
    }

    public void cambiarTexto(View v){

        String s="Esta es una prueba";
        TextView texto=(TextView) findViewById(R.id.TextQueDebeCambiar);
        texto.setText(s);
    }
}
