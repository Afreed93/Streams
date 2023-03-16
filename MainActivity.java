package com.example.streams;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText username, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        loginButton = findViewById(R.id.signIn);
        username = findViewById(R.id.username);
        pwd = findViewById(R.id.password);
        loginButton.setOnClickListener(view -> {
                    String u = username.getText().toString();
                    String p = pwd.getText().toString();
                    if ((u.equals("Sai Prathap") || u.equals("Afreed") || u.equals("Vandhana")) || u.equals("") && p.equals("1234") || p.equals("")) {
                        Intent i = new Intent(MainActivity.this, app.class);
                        startActivity(i);
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Invalid Username or Password");
                        builder.setTitle("Alert !");
                        builder.setCancelable(false);
                        builder.setPositiveButton("OK", (DialogInterface.OnClickListener) (dialog, which) -> {
                            dialog.cancel();
                        });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                }
        );
    }
}