package com.example.num4;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSearch = findViewById(R.id.btn_search);
        Button btnSaved = findViewById(R.id.btn_saved);
        Button btnSettings = findViewById(R.id.btn_settings);

        btnSearch.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SearchActivity.class));
            showToast("Переход выполнен");
        });

        btnSaved.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SavedRecipesActivity.class));
            showToast("Переход выполнен");
        });

        btnSettings.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            showToast("Переход выполнен");
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}