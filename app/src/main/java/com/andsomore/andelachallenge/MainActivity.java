package com.andsomore.andelachallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button about, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("ALC 4 Phase 1");

        about= findViewById(R.id.about);
        profile=findViewById(R.id.myprofile);

        profile.setOnClickListener(v->{
            startActivity(new Intent(this,MyProfile.class));
        });

        about.setOnClickListener(v->{
            startActivity(new Intent(this, AboutActivity.class));
        });
    }
}
