package com.studium.xxracso40xx.practicatema6pmdm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class Personas extends AppCompatActivity {
ImageView imagen1, imagen2, imagen3, imagen4, imagen5, imagen6;
    SharedPreferences prefs;
    public static String cadena2="";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
        imagen1 = findViewById(R.id.imageView3);
        imagen2 = findViewById(R.id.imageView4);
        imagen3 = findViewById(R.id.imageView5);
        imagen4 = findViewById(R.id.imageView6);
        imagen5 = findViewById(R.id.imageView7);
        imagen6 = findViewById(R.id.imageView8);

        registerForContextMenu(imagen1);
        registerForContextMenu(imagen2);
        registerForContextMenu(imagen3);
        registerForContextMenu(imagen4);
        registerForContextMenu(imagen5);
        registerForContextMenu(imagen6);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menupersonas, menu);
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menueditar, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String cadena=null;
        prefs = getSharedPreferences("ficheroconfiguracion", Context.MODE_PRIVATE);
        switch(item.getItemId())
        {
            case R.id.opcion4:cadena = prefs.getString("telefono1", null);
                if(cadena==null)
                {
                    //AQUÍ UN TOAST DICIENDO QUE ESTÁ VACÍO
                    Toast.makeText(this, "Está vacio el campo teléfono/correo", Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
                    {
                        intent.setData(Uri.parse(cadena));
                        startActivity(intent);
                    }
                    else
                    {
                        requestPermissions(new String[]{CALL_PHONE}, 1);
                    }
                }
                break;
            case R.id.opcion5:
                break;
        }
        return super.onContextItemSelected(item);
    }
    @SuppressLint("NewApi")
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent intent2 = new Intent(this, EditarPersonas.class);
        startActivity(intent2);
        return false;
    }
}
