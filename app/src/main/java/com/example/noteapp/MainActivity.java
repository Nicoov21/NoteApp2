package com.example.noteapp;

import android.icu.text.Edits;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> alista = new ArrayList<>();
    EditText nota;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota = findViewById(R.id.editTextTextPersonName);
        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!nota.getText().toString().isEmpty()){
                    alista.add(nota.getText().toString());
                    Iterator<String> it = alista.iterator();
                    while(it.hasNext()){
                        String notaactu = it.next();
                        Toast.makeText(MainActivity.this, "Nota:" + notaactu, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
//HOla Conny