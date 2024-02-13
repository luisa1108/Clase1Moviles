package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1,btn2;
   String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /*public double calcularArea(int l1,int l2){
        return l1*l2;
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Estoy en onStart");
        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Uno");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario.setText("Presioné Boton Dos");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "Estoy en onResume");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "Estoy en onPause");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "Estoy en onStop");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "Estoy en onRestart");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "Estoy en onDestroy");
        nombreUsuario.setText(nombreUsuario.getText().toString() + "Estoy en onDestroy");
    }
}