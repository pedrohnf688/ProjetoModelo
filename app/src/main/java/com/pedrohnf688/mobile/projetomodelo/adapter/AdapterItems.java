package com.pedrohnf688.mobile.projetomodelo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pedrohnf688.mobile.projetomodelo.R;
import com.pedrohnf688.mobile.projetomodelo.modelo.Item;

import java.util.List;

public class AdapterItems extends RecyclerView.Adapter {

    private Context context;
    private List<Item> list;
    private Item escolhido;

    public AdapterItems(Context context, List<Item> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout._item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolder viewHolder = (ViewHolder) holder;
        escolhido = list.get(position);

        viewHolder.imgItem.setImageResource(escolhido.getIcone());
        viewHolder.textItem.setText(escolhido.getTitulo());
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final TextView textItem;
        final ImageView imgItem;

        public ViewHolder(View v) {
            super(v);

            textItem = v.findViewById(R.id.textItem);
            imgItem = v.findViewById(R.id.imgItem);
        }
    }

}
