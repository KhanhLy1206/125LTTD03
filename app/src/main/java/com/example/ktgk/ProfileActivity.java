package com.example.ktgk;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class ProfileActivity extends AppCompatActivity{
    ImageView img_set;
    TextView profile_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);
        img_set=findViewById(R.id.imgv_setting);
        profile_name=findViewById(R.id.txt_profile);
        String username = getIntent().getStringExtra("username");
        profile_name.setText("username");
        img_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
