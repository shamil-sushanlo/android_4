package com.example.num4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SearchResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        Button btnViewDetails = findViewById(R.id.btn_view_details);

        btnViewDetails.setOnClickListener(v -> {
            startActivity(new Intent(SearchResultsActivity.this, RecipeDetailsActivity.class));
            showToast("Детали рецепта загружены");
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
