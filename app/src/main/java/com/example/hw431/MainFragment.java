package com.example.hw431;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private ArrayList<String> animals;
    private RecyclerView recyclerView;
    private AnimalAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        recyclerView=view.findViewById(R.id.recycler);
        adapter=new AnimalAdapter(animals);
        recyclerView.setAdapter(adapter);
    }

    private void LoadData() {
        animals=new ArrayList<>();
        for (int i = 1; i <20; i++) {
            animals.add("Dog "+i);
        }
    }
}