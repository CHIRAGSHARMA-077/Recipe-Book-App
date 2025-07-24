package com.example.recipebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {

    ImageView detailImageView;
    TextView detailTitleTextView, detailFullTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_detail);

        detailImageView = findViewById(R.id.detailImageView);
        detailTitleTextView = findViewById(R.id.detailTitleTextView);
        detailFullTextView = findViewById(R.id.detailFullTextView);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String fullRecipe = intent.getStringExtra("fullRecipe");
        int image = intent.getIntExtra("image", R.drawable.burger);

        detailTitleTextView.setText(title);
        detailFullTextView.setText(fullRecipe);
        detailImageView.setImageResource(image);
    }
}
