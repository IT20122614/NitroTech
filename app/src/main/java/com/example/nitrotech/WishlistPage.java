package com.example.nitrotech;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WishlistPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist_page);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setTitle("Wishlist");
    }
    public void redirectCheckoutPage(View view) {
        Intent intent = new Intent(this, CheckoutPage.class);
        startActivity(intent);
    }
}