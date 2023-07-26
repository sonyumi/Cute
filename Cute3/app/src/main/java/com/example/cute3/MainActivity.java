package com.example.cute3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToastMessage1(View v){
        Toast.makeText(getApplicationContext(),"Hello World_1",Toast.LENGTH_LONG).show();
    }

    public void ToastMessage2(View v){
        Toast.makeText(getApplicationContext(),"Hello World_2",Toast.LENGTH_LONG).show();
    }
}