package com.izrael.smarttani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;

public class DashboarActivity extends AppCompatActivity {
CircleImageView monitoring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboar);
        monitoring = findViewById(R.id.monitoring);
        monitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboarActivity.this,MonitoringActivity.class);
                startActivity(intent);
            }
        });
    }
}
