package com.example.recipebook;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recipeRecyclerView;
    ArrayList<Recipe> recipeList;
    RecipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recipeRecyclerView=findViewById(R.id.recipeRecyclerView);
        recipeList=new ArrayList<>();
        recipeList.add(new Recipe(
                "Pasta Alfredo","Creamy Italian pasta","Boil pasta with salt and a little oil.\n" +
                "\n" +
                "Drain and rinse with cold water.\n" +
                "\n" +
                "Chop onions, garlic, and veggies (optional).\n" +
                "\n" +
                "Sauté garlic and onions in butter/oil.\n" +
                "\n" +
                "Add veggies and cook lightly.\n" +
                "\n" +
                "For red sauce: add tomato puree + spices.\n" +
                "\n" +
                "For white sauce: add flour, then milk + cheese.\n" +
                "\n" +
                "Mix in boiled pasta.\n" +
                "\n" +
                "Stir well to coat pasta with sauce.\n" +
                "\n" +
                "Garnish with herbs, serve hot.",
                R.drawable.pasta));
        recipeList.add(new Recipe(
                "Pizza Italiano",
                "Cheesy pizza with delicious toppings",
                "Prepare or buy pizza dough.\n" +
                        "\n" +
                        "Preheat oven to 220°C (430°F).\n" +
                        "\n" +
                        "Roll dough into a circle or square.\n" +
                        "\n" +
                        "Spread pizza sauce (tomato + herbs).\n" +
                        "\n" +
                        "Sprinkle shredded mozzarella cheese.\n" +
                        "\n" +
                        "Add toppings: onions, capsicum, mushrooms, chicken, etc.\n" +
                        "\n" +
                        "Add seasonings: oregano, chili flakes.\n" +
                        "\n" +
                        "Drizzle some olive oil on top.\n" +
                        "\n" +
                        "Bake for 12–15 mins until golden.\n" +
                        "\n" +
                        "Slice and serve hot.",
                R.drawable.pizza));
        recipeList.add(new Recipe(
                "Burger",
                "Toasted burger",
                "Shape patties using chicken/veg + spices.\n" +
                        "\n" +
                        "Pan-fry or grill the patties till cooked.\n" +
                        "\n" +
                        "Toast burger buns lightly.\n" +
                        "\n" +
                        "Spread mayo, ketchup, or mustard on buns.\n" +
                        "\n" +
                        "Place lettuce on bottom bun.\n" +
                        "\n" +
                        "Add tomato and onion slices.\n" +
                        "\n" +
                        "Place hot patty on top.\n" +
                        "\n" +
                        "Add cheese slice if needed.\n" +
                        "\n" +
                        "Cover with top bun.\n" +
                        "\n" +
                        "Serve with fries or drink.",
                R.drawable.burger
        ));
        recipeList.add(new Recipe(
                "Cupcakes",
                "Sweetful cupcakes",
                "Preheat oven to 180°C (350°F).\n" +
                        "\n" +
                        "In a bowl, mix flour, baking powder, sugar.\n" +
                        "\n" +
                        "In another bowl, whisk eggs, butter, vanilla extract.\n" +
                        "\n" +
                        "Combine wet and dry ingredients.\n" +
                        "\n" +
                        "Add milk slowly to adjust consistency.\n" +
                        "\n" +
                        "Pour into cupcake liners (¾ full).\n" +
                        "\n" +
                        "Place in cupcake/muffin tray.\n" +
                        "\n" +
                        "Bake for 15–20 mins.\n" +
                        "\n" +
                        "Cool and decorate with frosting.\n" +
                        "\n" +
                        "Serve or store in airtight container.",
                R.drawable.cupcakes
        ));
        recipeList.add(new Recipe(
                "Tacos",
                "Spicy Tacos",
                "Warm taco shells or tortillas.\n" +
                        "\n" +
                        "Cook meat or beans with spices.\n" +
                        "\n" +
                        "Chop toppings: lettuce, tomatoes, onions.\n" +
                        "\n" +
                        "Grate cheese.\n" +
                        "\n" +
                        "Add sour cream, salsa, or mayo.\n" +
                        "\n" +
                        "Layer meat/beans into taco shell.\n" +
                        "\n" +
                        "Add veggies and cheese.\n" +
                        "\n" +
                        "Top with sauces.\n" +
                        "\n" +
                        "Fold or serve open-style.\n" +
                        "\n" +
                        "Serve with lemon wedge or dip.",
                R.drawable.tacos
        ));
        recipeList.add(new Recipe(
                "French Fries",
                " Crispy French Fries",
                "Peel and cut potatoes into thin strips.\n" +
                        "\n" +
                        "Soak in cold water 30 mins.\n" +
                        "\n" +
                        "Drain and pat dry fully.\n" +
                        "\n" +
                        "Heat oil in deep pan.\n" +
                        "\n" +
                        "Fry once on medium heat till soft.\n" +
                        "\n" +
                        "Remove and rest (5 mins).\n" +
                        "\n" +
                        "Re-fry on high heat till crispy.\n" +
                        "\n" +
                        "Drain on paper towels.\n" +
                        "\n" +
                        "Sprinkle salt or seasoning.\n" +
                        "\n" +
                        "Serve with ketchup or mayo.",
                R.drawable.french_fries
        ));
        adapter = new RecipeAdapter(this, recipeList);
        recipeRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        recipeRecyclerView.setAdapter(adapter);





    }
}