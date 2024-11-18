package com.example.num4;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        EditText editSearch = findViewById(R.id.edit_search);
        Button btnSearch = findViewById(R.id.btn_execute_search);

        btnSearch.setOnClickListener(v -> {
            String query = editSearch.getText().toString();
            if (!query.isEmpty()) {
                Intent intent = new Intent(SearchActivity.this, SearchResultsActivity.class);
                intent.putExtra("query", query);
                startActivity(intent);
                showToast("Поиск выполнен");
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}