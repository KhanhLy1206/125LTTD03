package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    EditText edtFirstName, edtLastName, edtEmail, edtPassword;
    Button btnCreateAccount;
    TextView txtSignInLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangky);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        txtSignInLink = findViewById(R.id.txtSignInLink);

        btnCreateAccount.setOnClickListener(v -> {
            String fName = edtFirstName.getText().toString();
            String lName = edtLastName.getText().toString();
            String email = edtEmail.getText().toString();
            String pass = edtPassword.getText().toString();

            if(fName.isEmpty() || lName.isEmpty() || email.isEmpty() || pass.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Tạo tài khoản thành công", Toast.LENGTH_SHORT).show();
                finish(); // Quay lại LoginActivity
            }
        });

        // Link về Login
        txtSignInLink.setOnClickListener(v -> {
            Intent intent = new Intent(CreateAccountActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
