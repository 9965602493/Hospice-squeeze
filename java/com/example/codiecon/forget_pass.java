package com.example.codiecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class forget_pass extends AppCompatActivity {
    Button but2;
    TextView textView1;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        but2 = findViewById(R.id.dback);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView1= findViewById(R.id.update);
                textView1.setText("Password updated !!! ");

                timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(forget_pass.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
            }
        });

    }
}
