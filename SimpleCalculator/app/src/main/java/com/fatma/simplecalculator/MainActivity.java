package com.fatma.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberText1;
    EditText numberText2;
    TextView resultTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberText1=findViewById(R.id.numberText1);
        numberText2=findViewById(R.id.numberText2);
        resultTest=findViewById(R.id.resultTest);

    }

    public void sum(View view){
        if (numberText1.getText().toString().matches(" ")||numberText2.getText().toString().matches(" ")){
            resultTest.setText("Sayı girilmedi");
        } else {
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 + number2;
            resultTest.setText("sonuç: " + result);
        }

    }
    public void deduct(View view){
        if (numberText1.getText().toString().matches(" ")||numberText2.getText().toString().matches(" ")){
            resultTest.setText("Sayı girilmedi");
        } else {
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 - number2;
            resultTest.setText("sonuç: " + result);
        }

    }

    public void multiply(View view){
        if (numberText1.getText().toString().matches(" ")||numberText2.getText().toString().matches(" ")){
            resultTest.setText("Sayı girilmedi");
        } else {
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 * number2;
            resultTest.setText("sonuç: " + result);
        }

    }

    public void divide(View view){
        if (numberText1.getText().toString().matches(" ")||numberText2.getText().toString().matches(" ")){
            resultTest.setText("Sayı girilmedi");
        } else if (numberText2.getText().toString().matches("0")) {
            resultTest.setText("Girilen sayı 0 a bölünemez");

        } else {
            int number1 = Integer.parseInt(numberText1.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1 / number2;
            resultTest.setText("sonuç: " + result);
        }

    }
}