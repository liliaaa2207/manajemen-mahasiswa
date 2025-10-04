package com.mahasiswa;

public class MataKuliah {
    private String nama;
    private int sks;

    // Constructor
    public MataKuliah(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }
}
