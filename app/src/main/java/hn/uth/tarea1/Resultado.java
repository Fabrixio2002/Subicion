package hn.uth.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        respuesta=(TextView) findViewById(R.id.respuesta);


        Intent intent = getIntent();
        int resultado = intent.getIntExtra("resultado", 0);
        respuesta.setText(String.valueOf(resultado));


    }
}