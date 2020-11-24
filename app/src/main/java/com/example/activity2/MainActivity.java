package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button actividad2;
Button btn_toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
actividad2=(findViewById(R.id.button));
btn_toast=findViewById(R.id.button1);
//asociamos las id de los respectivos botones
actividad2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent actividad2 =new Intent(MainActivity.this,actividad2.class);
        startActivity(actividad2);
        Toast.makeText(MainActivity.this, "Bienvenido a la actividad 2", Toast.LENGTH_SHORT).show();//Declaramos el Toast básico
    }
});

btn_toast.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
View toast =MainActivity.this.getLayoutInflater().inflate(R.layout.custom_toast,null);//creamos un atributo tipo view y le pasamos el layout cargado con el inflate
Toast t =new Toast(getApplicationContext());//Creamos el toats
t.setView(toast);//mostramos la vista con el nombre toast que cargue o inflé con el getInflayerLayout llamada custom_toast
t.setGravity(Gravity.TOP,0,250);
t.setDuration(Toast.LENGTH_SHORT);
t.show();
    }
});

}

protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this,"Start",Toast.LENGTH_SHORT).show();
}
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();
    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
    }
    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

}
