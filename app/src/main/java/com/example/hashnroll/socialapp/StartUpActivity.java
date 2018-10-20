package com.example.hashnroll.socialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
    }

    public void openDisableLoginActivity(View view) {
        Intent intent = new Intent(this, DisabledLoginActivity.class);
        startActivity(intent);
    }
}
