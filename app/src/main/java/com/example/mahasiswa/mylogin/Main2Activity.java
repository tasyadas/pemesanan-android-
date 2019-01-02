package com.example.mahasiswa.mylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tvNama,tvNpm;
    String nama, npm;
    Button lgnData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lgnData = (Button) findViewById(R.id.lgnData);
        tvNama = (TextView) findViewById(R.id.tvNama);
        tvNpm = (TextView) findViewById(R.id.tvNpm);


        Intent lgnDataIntent = getIntent();

        nama = lgnDataIntent.getStringExtra("NAMA");
        npm = lgnDataIntent.getStringExtra("NPM");

        tvNama.setText(nama);
        tvNpm.setText(npm);

        lgnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lgnDataIntent = new Intent(Main2Activity.this, hal2.class);

                startActivity(lgnDataIntent);
            }
        });
    }
}
