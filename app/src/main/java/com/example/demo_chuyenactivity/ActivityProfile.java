package com.example.demo_chuyenactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityProfile extends AppCompatActivity {
    ImageView icon_set;
    TextView profileName, email, phone, ins, web;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        icon_set = findViewById(R.id.icon_set);
        profileName = findViewById(R.id.profileName);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        ins = findViewById(R.id.ins);
        web = findViewById(R.id.web);

        // Lấy dữ liệu username từ Login
        String username = getIntent().getStringExtra("username");
        profileName.setText(username);
        icon_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // quay về Login
            }
        });
    }
}
