package com.example.noteapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorNota extends RecyclerView.Adapter<AdaptadorNota.NotaViewHolder> {
    ArrayList<String> notitas;

    public AdaptadorNota(ArrayList<String> notitas) {
        this.notitas = notitas;
    }

    @NonNull
    @Override
    public AdaptadorNota.NotaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        TextView texto = new TextView(viewGroup.getContext());
        texto.setTextSize(16);
        texto.setPadding(8,8,8,8);
        return new NotaViewHolder(texto);
    }

    @Override
    public void onBindViewHolder(@NonNull NotaViewHolder notaViewHolder, int i) {
        notaViewHolder.bind(notitas.get(i));
    }

    @Override
    public int getItemCount() {
        return notitas.size();
    }

    public static class NotaViewHolder extends RecyclerView.ViewHolder{
        TextView notatexto;

        public NotaViewHolder(@NonNull TextView itemView) {
            super(itemView);
            notatexto = itemView;
        }

        public void bind(String nota){
            notatexto.setText(nota);
        }
    }
}
