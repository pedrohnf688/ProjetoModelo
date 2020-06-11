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
import com.pedrohnf688.mobile.projetomodelo.modelo.Video;

import java.util.List;

public class AdapterVideos extends RecyclerView.Adapter {

    private Context context;
    private List<Video> list;
    private Video escolhido;

    public AdapterVideos(Context context, List<Video> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout._video, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ViewHolder viewHolder = (ViewHolder) holder;
        escolhido = list.get(position);

        viewHolder.tituloVideo.setText(escolhido.getTitulo());
        viewHolder.nomeAutorVideo.setText(escolhido.getNomeAutor());
        viewHolder.imgPreviewVideo.setImageResource(escolhido.getImgPreview());
        viewHolder.dateCreatedVideo.setText(escolhido.getDateCreated());
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final TextView nomeAutorVideo;
        final TextView dateCreatedVideo;
        final TextView tituloVideo;
        final ImageView imgPreviewVideo;

        public ViewHolder(View v) {
            super(v);

            imgPreviewVideo = v.findViewById(R.id.imgPreviewVideo);
            tituloVideo = v.findViewById(R.id.tituloVideo);
            nomeAutorVideo = v.findViewById(R.id.nomeAutorVideo);
            dateCreatedVideo = v.findViewById(R.id.dateCreatedVideo);
        }
    }

}
