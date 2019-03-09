package com.example.codiecon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class otp_generation extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_generation);



        final EditText editText1 = (EditText)findViewById(R.id.reg_otp);


        Button button1 = (Button)findViewById(R.id.otp2);

        final TextView textView1 = (TextView)findViewById(R.id.textView8);
        textView1.setText(" ");



        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String text = "Your Phone no is ur user name";

                textView1.setText(String.valueOf(text));




            }
        });


        back = findViewById(R.id.button4);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otp_generation.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
