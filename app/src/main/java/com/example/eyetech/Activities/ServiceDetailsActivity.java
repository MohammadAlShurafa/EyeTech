package com.example.eyetech.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.eyetech.Fragments.ServicesFragment;
import com.example.eyetech.Item;
import com.example.eyetech.MyDbHelper;
import com.example.eyetech.R;

public class ServiceDetailsActivity extends AppCompatActivity {
    ImageView iv_item;
    TextView tv_name, tv_details;
    Item item;
    Intent intent;
    Toolbar toolbar;
    ServicesFragment servicesFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_details);

        iv_item = findViewById(R.id.iv_item);
        tv_name = findViewById(R.id.tv_title);
        tv_details = findViewById(R.id.tv_details);
        toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        int id = getIntent().getIntExtra("id", 0);
        servicesFragment = new ServicesFragment();
        if (id != 0) {
            item = new MyDbHelper(ServiceDetailsActivity.this).getItemById(id);
            iv_item.setImageResource(item.getImageId());
            tv_name.setText(item.getName());
            tv_details.setText(item.getDetails());
            getSupportActionBar().setTitle(item.getName());

            // toolbar.setNavigationIcon(R.drawable.ic_arrow_forward_black_24dp);
        }

    }
}