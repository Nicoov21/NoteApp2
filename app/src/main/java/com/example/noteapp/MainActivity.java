package com.example.noteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Struct;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> alista = new ArrayList<String>();
    RecyclerView lista;
    EditText nota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota = findViewById(R.id.editTextTextPersonName);
        lista = findViewById(R.id.Notas);
    }
}
//HOla Conny