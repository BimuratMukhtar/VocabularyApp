package com.example.android.vocabularyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View.OnClickListener onClickViewListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView categoryNumbers = findViewById(R.id.category_numbers);
        categoryNumbers.setOnClickListener(this);

        TextView categoryFamily = findViewById(R.id.category_family);
        categoryFamily.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Class currentClass = null;
        switch (v.getId()){
            case R.id.category_numbers:
                currentClass = NumbersActivity.class;
                break;
            case R.id.category_family:
                currentClass = FamilyActivity.class;
                break;
            case R.id.category_colors:
                currentClass = ColorsActivity.class;
                break;
            case R.id.category_phrases:
                currentClass = PhrasesActivity.class;
                break;
        }

        if(currentClass != null){
            Intent intent = new Intent(this, currentClass);
            startActivity(intent);
        }
    }
}
