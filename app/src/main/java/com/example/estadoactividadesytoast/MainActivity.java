package com.example.estadoactividadesytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String ETIQUETA = "ESTADOACTIVADES2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(ETIQUETA, "Estoy en onCreate");
        Toast.makeText(this, "Estoy en onCreate", Toast.LENGTH_LONG).show();
    }
}