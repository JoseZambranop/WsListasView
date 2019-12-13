package com.example.listasview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorContactos extends ArrayAdapter<contactos> {
    public AdaptadorContactos(Context context, contactos[] datos){
        super(context, R.layout.ly_contactos, datos);

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(getContext());
        View item= inflater.inflate(R.layout.ly_contactos, null);
        TextView lblTitulo= (TextView)item.findViewById(R.id.LblNombre);
        lblTitulo.setText(getItem(position).getNombre());
        TextView lblMobile= (TextView)item.findViewById(R.id.LblMobile);
        lblMobile.setText(getItem(position).getMobile());
        TextView lblHome= (TextView)item.findViewById(R.id.LblHome);
        lblHome.setText(getItem(position).getHome());
        TextView lblOffice= (TextView)item.findViewById(R.id.LblOffice);
        lblOffice.setText(getItem(position).getOffice());
        return(item);
    }



}
