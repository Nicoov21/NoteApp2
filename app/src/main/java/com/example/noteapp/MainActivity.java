package com.example.noteapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> alista = new ArrayList<String>();
    EditText nota;
    RecyclerView recyclerView;
    Button boton, btneliminar;
    AdaptadorNota adapter;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variables definidas
        nota = findViewById(R.id.txtNota);
        boton = findViewById(R.id.btn);
        btneliminar = findViewById(R.id.btnBorrar);
        recyclerView = findViewById(R.id.notaslistas);
        spinner = findViewById(R.id.spinnernotas);

        //Instancias del adaptador para el recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdaptadorNota(alista);
        recyclerView.setAdapter(adapter);

        //Datos para el spinner
        ArrayAdapter<String> datosspinner = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, alista);
        datosspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(datosspinner);

        //Metodos para el boton de agregar
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nota.getText().toString().isEmpty()){
                    alista.add(nota.getText().toString());
                    adapter.notifyDataSetChanged();
                    datosspinner.notifyDataSetChanged();
                    nota.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "No pueden quedar campos vacíos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //Metodos para el boton de eliminar
        btneliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seleccion = (String) spinner.getSelectedItem();
                int posicion = alista.indexOf(seleccion);
                if(posicion != -1){
                    alista.remove(posicion);
                    adapter.notifyDataSetChanged();
                    datosspinner.notifyDataSetChanged();
                }else{
                    Toast.makeText(MainActivity.this, "Debes seleccionar una nota", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
//HOla Conny