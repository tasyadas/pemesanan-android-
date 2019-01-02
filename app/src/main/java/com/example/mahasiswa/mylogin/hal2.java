package com.example.mahasiswa.mylogin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class hal2 extends AppCompatActivity {
    
    Button blackcoffee, cappuccino, latte;

    @Override
    protected void attachBaseContext (Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hal2);


        blackcoffee = (Button) findViewById(R.id.blackcoffee);
        cappuccino = (Button) findViewById(R.id.cappuccino);
        latte = (Button) findViewById(R.id.latte);

        blackcoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent blackcoffeeIntent = new Intent(hal2.this, hal3.class);

                startActivity(blackcoffeeIntent);
            }
        });

        cappuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cappuccinoIntent = new Intent(hal2.this, hal3.class);

                startActivity(cappuccinoIntent);
            }
        });

        latte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent latteIntent = new Intent(hal2.this, hal3.class);

                startActivity(latteIntent);
            }
        });

    }

}
