package com.example.projek_wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText email,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        login = (Button)  findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set email dan pass
                if (email.getText().toString().equals("putrilisanda@gmail.com") && pass.getText().toString().equals("1234567")) {
                    // jika berhasil
                    Intent intent = new Intent(login.this, beranda.class);
                    startActivity(intent);
                }
                //jika gagal
                else {
                    Toast.makeText(getApplicationContext(), "email atau password anda salah", Toast.LENGTH_SHORT).show();

                    login.setEnabled(false);
                }
            }
        });
    }
}
