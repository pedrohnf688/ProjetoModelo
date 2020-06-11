package com.pedrohnf688.mobile.projetomodelo.modelo;

import com.pedrohnf688.mobile.projetomodelo.R;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private Integer id;
    private Integer icone;
    private String titulo;

    public Item() {
    }

    public Item(Integer id, Integer icone, String titulo) {
        this.id = id;
        this.icone = icone;
        this.titulo = titulo;
    }

    public List<Item> getItems(){
        List<Item> itemList = new ArrayList<Item>();

        itemList.add(new Item(1, R.drawable.ic_dashboard_black_24dp,"Avaliação SocioEconômica"));
        itemList.add(new Item(1, R.drawable.ic_notifications_black_24dp,"Avaliação de Saude"));
        itemList.add(new Item(1, R.drawable.ic_home_black_24dp,"Avaliação Final"));
        itemList.add(new Item(1, R.drawable.ic_check_circle_black_24dp,"Resultados"));
        itemList.add(new Item(1, R.drawable.ic_person_black_24dp,"Suporte"));

        return itemList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIcone() {
        return icone;
    }

    public void setIcone(Integer icone) {
        this.icone = icone;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", icone='" + icone + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
