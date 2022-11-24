package com.example.enimalsupcriptio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enimalsupcriptio.Modelos.Animal;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderDatos>{

    List<Animal> listaDatos;

    public Adaptador(List<Animal> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_animal,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolderDatos holder, int position) {
        holder.asignarDatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public static class ViewHolderDatos extends RecyclerView.ViewHolder{

        TextView  numero, tipo, arete, pariciones, fechaTipoSexo, hijoHija, anioNacimiento, raza, observaciones;

        public ViewHolderDatos(@NonNull View itemView)
        {
            super(itemView);
            numero=itemView.findViewById(R.id.textViewNumero);
            tipo=itemView.findViewById(R.id.textViewTipo);
            arete=itemView.findViewById(R.id.textViewArete);
            pariciones=itemView.findViewById(R.id.textViewPariciones);
            fechaTipoSexo=itemView.findViewById(R.id.textViewFechaTipoSexo);
            hijoHija=itemView.findViewById(R.id.textViewHijoHija);
            anioNacimiento=itemView.findViewById(R.id.textViewAnioNacimiento);
            raza=itemView.findViewById(R.id.textViewRaza);
            observaciones=itemView.findViewById(R.id.textViewObservaciones);
        }

        public void asignarDatos(Animal a){
            numero.setText(a.getNumero());
            tipo.setText(a.getTipo());
            arete.setText(a.getArete());
            pariciones.setText(a.getPariciones());
            fechaTipoSexo.setText(a.getFechaTipoSexo());
            hijoHija.setText(a.getHijoHija());
            anioNacimiento.setText(a.getAnioNacimiento());
            raza.setText(a.getRaza());
            observaciones.setText(a.getObservaciones());
        }
    }
}
