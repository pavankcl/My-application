package com.example.simpleloginapp;
pacakge Test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import Test;
public native string  msg();

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Test obj = new Test();
        String  result = obj.msg();
        Toast.makeText(this, "you have been successfully logged in", Toast.LENGTH_SHORT).show();
    }
}
