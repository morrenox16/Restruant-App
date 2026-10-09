package org.baltimorecityschools.restruantappkoh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Declare UI Elements
    private CheckBox chkTaco;
    private CheckBox chkBurrito; // Added
    private CheckBox chkDrink;   // Added
    private Button btnPlaceOrder;
    private TextView txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // 3. Set up the Button Click Listener
        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double totalPrice = 0.0;
                StringBuilder orderSummary = new StringBuilder("Ordered: ");

                // Check Taco
                if (chkTaco.isChecked()) {
                    totalPrice += 10.99;
                    orderSummary.append("Taco ");
                }

                // Check Burrito
                if (chkBurrito.isChecked()) {
                    totalPrice += 12.49;
                    orderSummary.append("Burrito ");
                }

                // Check Drink
                if (chkDrink.isChecked()) {
                    totalPrice += 2.50;
                    orderSummary.append("Drink ");
                }

                // Handle empty order edge case
                if (totalPrice == 0.0) {
                    orderSummary.append("Nothing selected");
                }

                // 4. Update the total text view and show a popup toast message
                txtTotal.setText(String.format("Total: $%.2f", totalPrice));
                Toast.makeText(MainActivity.this, orderSummary.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}