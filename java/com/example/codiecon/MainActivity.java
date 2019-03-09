package com.example.codiecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView but,but1,but2;
    EditText com_reg_name,com_reg_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText com_reg_name = (EditText) findViewById(R.id.user_id);
        final EditText com_reg_pass = (EditText) findViewById(R.id.password);
        but2 = findViewById(R.id.button);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String content = com_reg_name.getText().toString();
                String content1 = com_reg_pass.getText().toString();

                if(content.equals("employee")) {

                    Intent intent = new Intent(MainActivity.this,company_login.class);
                    startActivity(intent);

                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,market_login.class);
                    startActivity(intent);

                }




                }
        });



        but = findViewById(R.id.reg_link);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,select_reg.class);
                startActivity(intent);
            }
        });
        but1 = findViewById(R.id.reg_link2);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,forget_pass.class);
                startActivity(intent);
            }
        });


    }
}
