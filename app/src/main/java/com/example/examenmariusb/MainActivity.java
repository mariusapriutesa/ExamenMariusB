package com.example.examenmariusb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private Spinner spinner_zona;
    private EditText et_cantidad2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_cantidad2=(EditText)findViewById(R.id.et_cantidad);
        spinner_zona=(Spinner) findViewById(R.id.sp1);
        String [] opciones = {"ZONA GENERAL","ZONA GOLES","ZONA ANFITREATO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_zonas,opciones);
        spinner_zona.setAdapter(adapter);


    }


}