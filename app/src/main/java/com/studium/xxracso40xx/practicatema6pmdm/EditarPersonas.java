package com.studium.xxracso40xx.practicatema6pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class EditarPersonas extends AppCompatActivity
{
    ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6;
    String correo="", telefono="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_personas);
        imagen1 = findViewById(R.id.imageView9);
        imagen2 = findViewById(R.id.imageView10);
        imagen3 = findViewById(R.id.imageView11);
        imagen4 = findViewById(R.id.imageView12);
        imagen5 = findViewById(R.id.imageView13);
        imagen6 = findViewById(R.id.imageView14);
    }
    public void onClick1(View view)
    {
        correo="correo1";
        telefono="telefono1";
        Toast.makeText(this,getString(R.string.primeraImagen) , Toast.LENGTH_SHORT).show();
    }
    public void onClick2(View view)
    {
        correo="correo2";
        telefono="telefono2";
        Toast.makeText(this,getString(R.string.SegundaImagen) , Toast.LENGTH_SHORT).show();
    }
    public void onClick3(View view)
    {
        correo="correo3";
        telefono="telefono3";
        Toast.makeText(this,getString(R.string.TerceraImagen) , Toast.LENGTH_SHORT).show();
    }
    public void onClick4(View view)
    {
        correo="correo4";
        telefono="telefono4";
        Toast.makeText(this,getString(R.string.CuartaImagen) , Toast.LENGTH_SHORT).show();
    }
    public void onClick5(View view)
    {
        correo="correo5";
        telefono="telefono6";
        Toast.makeText(this,getString(R.string.QuintaImagen) , Toast.LENGTH_SHORT).show();
    }
    public void onClick6(View view)
    {
        correo="correo6";
        telefono="telefono6";
        Toast.makeText(this,getString(R.string.SextaImagen) , Toast.LENGTH_SHORT).show();
    }
}
