package com.example.justjavapractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        displayQuantity(3);
        displayPrice(3);
    }

    private void displayPrice(int number) {
        int coffeePrice = 5000;
        TextView priceTextView = (TextView) findViewById(R.id.text_price);
        priceTextView.setText(NumberFormat
                .getCurrencyInstance(Locale.KOREA).format(number*coffeePrice));
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = findViewById(R.id.text_quantity);
        quantityTextView.setText("" + number); // "0"
    }
}