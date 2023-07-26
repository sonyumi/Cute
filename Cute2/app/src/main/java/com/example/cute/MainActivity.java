package com.example.cute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(getApplicationContext(),"네이버접속",Toast.LENGTH_LONG).show(); //Toast 메세지 호출
        Intent myIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);
    }
    public void onButton2Clicked(View v){
        Toast.makeText(getApplicationContext(),"전화걸기",Toast.LENGTH_LONG).show();
        Intent myIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-3151-3072"));
        startActivity(myIntent);
    }

    public void onButton3Clicked(View v){
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }

}