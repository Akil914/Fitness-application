package com.app.mainscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    String buttonvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);


        Intent intent = getIntent();
        buttonvalue = intent.getStringExtra("value");


        int intvalue = Integer.valueOf(buttonvalue);

        switch (intvalue){
            case 1:
                setContentView(R.layout.activity_1);
                break;

            case 2:
                setContentView(R.layout.activity_2);
                break;

            case 3:
                setContentView(R.layout.activity_3);
                break;

            case 4:
                setContentView(R.layout.activity_4);
                break;

            case 5:
                setContentView(R.layout.activity_5);
                break;


            case 6:
                setContentView(R.layout.activity_6);
                break;

            case 7:
                setContentView(R.layout.activity_7);
                break;


            case 8:
                setContentView(R.layout.activity_8);
                break;


            case 9:
                setContentView(R.layout.activity_9);
                break;


            case 10:
                setContentView(R.layout.activity_10);
                break;


            case 11:
                setContentView(R.layout.activity_11);
                break;


            case 12:
                setContentView(R.layout.activity_12);
                break;


            case 13:
                setContentView(R.layout.activity_13);
                break;
        }




    }
}