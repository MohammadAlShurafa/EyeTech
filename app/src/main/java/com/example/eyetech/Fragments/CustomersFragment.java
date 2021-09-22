package com.example.eyetech.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eyetech.Adapters.CustomersAdapter;
import com.example.eyetech.Adapters.ServicesAdapter;
import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;


public class CustomersFragment extends Fragment {
    ArrayList<Item> customerItem = new ArrayList<>();
    RecyclerView recyclerView;
    CustomersAdapter adapter;

    public CustomersFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_customers, container, false);
        recyclerView = view.findViewById(R.id.customers_recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CustomersAdapter(getContext(), customerItem);
        recyclerView.setAdapter(adapter);

        Item item1 = new Item(1, "", R.drawable.amideast, "",3);
        Item item2 = new Item(2, "", R.drawable.roots, "",3);
        Item item3 = new Item(3, "", R.drawable.mathaf, "",3);
        Item item4 = new Item(4, "", R.drawable.skills, "",3);
        Item item5 = new Item(5, "", R.drawable.unisef, "",3);



        customerItem.add(item1);
        customerItem.add(item2);
        customerItem.add(item3);
        customerItem.add(item4);
        customerItem.add(item5);

    }
}