package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    EditText edt_username, edt_pass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edt_username=findViewById(R.id.edt_username);
        edt_pass=findViewById(R.id.edt_pass);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us_name=edt_username.getText().toString().trim();
                String psw=edt_pass.getText().toString().trim();
                if(!us_name.isEmpty()&&!psw.isEmpty()){
                    Intent i = new Intent(LoginActivity.this, ProfileActivity.class);
                    i.putExtra("username",us_name);
                    startActivity(i);
                }else {
                    Toast.makeText(LoginActivity.this,"Hãy nhập đầy đủ thông tin!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}