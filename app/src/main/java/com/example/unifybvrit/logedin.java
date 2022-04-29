package com.example.unifybvrit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class logedin extends AppCompatActivity {
    private ImageButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logedin);
        button2= (ImageButton) findViewById(R.id.imageButton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_home();
            }
        });
    }
    public void view_home() {
        Intent intent=new Intent(this,hamburger.class);
        startActivity(intent);
    }
}