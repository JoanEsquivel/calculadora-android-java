package com.joanmedia.calculadorauh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    TextView lblNombre;
    EditText operando1;
    EditText operando2;
    Button suma;
    Button resta;
    Button multiplicacion;
    Button dividir;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        lblNombre = findViewById(R.id.lblNombreEstudianteCalculadora);
        suma = findViewById(R.id.btnSumar);
        resta = findViewById(R.id.btnRestar);
        multiplicacion = findViewById(R.id.btnMultiplicar);
        dividir = findViewById(R.id.btnDividir);
        resultado = findViewById(R.id.lblResultado);




        Intent obtenerDatos = getIntent();
        String nombreEstudiante = obtenerDatos.getStringExtra("NOMBRE_ESTUDIANTE");

        lblNombre.setText(nombreEstudiante);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando1 = findViewById(R.id.otOperando1);
                operando2 = findViewById(R.id.otOperando2);

                String op1 = operando1.getText().toString();
                String op2 = operando2.getText().toString();

                if(op1.equals("") || op2.equals("")){
                    Toast.makeText(Calculadora.this, "Ambos operandos deben tener un valor numeral", Toast.LENGTH_LONG).show();
                }else{
                    int result = Integer.parseInt(op1) + Integer.parseInt(op2);
                    resultado.setText(Integer.toString(result));
                }


            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando1 = findViewById(R.id.otOperando1);
                operando2 = findViewById(R.id.otOperando2);

                String op1 = operando1.getText().toString();
                String op2 = operando2.getText().toString();

                if(op1.equals("") || op2.equals("")){
                    Toast.makeText(Calculadora.this, "Ambos operandos deben tener un valor numeral", Toast.LENGTH_LONG).show();
                }else {
                    int result = Integer.parseInt(op1) - Integer.parseInt(op2);
                    resultado.setText(Integer.toString(result));
                }
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando1 = findViewById(R.id.otOperando1);
                operando2 = findViewById(R.id.otOperando2);

                String op1 = operando1.getText().toString();
                String op2 = operando2.getText().toString();

                if(op1.equals("") || op2.equals("")){
                    Toast.makeText(Calculadora.this, "Ambos operandos deben tener un valor numeral", Toast.LENGTH_LONG).show();
                }else {
                    int result = Integer.parseInt(op1) * Integer.parseInt(op2);
                    resultado.setText(Integer.toString(result));
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operando1 = findViewById(R.id.otOperando1);
                operando2 = findViewById(R.id.otOperando2);

                String op1 = operando1.getText().toString();
                String op2 = operando2.getText().toString();

                if(op1.equals("") || op2.equals("")){
                    Toast.makeText(Calculadora.this, "Ambos operandos deben tener un valor numeral", Toast.LENGTH_LONG).show();
                }else {
                    int result = Integer.parseInt(op1) / Integer.parseInt(op2);
                    resultado.setText(Integer.toString(result));
                }
            }
        });


    }
}