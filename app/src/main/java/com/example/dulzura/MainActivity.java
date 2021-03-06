package com.example.dulzura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAAcceder(View view){
        Intent i = new Intent(this, Acceder.class);
        startActivity(i);
    }

    public void irARegistrar(View view){
        Intent i = new Intent(this, Registrar.class);
        startActivity(i);
    }

    public void irFacebook(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Dulzura-558099148019694"));
        startActivity(i);
    }
}