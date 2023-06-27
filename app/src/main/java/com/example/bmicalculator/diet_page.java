package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class diet_page extends AppCompatActivity {
    Intent it;
    ImageView img;
    TextView t;
    Button go;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_page);
        it=getIntent();
        img= findViewById(R.id.imageview);
        t=findViewById(R.id.food);
        val=it.getStringExtra("data");
        go= findViewById(R.id.gotomain);
        float d=Float.parseFloat(val);
        if(d<20.00)
        {
            img.setImageResource(R.drawable.low);
            t.setText(" Milk ,Rice ,Dried fruits, Homemade protein smoothies");

        }
        if(d>=20.00)
        {
            img.setImageResource(R.drawable.high);
            t.setText("Walnuts ,Avocado ,SunGold Kiwi,Beans");
        }
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent1);
            }
        });
    }


}