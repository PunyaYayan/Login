package com.example.myownloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtus;
    EditText txtps;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtus = findViewById(R.id.Edittext1);
        txtps = findViewById(R.id.Edittext2);

        String User = txtus.getText().toString();
        String Pass = txtps.getText().toString();
        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtus.getText().toString().isEmpty() || txtps.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Mohon Diisi Semua", Toast.LENGTH_SHORT).show();
                } else {
                    if (txtus.getText().toString().equals("zayyan") && txtps.getText().toString().equals("cahya")){
                        Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();

                    Intent intentku = new Intent(MainActivity.this, Kalkulator.class);
                    startActivity(intentku);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                    }    
                } 
            }
        });
    }
}