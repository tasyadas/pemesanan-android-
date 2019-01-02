package com.example.mahasiswa.mylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNama, edtNpm;
    Button svVerif;
    String nama, npm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNpm = (EditText) findViewById(R.id.edtNpm);
        svVerif = (Button) findViewById(R.id.svVerif);

        svVerif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edtNama.getText().toString();
                npm = edtNpm.getText().toString();

                Intent svVerifIntent = new Intent(MainActivity.this, Main2Activity.class);
                svVerifIntent.putExtra("NAMA", nama);
                svVerifIntent.putExtra("NPM", npm);

                startActivity(svVerifIntent);
            }
        });

    }

}
