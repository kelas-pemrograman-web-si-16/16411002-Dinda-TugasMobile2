package com.example.user.tugas_mobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class intent1 extends AppCompatActivity {

    Button BtnLogin;
    EditText EditNPM, EditNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);

        EditNPM = (EditText) findViewById(R.id.EditNPM);
        EditNama = (EditText) findViewById(R.id.EditNama);
        BtnLogin = (Button) findViewById(R.id.BtnLogin);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = EditNama.getText().toString();
                String npm = EditNPM.getText().toString();
                Intent a = null;

                if (nama.equals("Dinda Sari")  && npm.equals("16411002")){
                    a = new Intent(intent1.this, intent2.class);
                    a.putExtra("nama", EditNama.getText().toString());
                    a.putExtra("npm", EditNPM.getText().toString());
                    startActivity(a);
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Inputan Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
