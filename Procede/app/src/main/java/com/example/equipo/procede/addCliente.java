package com.example.equipo.procede;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class addCliente extends AppCompatActivity {
    Spinner lista1;
    String [] datos1 = {"administrador","profesor","nuevo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cliente);

    }
}
