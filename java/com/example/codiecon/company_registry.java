package com.example.codiecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class company_registry extends AppCompatActivity {
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_registry);


        but = findViewById(R.id.comp_reg_O);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(company_registry.this,otp_generation.class);
                startActivity(intent);
            }
        });

    }
}
