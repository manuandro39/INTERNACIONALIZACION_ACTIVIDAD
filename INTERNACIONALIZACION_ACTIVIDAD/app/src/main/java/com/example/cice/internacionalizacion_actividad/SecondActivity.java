package com.example.cice.internacionalizacion_actividad;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        switch (getResources().getConfiguration().orientation) {
            //Elección de la vista a mostrar en función de su orientación (horizontal o vertical)
            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.activity_second);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.activity_second);
                break;
        }
    }
}
