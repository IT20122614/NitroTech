package com.example.nitrotech;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Profile");
    }
    public void clickEditProfileBtn(View view) {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }
    public void clickAddressBookBtn(View view) {
        Intent intent = new Intent(this, AddressBook.class);
        startActivity(intent);
    }
    public void clickWishListBtn(View view) {
        Intent intent = new Intent(this, WishlistPage.class);
        startActivity(intent);
    }
}