package com.example.wakt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lefticon= findViewById(R.id.left_icon);
        ImageView righticon= findViewById(R.id.right_icon);
        //TextView title= findViewById(R.id.toolbar_title);
    }
}