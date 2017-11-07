package com.example.ujwal.burnit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dis extends AppCompatActivity {

    private Button cancer,diab,chol,bp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis);


        cancer=(Button)findViewById(R.id.cancer);
        bp=(Button)findViewById(R.id.bp);
        chol=(Button)findViewById(R.id.cholestrol);
        diab=(Button)findViewById(R.id.diab);

        cancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=0B29WsvX_sM9uTzc3QzdNWkJFMHc");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        chol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=0B29WsvX_sM9uNmk1d1ViUkhGaVk");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=0B29WsvX_sM9uUmhkanJ6R3h0RDA");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        diab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/open?id=0B29WsvX_sM9uWENpbUdGcVBKNzA");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
    }
}
