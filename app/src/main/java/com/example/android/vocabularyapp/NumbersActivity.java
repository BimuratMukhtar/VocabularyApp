package com.example.android.vocabularyapp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    String numbers [] = new String[]{"one", "two", "three"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_numbers);


        LinearLayout parent = findViewById(R.id.container);
        for(int i = 0; i < numbers.length; i++){
            TextView textView = (TextView)LayoutInflater.from(this).inflate(R.layout.list_item, parent, false);
            textView.setText(numbers[i]);
            parent.addView(textView);
        }
    }


}
