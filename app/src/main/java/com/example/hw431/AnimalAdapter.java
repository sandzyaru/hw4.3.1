package com.example.hw431;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    private ArrayList<String> data;
    public AnimalAdapter(ArrayList<String> data) {
        this.data = data;
    }
    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_animal, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder{
        private TextView animal;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            animal=itemView.findViewById(R.id.text_animal);
        }

        public void bind(String name) {
            animal.setText(name);
        }
    }
}
