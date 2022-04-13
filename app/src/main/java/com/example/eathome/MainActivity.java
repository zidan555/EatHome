package com.example.eathome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton clientuser, restaurantuser, rideruser, administratoruser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clientuser = findViewById(R.id.clientsignbutton);
        clientuser.setOnClickListener(this);
        restaurantuser = findViewById(R.id.restaurentbutton);
        restaurantuser.setOnClickListener(this);
        rideruser = findViewById(R.id.riderbutton);
        rideruser.setOnClickListener(this);
        administratoruser = findViewById(R.id.administratorbutton);
        administratoruser.setOnClickListener(this);
        administratoruser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view == clientuser) {
            Toast.makeText(this, "Clicked clientuser", Toast.LENGTH_SHORT).show();
            //Here Start Activity
        } else if (view == restaurantuser) {
            Toast.makeText(this, "Clicked restaurantuser", Toast.LENGTH_SHORT).show();
            //Start Activity
        } else if (view == rideruser) {
            Toast.makeText(this, "Clicked rideruser", Toast.LENGTH_SHORT).show();
            //Start Activity
        } else if (view == administratoruser) {
            Toast.makeText(this, "Clicked administratoruser", Toast.LENGTH_SHORT).show();
            //Start Activity
        }
    }
}