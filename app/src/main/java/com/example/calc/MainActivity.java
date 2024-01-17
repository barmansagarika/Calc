package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button add_button,sub_button,mul_button,div_button;
    private TextView textview1;
    private EditText num,num1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = findViewById(R.id.textView1);
        num = findViewById(R.id.num);
        num1 = findViewById(R.id.num1);
        add_button = findViewById(R.id.add_button);
        sub_button = findViewById(R.id.sub_button);
        mul_button = findViewById(R.id.mul_button);
        div_button = findViewById(R.id.divide_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sum = Float.parseFloat(num.getText().toString()) + Float.parseFloat(num1.getText().toString());
                textview1.setText("Answer:" + sum);
            }
        });
        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sub = Float.parseFloat(num.getText().toString()) - Float.parseFloat(num1.getText().toString());
                textview1.setText("Answer:" + sub);
            }
        });
        mul_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float mul = Float.parseFloat(num.getText().toString()) * Float.parseFloat(num1.getText().toString());
                textview1.setText("Answer:" + mul);
            }
        });
        div_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float div = Float.parseFloat(num.getText().toString()) / Float.parseFloat(num1.getText().toString());
                textview1.setText("Answer:" + div);
            }
        });


    }
}