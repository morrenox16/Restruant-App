package org.baltimorecityschools.restruantappkoh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Declare UI Elements
    private Button btnViewMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewMenu = findViewById(R.id.btnViewMenu);

        // 3. Set up the Button Click Listener to open OrderScreen
        btnViewMenu.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, OrderScreen.class);
            startActivity(intent);
        });
    }
}