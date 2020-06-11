package com.pedrohnf688.mobile.projetomodelo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pedrohnf688.mobile.projetomodelo.R;
import com.pedrohnf688.mobile.projetomodelo.adapter.AdapterItems;
import com.pedrohnf688.mobile.projetomodelo.adapter.AdapterVideos;
import com.pedrohnf688.mobile.projetomodelo.modelo.Item;
import com.pedrohnf688.mobile.projetomodelo.modelo.Video;

import java.util.List;

public class HomeFragment extends Fragment {

    List<Item> itemList;
    List<Video> videoList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        final RecyclerView listaItemsRecyclerView = view.findViewById(R.id.listaItemsRecyclerView);
        final RecyclerView listaVideosRecyclerView = view.findViewById(R.id.listaVideosRecyclerView);

        itemList = new Item().getItems();
        videoList = new Video().getVideos();

        listaItemsRecyclerView.setAdapter(new AdapterItems(getContext(), itemList));
        listaVideosRecyclerView.setAdapter(new AdapterVideos(getContext(), videoList));

        RecyclerView.LayoutManager layoutItem = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        listaItemsRecyclerView.setLayoutManager(layoutItem);
        listaItemsRecyclerView.setItemAnimator(new DefaultItemAnimator());

        RecyclerView.LayoutManager layoutVideo = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listaVideosRecyclerView.setLayoutManager(layoutVideo);
        listaVideosRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }

}
