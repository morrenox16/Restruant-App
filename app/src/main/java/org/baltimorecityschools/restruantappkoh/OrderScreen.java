package org.baltimorecityschools.restruantappkoh;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class OrderScreen extends AppCompatActivity {

    private int quantity = 1;
    private final double ITEM_PRICE = 3.50;

    private TextView tvQuantity;
    private TextView tvTotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_order_screen);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvQuantity = findViewById(R.id.tvQuantity);
        tvTotalPrice = findViewById(R.id.tvTotalPrice);

        Button btnDecrease = findViewById(R.id.btnDecrease);
        Button btnIncrease = findViewById(R.id.btnIncrease);
        Button btnPlaceOrder = findViewById(R.id.btnPlaceOrder);

        btnIncrease.setOnClickListener(v -> {
            quantity++;
            updateTotal();
        });

        btnDecrease.setOnClickListener(v -> {
            if (quantity > 1) {
                quantity--;
                updateTotal();
            }
        });

        btnPlaceOrder.setOnClickListener(v -> {
            double total = quantity * ITEM_PRICE;
            String message = String.format(Locale.US,
                    "Ordered %d Picante Habanero Taco(s) - Total: $%.2f", quantity, total);
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        });
    }

    private void updateTotal() {
        tvQuantity.setText(String.valueOf(quantity));
        double total = quantity * ITEM_PRICE;
        tvTotalPrice.setText(String.format(Locale.US, "Total: $%.2f", total));
    }
}