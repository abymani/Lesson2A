package com.example.abymani.lesson2a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Lesson2A extends AppCompatActivity {

    int quantity;
    TextView price;
    TextView quantityView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);
        price=(TextView) findViewById(R.id.price);
        quantityView=(TextView) findViewById(R.id.quant);
        quantity=0;
    }


    public void submitOrder(View view) {
        displayquantity(quantity);
        displayPrice(quantity*4);
    }

    private void displayPrice(int i) {

        TextView price=(TextView) findViewById(R.id.price);
        price.setText("$" + i);

    }

    private void displayquantity(int i) {
        TextView quantity=(TextView) findViewById(R.id.quant);
        quantity.setText("" +i);
    }

    public void changeQuantity(View view) {
        if(view==findViewById(R.id.minus))
        {
            quantity--;
            submitOrder(view);

        }
        if(view==findViewById(R.id.plus))
        {
            quantity++;
            submitOrder(view);
        }
    }
}
