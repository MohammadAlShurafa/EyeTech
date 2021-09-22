package com.example.eyetech.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eyetech.Fragments.CategoriesFragment;
import com.example.eyetech.Fragments.ServicesFragment;
import com.example.eyetech.Item;
import com.example.eyetech.MyDbHelper;
import com.example.eyetech.R;

public class CategoryDetailsActivity extends AppCompatActivity {
    ImageView cat_iv_item;
    TextView cat_tv_name, cat_tv_details;
    Item item;
    Intent intent;
    Toolbar toolbar;
    CategoriesFragment categoriesFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_details);

        cat_iv_item = findViewById(R.id.cat_iv_item);
        cat_tv_name = findViewById(R.id.cat_tv_title);
        cat_tv_details = findViewById(R.id.cat_tv_details);
        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        int id = getIntent().getIntExtra("id", 0);
        categoriesFragment = new CategoriesFragment();
        if (id != 0) {
            item = new MyDbHelper(CategoryDetailsActivity.this).getItemById(id);
            cat_iv_item.setImageResource(item.getImageId());
            cat_tv_name.setText(item.getName());
            cat_tv_details.setText(item.getDetails());
            getSupportActionBar().setTitle(item.getName());

            // toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_black_24dp);
        }
    }
}