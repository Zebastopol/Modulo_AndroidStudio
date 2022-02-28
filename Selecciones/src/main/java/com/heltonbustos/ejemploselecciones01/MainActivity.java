package com.heltonbustos.ejemploselecciones01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEscoger;
    RadioButton rdJava;
    RadioButton rdKotlin;

    Button btnSaber;
    CheckBox chPlay, chXbox, chNintendo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEscoger = findViewById(R.id.btnEscoger);
        rdJava = findViewById(R.id.rdJava);
        rdKotlin = findViewById(R.id.rdKotlin);

        btnEscoger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rdJava.isChecked()){
                    Toast.makeText(MainActivity.this, "Usted ha seleccionado JAVA", Toast.LENGTH_SHORT).show();
                }
                if(rdKotlin.isChecked()){
                    Toast.makeText(MainActivity.this, "Usted ha seleccionado KOTLIN", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSaber = findViewById(R.id.btnSaber);
        chPlay = findViewById(R.id.chPlay);
        chXbox = findViewById(R.id.chXbox);
        chNintendo = findViewById(R.id.chNintendo);

        btnSaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seleccion = "Elegiste: ";

                if(chPlay.isChecked()){
                    seleccion += "Play Station - ";
                }
                if(chXbox.isChecked()){
                    seleccion += "Xbox - ";
                }
                if(chNintendo.isChecked()){
                    seleccion += "Nintendo";
                }

                if (seleccion.equals("Elegiste: ")){
                    seleccion = "Debe seleccionar al menos una opción de consolas";
                }

                Toast.makeText(MainActivity.this, seleccion, Toast.LENGTH_SHORT).show();
            }
        });

    }
}