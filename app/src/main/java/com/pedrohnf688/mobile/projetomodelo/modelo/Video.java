package com.pedrohnf688.mobile.projetomodelo.modelo;

import com.pedrohnf688.mobile.projetomodelo.R;

import java.util.ArrayList;
import java.util.List;

public class Video {

    private Integer id;
    private Integer imgPreview;
    private String titulo;
    private String dateCreated;
    private String nomeAutor;

    public Video() {
    }

    public Video(Integer id, Integer imgPreview, String titulo, String dateCreated, String nomeAutor) {
        this.id = id;
        this.imgPreview = imgPreview;
        this.titulo = titulo;
        this.dateCreated = dateCreated;
        this.nomeAutor = nomeAutor;
    }

    public List<Video> getVideos(){
        List<Video> videoList = new ArrayList<Video>();

        videoList.add(new Video(1, R.drawable.banco_imagens_gratis,"Spring boot: Spring Data", "11/06/2020","Pedro Henrique"));
        videoList.add(new Video(2, R.drawable.banco_imagens_gratis,"Angular 9: Observable", "12/06/2020","Lucas Matheus"));
        videoList.add(new Video(3, R.drawable.banco_imagens_gratis,"WebService: REST e SOAP", "13/06/2020","João Oliveira"));
        videoList.add(new Video(4, R.drawable.banco_imagens_gratis,"Android: RecyclerView", "14/06/2020","Henrique Pereira"));
        videoList.add(new Video(5, R.drawable.banco_imagens_gratis,"Android: Retrofit", "15/06/2020","Pedro Gabriel"));
        videoList.add(new Video(6, R.drawable.banco_imagens_gratis,"Flutter: Lista de Tarefas", "16/06/2020","Pamela Rodrigues"));
        videoList.add(new Video(7, R.drawable.banco_imagens_gratis,"Python: Flask", "17/06/2020","Carolina Gomes"));

        return videoList;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImgPreview() {
        return imgPreview;
    }

    public void setImgPreview(Integer imgPreview) {
        this.imgPreview = imgPreview;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", imgPreview=" + imgPreview +
                ", titulo='" + titulo + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                '}';
    }
}