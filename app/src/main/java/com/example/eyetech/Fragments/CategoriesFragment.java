package com.example.eyetech.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eyetech.Adapters.CategoriesAdapter;
import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;

public class CategoriesFragment extends Fragment {
    Toolbar toolbar;
    ArrayList<Item> categoryItems = new ArrayList<>();
    GridLayoutManager gridLayoutManager;
    RecyclerView recyclerView;
    CategoriesAdapter adapter;
    Item item = new Item();

    public CategoriesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        recyclerView = view.findViewById(R.id.categories_recyclerView);
        toolbar = view.findViewById(R.id.toolbar_main);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("الأصناف");
//        toolbar.setNavigationIcon(R.drawable.menu_icon);

        adapter = new CategoriesAdapter(getContext(), categoryItems);
        gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

        Item item1 = new Item(1, "TES824 - نظام الباناسونيك", R.drawable.cat3, "",1);
        Item item2 = new Item(2, "TEA308 - نظام الباناسونيك", R.drawable.cat5, "",2);
        Item item3 = new Item(3, "TDA100 - نظام الباناسونيك", R.drawable.cat1, "",3);
        Item item4 = new Item(4, "كاميرات البوليكوم", R.drawable.cat2, "",4);
        Item item5 = new Item(5, "TP-Link - نقاط وصول", R.drawable.cat4, "",5);
        Item item6 = new Item(6, "Cisco - نقاط وصول", R.drawable.cat6, "",6);
        Item item7 = new Item(7, "TDE600 - نظام الباناسونيك", R.drawable.cat7, "",7);
        Item item8 = new Item(8, "TDE200 - نظام الباناسونيك", R.drawable.cat8, "",8);
        Item item9 = new Item(9, "TDE100 - نظام الباناسونيك", R.drawable.cat9, "",9);
        Item item10 = new Item(10, "TDA200 - نظام الباناسونيك", R.drawable.cat10, "",10);


        categoryItems.add(item1);
        categoryItems.add(item2);
        categoryItems.add(item3);
        categoryItems.add(item4);
        categoryItems.add(item5);
        categoryItems.add(item6);
        categoryItems.add(item7);
        categoryItems.add(item8);
        categoryItems.add(item9);
        categoryItems.add(item10);


/*
        Item item2 = new Item();
        item2.setImageId(R.drawable.pana100);
        item2.setName("TDA100 - نظام الباناسونيك");
        categoryItems.add(item2);
*/


    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
}