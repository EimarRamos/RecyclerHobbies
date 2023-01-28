package com.eimar_ramos.testexamen_ev2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eimar_ramos.testexamen_ev2.R;
import com.eimar_ramos.testexamen_ev2.models.Hobby;

import java.util.ArrayList;
import java.util.List;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.RecyclerDataHolder> {
    private List<Hobby> listData;
    private OnItemClickListener itemListener;

    public RecyclerDataAdapter(List<Hobby> listData, OnItemClickListener listener) {
        this.listData = listData;
        this.itemListener = listener;
    }

    @NonNull
    @Override
    public RecyclerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hobby_list, parent, false);
        return new RecyclerDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerDataHolder holder, int position) {
        holder.assignData(listData.get(position), itemListener);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class RecyclerDataHolder extends RecyclerView.ViewHolder {
        TextView tipo;
        TextView titulo;
        TextView nota;

        public RecyclerDataHolder(@NonNull View itemView) {
            super(itemView);
            tipo = itemView.findViewById(R.id.txtTpo);
            titulo = itemView.findViewById(R.id.txtTitulo);
            nota = itemView.findViewById(R.id.txtNota);
        }

        public void assignData(final Hobby hobby, final OnItemClickListener onItemClickListener) {
            tipo.setText(hobby.getTipo());
            titulo.setText(hobby.getTitulo());
            nota.setText(Integer.toString(hobby.getNota()));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(hobby);
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Hobby name);
    }}
