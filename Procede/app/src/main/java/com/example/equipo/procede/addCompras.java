package com.example.equipo.procede;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class addCompras extends AppCompatActivity {

    Spinner lista1 ;
    Spinner lista2 ;
    String [] datos1 = {"ADECCO CONSULTING ","AMERICATEL PERU S.A.","BDO CONSULTING S.A.C"};
    String [] datos2 = {"Colores","Aconcagua","Galletas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ventas);
        lista1 = (Spinner)findViewById(R.id.spinner1);
        lista2= (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos1);
        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos2);
        lista1.setAdapter(adaptador1);
        lista2.setAdapter(adaptador2);



    }
}