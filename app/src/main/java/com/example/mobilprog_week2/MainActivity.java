package com.example.mobilprog_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editTextTextMultiLine);
    }

    public void myClick(View v){

        Intent myInt = new Intent(this, MainActivity2.class);
        myInt.putExtra("data",et.getText().toString());

        MySharingObject mso = new MySharingObject();

        mso.setName("Mustafa Cem");
        mso.setSurname("Kasapbaşı");
        mso.setEmail("email@mail.com");
        myInt.putExtra("MyData",mso);
        startActivity(myInt);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("rvyd","onDestroyed!!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("rvyd", "on Start !!!!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("rvyd", "on stopp!!!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("rvyd", "on Restarttt!!!");

    }
}