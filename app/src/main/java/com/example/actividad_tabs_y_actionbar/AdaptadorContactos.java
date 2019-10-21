package com.example.actividad_tabs_y_actionbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdaptadorContactos  extends ArrayAdapter<Contactos>{
    private Context context ;
    private Contactos[] contactos;

    public AdaptadorContactos(@NonNull Context context, Contactos[] resource) {
        super(context, R.layout.listview_contactos,resource);

        this.context = context;
        this.contactos = resource;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_contactos, null);

        TextView tvNomweb = item.findViewById(R.id.TextViewNombre);
        TextView tvEstado = item.findViewById(R.id.TextViewEstado);
        TextView TextViewNum = item.findViewById(R.id.TextViewNum);
        ImageView image = item.findViewById(R.id.imageView);


        tvNomweb.setText(contactos[position].getNombre());
        tvEstado.setText(contactos[position].getEstado());
        TextViewNum.setText(contactos[position].getNumero()+"");
        image.setImageResource(contactos[position].getFoto());
        return item;
    }

}