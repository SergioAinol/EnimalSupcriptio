package com.example.enimalsupcriptio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderDatos>{

    ArrayList<String> listaDatos;

    public Adaptador(ArrayList<String> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public Adaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista,null,false);
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

    public class ViewHolderDatos extends RecyclerView.ViewHolder{

        TextView itemNumero,itemTipoAnimal,itemArete,itemPariciones,itemFecha,itemHijos,itemNacimiento ;
        RadioButton itemRadioBtn;

        public ViewHolderDatos(@NonNull View itemView)
        {
            super(itemView);
            itemNumero=itemView.findViewById(R.id.txtNumeroLista);
            itemTipoAnimal=itemView.findViewById(R.id.txtTipoAnimalLista);
            itemArete=itemView.findViewById(R.id.txtAreteLista);
            itemPariciones=itemView.findViewById(R.id.txtParicionesLista);
            itemFecha=itemView.findViewById(R.id.txtFechaLista);
            itemHijos=itemView.findViewById(R.id.txtHijosLista);
            itemNacimiento=itemView.findViewById(R.id.txtNacimientoLista);
            itemRadioBtn=itemView.findViewById(R.id.radioBSeleccionarLista);
        }

        public void asignarDatos(String s){

        }
    }
}
