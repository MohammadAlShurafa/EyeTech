package com.example.eyetech.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eyetech.Adapters.CategoriesAdapter;
import com.example.eyetech.Adapters.ServicesAdapter;
import com.example.eyetech.Item;
import com.example.eyetech.R;

import java.util.ArrayList;

public class ServicesFragment extends Fragment {
    ArrayList<Item> serviceItem = new ArrayList<>();
    RecyclerView recyclerView;
    ServicesAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_services, container, false);
        recyclerView  = view.findViewById(R.id.services_recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ServicesAdapter(getContext(), serviceItem);
        recyclerView.setAdapter(adapter);

        Item item1 = new Item(1, "تركيب سنترالات الباناسونيك الحديثة", R.drawable.service1, "",1);
        Item item2 = new Item(2, "إعداد وتجهيز غرف السيرفر", R.drawable.service2, "",1);
        Item item3 = new Item(3, "توريد و تركيب شبكات الكمبيوتر والإنترنت", R.drawable.service3, "",1);
        Item item4 = new Item(4, "تأجير أنظمة الاتصال المرئي", R.drawable.service4, "", 1);
        Item item5 = new Item(5, "أنظمة كوابل الألياف الضوئية", R.drawable.service5, "", 1);
        Item item6 = new Item(6, "صيانة أجهزة ال UPS و الأجهزة الإلكترونية", R.drawable.service6, "", 1);


        serviceItem.add(item1);
        serviceItem.add(item2);
        serviceItem.add(item3);
        serviceItem.add(item4);
        serviceItem.add(item5);
        serviceItem.add(item6);


    }
//    private void animateToFragment(Fragment newFragment, String tag) {
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.fragment_container, newFragment, tag);
//        ft.addToBackStack(null);
//        ft.commit();
//    }
}