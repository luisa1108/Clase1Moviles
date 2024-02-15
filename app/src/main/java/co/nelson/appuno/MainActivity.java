package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView nombreUsuario;
   Button btn1, btn2, send;
   String Tag = "Prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        send = findViewById(R.id.btnsend);

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

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pasarIndormacion();
                String textoActual = nombreUsuario.getText().toString();
                //String nombre = "Juan Carlos";
                Intent pasarInfo = new Intent(this, PantallaDos.class);
                pasarInfo.putExtra("name", nombre);
                startActivity(pasarInfo);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Estoy en onStart");

        
        /*
        private void pasarIndormacion(){
        String textoActual = nombreUsuario.getText().toString();
                //String nombre = "Juan Carlos";
                Intent pasarInfo = new Intent(this, PantallaDos.class);
                pasarInfo.putExtra("name", nombre);
                startActivity(pasarInfo);
        }*/
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

    /*
    @Override
    public void onClick(View view){
        if(!user.getText().toString().isEmpty() && !password.getText().)
        Toast.maketext(MainActivity.this, "Correctos"),
        //Crear alarma
        enviarPantallaDos();
    }

    @Override
    private void enviarPantallaDos(){
        String pass = password.getText().toString();
        Intent intent = new Intent(this, PantallaDos.class);
        intent.putExtra("password", pass);
        startActivity(intent);
        log.i("intent", "" + pass);
    }*/
}