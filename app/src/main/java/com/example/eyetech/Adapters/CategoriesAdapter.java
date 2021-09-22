package com.example.eyetech.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eyetech.Activities.CategoryDetailsActivity;
import com.example.eyetech.Activities.ServiceDetailsActivity;
import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {
    Context context;
    ArrayList<Item> categoryItems;

    public CategoriesAdapter(Context context, ArrayList<Item> categoryItems) {
        this.context = context;
        this.categoryItems = categoryItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cateogry_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = categoryItems.get(position);
        holder.deviceIm.setImageResource(item.getImageId());
        holder.deviceNameTv.setText(item.getName());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CategoryDetailsActivity.class);
            intent.putExtra("id", item.getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return categoryItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView deviceIm;
        TextView deviceNameTv;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            deviceIm = itemView.findViewById(R.id.customerIm);
            deviceNameTv = itemView.findViewById(R.id.serviceNameTv);
        }
    }



}

