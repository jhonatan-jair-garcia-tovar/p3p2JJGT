package com.mx.isc.edu.p3p2jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    GridView gvdatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        gvdatos=findViewById(R.id.gvdatos);
        String[] arreglo =new String[]{
                "num1","num2","num3","mun4",
                "num5","num6","num7","mun8",
                "num7","num10","num11","mun12",
                "num13","num14","num15","mun16",
                "num17","num18","num19","mun20"
        };
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arreglo);
        gvdatos.setAdapter(adapter);
    }
}
