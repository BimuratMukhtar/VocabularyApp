package com.example.android.vocabularyapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersAdapter extends ArrayAdapter<Word>{


    public NumbersAdapter(Context context, ArrayList<Word> users) {
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView original = convertView.findViewById(R.id.original);
        TextView translation = convertView.findViewById(R.id.translation);
        // Populate the data into the template view using the data object
        original.setText(word.original);
        translation.setText(word.translation);

        return convertView;
    }
}
