package com.example.simpleapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simpleapi.databinding.ItemLayoutBinding;

public class APIAdapter extends RecyclerView.Adapter<APIAdapter.ViewHolder> {

    @NonNull
    @Override
    public APIAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemLayoutBinding binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull APIAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemLayoutBinding binding;

        public ViewHolder(@NonNull ItemLayoutBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());

            binding = itemLayoutBinding;
        }
    }
}
