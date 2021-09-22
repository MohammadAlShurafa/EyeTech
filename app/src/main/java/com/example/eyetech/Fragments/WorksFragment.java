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
import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;

public class WorksFragment extends Fragment {
    ArrayList<Item> workItem = new ArrayList<>();
    RecyclerView recyclerView;
    CustomersAdapter adapter;

    public WorksFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_works, container, false);
        recyclerView = view.findViewById(R.id.works_recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CustomersAdapter(getContext(), workItem);
        recyclerView.setAdapter(adapter);

        Item item1 = new Item(1, "", R.drawable.g1, "",1);
        Item item2 = new Item(2, "", R.drawable.g2, "",1);
        Item item3 = new Item(3, "", R.drawable.g3, "",1);
        Item item4 = new Item(4, "", R.drawable.g4, "",1);
        Item item5 = new Item(5, "", R.drawable.g5, "",1);

        workItem.add(item1);
        workItem.add(item2);
        workItem.add(item3);
        workItem.add(item4);
        workItem.add(item5);

    }
}