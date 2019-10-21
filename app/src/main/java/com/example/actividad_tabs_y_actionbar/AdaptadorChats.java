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

public class AdaptadorChats extends ArrayAdapter<Chats> {

    private Context context ;
    private Chats[] chats;

    public AdaptadorChats(@NonNull Context context, Chats[] resource) {
        super(context, R.layout.listview_chats,resource);

        this.context = context;
        this.chats = resource;

    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.listview_chats, null);

        TextView tvNomchat = item.findViewById(R.id.TextViewNombreChat);
        TextView tvDescripcion = item.findViewById(R.id.TextViewDesc);
        ImageView image = item.findViewById(R.id.imageView);


        tvNomchat.setText(chats[position].getNombre());
        tvDescripcion.setText(chats[position].getEstado());
        image.setImageResource(chats[position].getFoto());
        return item;
    }

}