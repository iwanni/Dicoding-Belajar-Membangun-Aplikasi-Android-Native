package com.example.iwan_ni.listjualmobil;

import java.io.Serializable;

/**
 * Created by iwan_ni on 24/08/2017.
 */

public class MobilModel implements Serializable {
    String title, image, harga, lokasi;

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
