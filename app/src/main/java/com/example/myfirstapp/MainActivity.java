package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner mySpinner;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner = findViewById(R.id.spinner);
        myTextView = findViewById(R.id.textView);
    }

    public void showDescription(View view) {
        int pos = mySpinner.getSelectedItemPosition();
        myTextView.setText(findDescription(pos));

    }

    private String findDescription(int pos){
        String[] allDescriptions = getResources().getStringArray(R.array.description);
        return allDescriptions[pos];
    }
}