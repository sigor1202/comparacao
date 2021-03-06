package com.igor.comparao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void comparar(View view){
    EditText texto1=findViewById(R.id.valor1);
    EditText texto2=findViewById(R.id.valor2);
    TextView textoR=findViewById(R.id.resultado);
    int valor1=Integer.parseInt(texto1.getText().toString());
    int valor2=Integer.parseInt(texto2.getText().toString());
    if (valor1<valor2){
    textoR.setText("Ps5");
    }
    else if (valor2<valor1){
        textoR.setText("xbox");
    }

    else{
        textoR.setText("os valores são iguais");
    }
}
}