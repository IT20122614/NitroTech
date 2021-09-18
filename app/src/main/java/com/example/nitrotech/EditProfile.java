package com.example.nitrotech;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Edit Profile");
    }
    public void redirectDeletePage(View view) {
        Intent intent = new Intent(this, ConfirmDelete.class);
        startActivity(intent);
    }
}