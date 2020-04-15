package com.example.aipsych;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.aipsych.R;

public class SplashActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name,email,gender,dob;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        gender = (EditText) findViewById(R.id.gender);
        dob = (EditText) findViewById(R.id.dateofbirth);
        textView = findViewById(R.id.textView_id);

        button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(this);
    }

    public void onClick (View v){

        String name1 = name.getText().toString();
        String email1 = email.getText().toString();
        String gender1 = gender.getText().toString();
        String dob1 = dob.getText().toString();

        if(v.getId() == R.id.button_id){

            textView.setText("Name: " + name1 + "\n" + "Email: " + email1 + "\n" + "Gender: " + gender1 + "\n" + "Date of Birth: " + dob1);

;

        }


    }

}