package com.example.ujwal.burnit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bmiactivity extends AppCompatActivity {

    EditText height,weight;
    TextView bmi;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);
        height= (EditText) findViewById(R.id.height_et);
        weight= (EditText) findViewById(R.id.weight_et);
        bmi=(TextView)findViewById(R.id.bmi_tv);
        calc=(Button)findViewById(R.id.calc_button);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strht = height.getText().toString();
                String strwt= weight.getText().toString();

                if(TextUtils.isEmpty(strwt)){
                    weight.setError("Please enter your weight");
                    weight.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(strht)){
                    height.setError("Please enter your height");
                    height.requestFocus();
                    return;
                }

//Get the user values from the widget reference
                float weight = Float.parseFloat(strwt);
                float height = Float.parseFloat(strht)/100;

//Calculate BMI value
                float bmiValue = calculateBMI(weight, height);

//Define the meaning of the bmi value
                String bmiInterpretation = interpretBMI(bmiValue);

                bmi.setText(String.valueOf(bmiValue + "-" + bmiInterpretation));

            }
        });

    }



    private float calculateBMI (float weight, float height) {
        return (float) (weight / (height * height));
    }

    // Interpret what BMI means
    private String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely underweight";
        } else if (bmiValue < 18.5) {

            return "Underweight";
        } else if (bmiValue < 25) {

            return "Normal";
        } else if (bmiValue < 30) {

            return "Overweight";
        } else {
            return "Obese";
        }
    }

}
