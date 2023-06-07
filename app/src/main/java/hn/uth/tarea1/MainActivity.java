package hn.uth.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Numero1,Numero2;
    Button btnsumar,btnrestar,btnmultiplicar,btndividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numero1=findViewById(R.id.N1);
        Numero2=findViewById(R.id.N2);
        btnsumar=(Button)findViewById(R.id.btnsumar);
        btnrestar=(Button)findViewById(R.id.btnrestar);
        btnmultiplicar=(Button)findViewById(R.id.btnmultiplicar);
        btndividir=(Button)findViewById(R.id.btndividir);

        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(Numero1.getText().toString());
                int numero2 = Integer.parseInt(Numero2.getText().toString());
                int resultado = numero1 + numero2;
                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(Numero1.getText().toString());
                int numero2 = Integer.parseInt(Numero2.getText().toString());
                int resultado = numero1 - numero2;
                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(Numero1.getText().toString());
                int numero2 = Integer.parseInt(Numero2.getText().toString());
                int resultado = numero1 * numero2;
                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(Numero1.getText().toString());
                int numero2 = Integer.parseInt(Numero2.getText().toString());
                int resultado = numero1 / numero2;
                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("resultado", resultado);
                startActivity(intent);
            }
        });
















    }
}