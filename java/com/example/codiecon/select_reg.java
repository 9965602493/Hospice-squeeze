package com.example.codiecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_reg extends AppCompatActivity {
        Button but,but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_reg);


        but = findViewById(R.id.market);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(select_reg.this,market_registry.class);
                startActivity(intent);
            }
        });
        but1 = findViewById(R.id.company);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(select_reg.this,company_registry.class);
                startActivity(intent);
            }
        });


    }
}
