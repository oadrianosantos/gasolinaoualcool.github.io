package com.adrianosantosdev.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textoResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editalcool);
        editPrecoGasolina = findViewById(R.id.editgasolina);
        textoResultado = findViewById(R.id.editresultado);

    }

    public void calcularPreco(View view){
        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

    /*Preçodoalcool/preçogasolina
    Se resultado >= 0,7 -> Gasolina
    Se não -> alcool
     */
        Double resultado = precoAlcool/precoGasolina;

        if (resultado >= 0.7){
            textoResultado.setText("Melhor é Gasolina");}
        else { textoResultado.setText("Melhor é Álcool");}
    }
}