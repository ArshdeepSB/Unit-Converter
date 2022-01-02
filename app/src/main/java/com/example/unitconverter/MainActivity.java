package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //Declaring Widgets
     EditText editText;
     TextView textView, textView2, textView4, valueOfPounds;
     Button button;
     ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize and Link the layout with java
        //Instantiating Widgets


        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        valueOfPounds = findViewById(R.id.valueOfPounds);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        // Adding A Click event for button (Executing the convert method when clicked)
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling ConvertFromKiloToPound Method

                ConvertFromKiloToPound();
            }



        });



           }

    private void ConvertFromKiloToPound() {
        // This method will convert the values entered in edit Text to pounds
        // From kilo to pounds

        String kiloEntered = editText.getText().toString();

        //Converting string to number

        double kilo = Double.parseDouble(kiloEntered);

        //converting kilo to pounds

        double pounds = kilo*2.205;

        //change the text in valueOfPounds to show the result
        valueOfPounds.setText("" + pounds);


    }

}
