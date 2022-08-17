package com.example.mahmoudcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum, sub, mul, div, clear, close;
    //EditText first, scend;
    TextView result ,num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = (Button) findViewById(R.id.blus);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.multy);
        div = (Button) findViewById(R.id.div);
        clear = (Button) findViewById(R.id.clear);
        close = (Button) findViewById(R.id.close);

        result = (TextView)findViewById(R.id.result);
        num1=(TextView)findViewById(R.id.num1);
        num2=(TextView)findViewById(R.id.num2);

        clear.setOnClickListener(view -> {
            result.setText("");
            num1.setText("");
            num2.setText("");

        });
        close.setOnClickListener(view -> finish());


        sum.setOnClickListener(view -> {


            int number1=Integer.parseInt(num1.getText().toString());
            int number2=Integer.parseInt(num2.getText().toString());
            result.setText(Integer.toString(number1+number2));

        });
        sub.setOnClickListener(view -> {


            int number1=Integer.parseInt(num1.getText().toString());
            int number2=Integer.parseInt(num2.getText().toString());
            result.setText(Integer.toString(number1-number2));

        });
        mul.setOnClickListener(view -> {


            int number1=Integer.parseInt(num1.getText().toString());
            int number2=Integer.parseInt(num2.getText().toString());
            result.setText(Integer.toString(number1* number2));


        });
        div.setOnClickListener(view -> {


            double number1=Double.parseDouble(num1.getText().toString());
            double number2=Double.parseDouble(num2.getText().toString());
            result.setText(Double.toString(number1/number2));

        });



    }
}