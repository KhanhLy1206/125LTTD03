package com.example.demo_chuyenactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

public class ActivityLogin extends AppCompatActivity {
    EditText edt_username, edt_pass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        edt_username=findViewById(R.id.edt_username);
        edt_pass=findViewById(R.id.edt_pass);
        btn_login=findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=edt_username.getText().toString().trim();
                String pass=edt_pass.getText().toString().trim();
                if(!username.isEmpty() && !pass.isEmpty()){
                    Intent i = new Intent(ActivityLogin.this, ActivityProfile.class);
                    i.putExtra("username", username);
                    startActivity(i);
                }

            }
        });
    }
}