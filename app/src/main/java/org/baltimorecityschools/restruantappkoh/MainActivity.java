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
    private Button btnViewMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnViewMenu = (Button) findViewById(R.id.btnViewMenu);




        // 3. Set up the Button Click Listener
        btnViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double totalPrice = 0.0;
                StringBuilder orderSummary = new StringBuilder("Ordered: ");


                // Handle empty order edge case
                if (totalPrice == 0.0) {
                    orderSummary.append("Theres nothing to order");
                }

                Toast.makeText(MainActivity.this, orderSummary.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}