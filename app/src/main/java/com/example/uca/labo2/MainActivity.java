package com.example.uca.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView fstTextView, sndTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View v){
        String aux;
        fstTextView = findViewById(R.id.fstTextView);
        sndTextView = findViewById(R.id.sndTextView);

        aux = fstTextView.getText().toString();
        fstTextView.setText(sndTextView.getText());
        sndTextView.setText(aux);
    }
}
