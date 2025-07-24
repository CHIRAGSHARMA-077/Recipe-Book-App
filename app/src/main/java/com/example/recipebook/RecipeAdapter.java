package com.example.recipebook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecipeAdapter  extends RecyclerView.Adapter<RecipeAdapter.MyViewHolder> {
    Context context;
    ArrayList<Recipe> recipeList;


    public RecipeAdapter(Context context, ArrayList<Recipe> recipeList) {
        this.context = context;
        this.recipeList = recipeList;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        // MyViewHolder holds the views (like TextView and ImageView) for one card
        //Think of this like a wrapper for one item in the list.

        ImageView imageView;
        TextView titleTextView;
        TextView shortDescTextView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            shortDescTextView = itemView.findViewById(R.id.shortDescTextView);
        }

    }

    @NonNull
    @Override
    public RecipeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recipe_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.MyViewHolder holder, int position) {
        Recipe recipe = recipeList.get(position);
        holder.titleTextView.setText(recipe.title);
        holder.shortDescTextView.setText(recipe.shortDesc);
        holder.imageView.setImageResource(recipe.image);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, RecipeDetailActivity.class);
            intent.putExtra("title", recipe.title);
            intent.putExtra("fullRecipe", recipe.fullRecipe);
            intent.putExtra("image", recipe.image);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }
}
