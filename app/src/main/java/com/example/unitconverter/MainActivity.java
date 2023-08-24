package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    TextView textView, textView2, textView4, valueOfPound;
    Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instantiating Weidgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);

        valueOfPound = findViewById(R.id.valueOfPound);
        editText  = findViewById(R.id.editTextNumber3);

        button = findViewById(R.id.button);

     // Adding A Click event for button

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public  void  onClick(View v){
             // calling ConvertFromKiloToPound Method

             ConvertFromKiloToPound();
         }


     });


    }

    private void ConvertFromKiloToPound() {
         // This Message Will convert the value of pound the value entered in editText
        String valuEnteredinKILO = editText.getText().toString();

        //converting string number
        double kilo = Double.parseDouble(valuEnteredinKILO);
        // converting kilo to  pound  formula
        double pounds = kilo*2.205;

        // Displaying the value resulted in textView
        valueOfPound.setText("" + pounds);


    }
}