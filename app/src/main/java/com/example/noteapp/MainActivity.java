package com.example.noteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView NotasEscritas;
    Button Mostrar;
    Button Borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotasEscritas = findViewById(R.id.VisualizarNotasAqui);
        Mostrar = findViewById(R.id.btnVerNotas);
        Borrar = findViewById(R.id.btnEliminarNotas);
        Mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MostrarNotas();

            }
        });

        Borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BorrarNotas();
            }
        });

    }
    public void MostrarNotas(){
        if (){
            NotasEscritas.setText();
        }
    }

    public void BorrarNotas(){


    }
}
