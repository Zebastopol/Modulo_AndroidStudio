package com.sebastopol.ejemplo_listviewpersonalizado00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listViewContacto;
    List<Contacto> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewContacto = findViewById(R.id.lstlistViewContacto);

        lst = new ArrayList<>();
        lst.add(new Contacto(1,R.drawable.uno,"Juan","Este es Juanito Punk"));
        lst.add(new Contacto(2,R.drawable.uno,"Marta","Esta es Martita Punk"));
        lst.add(new Contacto(3,R.drawable.uno,"María","Esta es Marita Punk"));
        lst.add(new Contacto(4,R.drawable.uno,"Pedro","Este es Pedrito Punk"));
        lst.add(new Contacto(5,R.drawable.uno,"Roberto","Este es Robertito Punk"));
        lst.add(new Contacto(6,R.drawable.uno,"Paulina","Este es Paulinita Punk"));
        lst.add(new Contacto(7,R.drawable.uno,"Ana","Este es Anita Punk"));
        lst.add(new Contacto(8,R.drawable.uno,"Luis","Este es Luchito Punk"));

        ContactoAdaptador adaptador = new ContactoAdaptador(this, lst);
        listViewContacto.setAdapter(adaptador);

        listViewContacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Contacto c = lst.get(i);
                Toast.makeText(MainActivity.this,c.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}