package com.example.ujwal.burnit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button exer,cal,bmi,goal,dis,nutr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bmi=(Button)findViewById(R.id.button1);
        goal=(Button)findViewById(R.id.button2);
        exer=(Button)findViewById(R.id.button3);
        dis=(Button)findViewById(R.id.button4);
        nutr=(Button)findViewById(R.id.button5);
        cal=(Button)findViewById(R.id.button6);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,bmiactivity.class));
            }
        });



        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=1RIK8aD6NH3-IVrVXF3rGWWpBJz6zK87C6S6YxcVuHmo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });


        exer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://exercisefitline.blogspot.in/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });


        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dis.class);
                startActivity(intent);

            }
        });


        nutr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=0B1swn5skYgEHcUJnUy1sWl9TbkU");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, cal.class);
                startActivity(intent);

            }
        });

    }
}
