package com.sebastopol.ejemplo_listviewpersonalizado00;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactoAdaptador extends BaseAdapter {

    Context context;
    List<Contacto> lst;

    public ContactoAdaptador(Context context, List<Contacto> lst) {
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageViewContacto;
        TextView textViewNombre;
        TextView textViewDes;

        Contacto c = lst.get(i);
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.lst_frutas, null);
        }

        imageViewContacto = view.findViewById(R.id.imContacto);
        textViewNombre = view.findViewById(R.id.txtNombre);
        textViewDes = view.findViewById(R.id.txtDes);

        imageViewContacto.setImageResource(c.getImagen());
        textViewNombre.setText(c.getNombre());
        textViewDes.setText(c.getDes());


        return view;
    }
}
