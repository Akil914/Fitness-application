package com.app.mainscreen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondActivity extends AppCompatActivity {



    int [] newArray;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);


        //Toolbar toolbar =findViewById(R.id.toolBar);
        //setSupportActionBar(toolbar);

        newArray = new int[]{

                R.id.ID1, R.id.ID2 , R.id.ID3 , R.id.ID4 , R.id.ID5 ,
                R.id.ID6 , R.id.ID7 , R.id.ID8 , R.id.ID9 , R.id.ID10,
                R.id.ID11 , R.id.ID12 , R.id.ID13




        };

    }

    public void Imagebuttonclicked(View view) {


        for(int i=0 ; i<newArray.length ;i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("First" , String.valueOf(value));

                Intent intent=  new Intent(secondActivity.this, ThirdActivity.class);
                intent.putExtra("value",String.valueOf(value));//Already written
                startActivity(intent);
            }
        }
    }
}