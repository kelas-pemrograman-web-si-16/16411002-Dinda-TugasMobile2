package com.example.user.tugas_mobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intent2 extends AppCompatActivity {

    TextView txtNama, txtNPM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        txtNama = (TextView) findViewById(R.id.txtPassingData1);
        txtNPM = (TextView) findViewById(R.id.txtPassingData2);

        Intent intent =getIntent();
        String nama = intent.getStringExtra("nama");
        txtNama.setText(nama);

        String npm = intent.getStringExtra("npm");
        txtNPM.setText(npm);
    }
}