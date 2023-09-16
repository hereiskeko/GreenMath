package cl.stomas.greenmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //DECLARACIÓN DE VARIABLES
    Button btcalcular,btlimpiar;
    EditText etprecioverduras,ettotalhectarea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcalcular = (Button) findViewById(R.id.btnCalcular);
        btlimpiar = (Button) findViewById(R.id.btnLimpiar);
        etprecioverduras = (EditText) findViewById(R.id.etPrecioVerdura);
        ettotalhectarea = (EditText) findViewById(R.id.etTotalHectarea);


        //BOTÓN CALCULAR
        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                int iprecioverduras = Integer.parseInt(etprecioverduras.getText().toString());
                int itotalhectarea = Integer.parseInt(ettotalhectarea.getText().toString());
                int multipli = iprecioverduras * itotalhectarea;

                String multiplicacion = String.valueOf(multipli);
                intent.putExtra("resultado",multiplicacion.toString());
                startActivity(intent);

            }
        });

        //BOTÓN LIMPIAR
        btlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etprecioverduras.setText("");
                ettotalhectarea.setText("");
            }
        });

    }
}