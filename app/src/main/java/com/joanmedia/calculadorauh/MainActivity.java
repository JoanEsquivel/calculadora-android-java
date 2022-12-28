package com.joanmedia.calculadorauh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView lblName;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblName = findViewById(R.id.lblNombreEstudiante);
        btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String estudiante = lblName.getText().toString();

                Toast.makeText(MainActivity.this, "El estudiante es: " + estudiante, Toast.LENGTH_SHORT).show();

                Intent pasarPantalla = new Intent(MainActivity.this, Calculadora.class);
                pasarPantalla.putExtra("NOMBRE_ESTUDIANTE", estudiante);
                startActivity(pasarPantalla);
            }
        });
    }




//    lblName = findViewById(R.id.lblNombreEstudiante)
//
}