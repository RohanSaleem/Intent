package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Btn;
    private EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn = findViewById(R.id.BtnID);
        email = findViewById(R.id.EmailID);
        pass = findViewById(R.id.PassID);

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Email = email.getText().toString();
                String Pass = pass.getText().toString();


                if (Email.equals("admin@gmail.com") && Pass.equals("abc123")) {

                  
                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(myIntent);
                }

            }

        });
    }
}