package com.example.digital.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botontarjetaRoja= findViewById(R.id.boton_cambiar_fragment);
        botontarjetaRoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                FragmentRojo fragmentRojo= new FragmentRojo();
                transaction.replace(R.id.contenedo_fragment, fragmentRojo);
                transaction.commit();
            }
        });
    }
}
