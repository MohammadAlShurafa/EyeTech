package com.example.eyetech.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;

public class CustomersAdapter extends RecyclerView.Adapter<CustomersAdapter.ViewHolder> {
    Context context;
    ArrayList<Item> customerItems;

    public CustomersAdapter(Context context, ArrayList<Item> customerItems) {
        this.context = context;
        this.customerItems = customerItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.customer_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = customerItems.get(position);
        holder.customerIm.setImageResource(item.getImageId());
    }

    @Override
    public int getItemCount() {
        return customerItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView customerIm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            customerIm = itemView.findViewById(R.id.customerIm);
        }
    }
}
