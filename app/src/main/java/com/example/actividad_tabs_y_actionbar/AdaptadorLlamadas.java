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

public class AdaptadorLlamadas extends ArrayAdapter<Llamadas> {
    private Context context ;
    private Llamadas[] llamadas;

    public AdaptadorLlamadas(@NonNull Context context, Llamadas[] resource) {
        super(context, R.layout.listview_llamadas,resource);

        this.context = context;
        this.llamadas = resource;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_llamadas, null);

        TextView tvNomweb = item.findViewById(R.id.TextViewNombre);
        TextView TextViewNum = item.findViewById(R.id.TextViewNum);
        TextView TextViewHora = item.findViewById(R.id.TextViewHora);
        ImageView image = item.findViewById(R.id.imageView);

        Contactos contactos = llamadas[position].getContacto();

        tvNomweb.setText(contactos.getNombre());
        TextViewNum.setText(contactos.getNumero()+"");
        TextViewHora.setText(llamadas[position].getHora());

        image.setImageResource(llamadas[position].getIDDireccion());
        return item;
    }



}

