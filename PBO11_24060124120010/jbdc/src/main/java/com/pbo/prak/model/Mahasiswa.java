package com.pbo.prak.model;

public class Mahasiswa {
    private Integer id;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(Integer id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
