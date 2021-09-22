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

import com.example.eyetech.Activities.ServiceDetailsActivity;
import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;

public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {
    Context context;
    ArrayList<Item> servicesItem;

    public ServicesAdapter(Context context, ArrayList<Item> servicesItem) {
        this.context = context;
        this.servicesItem = servicesItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.service_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = servicesItem.get(position);
        holder.serviceIm.setImageResource(item.getImageId());
        holder.serviceNameTv.setText(item.getName());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ServiceDetailsActivity.class);
            intent.putExtra("id", item.getId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return servicesItem.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView serviceIm;
        TextView serviceNameTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            serviceIm = itemView.findViewById(R.id.customerIm);
            serviceNameTv = itemView.findViewById(R.id.serviceNameTv);
        }
    }
}
