package cl.stomas.greenmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    Button btvolver;
    TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvresultado = findViewById(R.id.tvResultado);
        String resultado = getIntent().getStringExtra("resultado");
        tvresultado.setText(resultado);
        btvolver = findViewById(R.id.btnVolver);

        Intent intent = new Intent(this, MainActivity.class);

        //CREAR BOTÓN VOLVER
        btvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}