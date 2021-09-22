package com.example.eyetech.Fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.eyetech.R;

public class AdminFragment extends Fragment {
    AppCompatEditText usernameEt, passwordEt;
    AppCompatButton loginBtn;
    FrameLayout frameLayout;

    public AdminFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_admin, container, false);
        usernameEt = view.findViewById(R.id.et_username);
        passwordEt = view.findViewById(R.id.et_password);
        loginBtn = view.findViewById(R.id.login_btn);
        frameLayout = view.findViewById(R.id.frame);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences("Login", getContext().MODE_PRIVATE);

//        String username = sharedPreferences.getString("username", "admin");
//        String password = sharedPreferences.getString("password", "123456");
//        usernameEt.setText(username);
//        passwordEt.setText(password);

        loginBtn.setOnClickListener(v -> {

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("username", "admin");
            editor.putString("password", "123456");
            editor.commit();

//            getActivity().getSupportFragmentManager().beginTransaction().replace(frameLayout.getId(), new HomeFragment(), "m").commit();
            
//            SharedPreferences sharedPreferences1 = getContext().getSharedPreferences("Login", getContext().MODE_PRIVATE);
//
//            String username = sharedPreferences1.getString("username", usernameEt.getText().toString().trim());
//            String password = sharedPreferences1.getString("password", passwordEt.getText().toString().trim());


//            sharedPreferences.getString("username", "admin");
//            sharedPreferences.getString("password", "123456");

//            String username2 = usernameEt.getText().toString().trim();
//            String password2 = passwordEt.getText().toString().trim();
//
//            editor.putString("Username", username2);
//            editor.putString("Password", password2);

        });


    }
}