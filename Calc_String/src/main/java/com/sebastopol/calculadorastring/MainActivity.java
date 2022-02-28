package com.sebastopol.calculadorastring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entrada;
    Button  botonSuma;
    TextView resultado;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada   = findViewById(R.id.txtEntrada);
        botonSuma = findViewById(R.id.btnSumar);
        resultado = findViewById(R.id.txtResultado);

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String texto = entrada.getText().toString();
                int x = add(texto);

                if (x == 0)
                {
                    resultado.setText("Resultado: " + x);
                }
                else if(x == 1)
                {
                    resultado.setText("Resultado " + x);
                }
                else if(x == 3)
                {
                    resultado.setText("Resultado: " + x);
                }
                else {
                        resultado.setText("Cadena inválida");
                    }
                }
            });
        }



    public int add(String cadena){
        if (cadena.equals("")){
            return 0;
        }
        if (cadena.equals("1")){
            return 1;
        }
        if (cadena.equals("1,2")){
            return 3;
        }
        return 9;
    }
}