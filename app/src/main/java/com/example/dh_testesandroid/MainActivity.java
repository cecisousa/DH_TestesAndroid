package com.example.dh_testesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText nota1EditText;
    private EditText nota2EditText;
    private EditText nota3EditText;
    private EditText nota4EditText;
    private Button calcularNota;
    private TextView notaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        calcularNota.setOnClickListener(view -> {

            Float nota1 = Float.parseFloat(nota1EditText.getEditableText().toString());
            Float nota2 = Float.parseFloat(nota2EditText.getEditableText().toString());
            Float nota3 = Float.parseFloat(nota3EditText.getEditableText().toString());
            Float nota4 = Float.parseFloat(nota4EditText.getEditableText().toString());

            Float media = calculaMedia(nota1, nota2, nota3, nota4);
            notaFinal.setText(String.format("Nota final: %s", media));
        });
    }

    private void initViews() {
        nota1EditText = findViewById(R.id.nota1_editText);
        nota2EditText = findViewById(R.id.nota2_editText);
        nota3EditText = findViewById(R.id.nota3_editText);
        nota4EditText = findViewById(R.id.nota4_editText);
        calcularNota = findViewById(R.id.btnCalcularMedia);
        notaFinal = findViewById(R.id.resultadoMedia);



    }

    //    public Float calculaMedia(Float nota1, Float nota2, Float nota3, Float nota4){
//        Float media = (nota1 + nota2 + nota3 + nota4) / 4;
//        return media;

    public Float calculaMedia(Float nota1, Float nota2, Float nota3, Float nota4){
        return (nota1 + nota2 + nota3 + nota4)/4;
    }

}
