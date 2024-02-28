package com.example.mobilprog_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtView = findViewById(R.id.textView);

        String str = getIntent().getExtras().getString("data");

        MySharingObject mso = (MySharingObject) getIntent().getExtras().getSerializable("MyData");

        txtView.setText(str + "\n" + mso.getName() + "\n" +mso.getSurname() + "\n" +mso.getEmail());


    }
}