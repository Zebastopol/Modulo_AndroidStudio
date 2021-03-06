package com.sebastopol.ejemplotoolbar01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu)
        return super.onCreateOptionsMenu(menu)
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"seleccionó al usuario", Toast.LENGTH_SHORT).show();
            return true;
            case R.id.item2:
                Toast.makeText(this, "seleccionó la notifiación", Toast.LENGTH_SHORT).show();
            return true;
            case R.id.item3:
                Toast.makeText(this,"seleccionó ayuda", Toast.LENGTH_SHORT).show();
            return true;
            case R.id.item4:
                Toast.makeText(this,"seleccionó sobre",Toast.LENGTH_SHORT).show();
            return true;
         default:
        return super.onOptionsItemSelected(item);
        }
    }
}