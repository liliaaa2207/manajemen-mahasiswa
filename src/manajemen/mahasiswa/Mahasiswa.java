package com.mahasiswa;

public class Mahasiswa {
    private String nama;
    private String nim;
    private MataKuliah[] daftarMataKuliah;
    private int jumlahMK;

    // Konstanta
    private static final int MAKS_MK = 5;

    // Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.daftarMataKuliah = new MataKuliah[MAKS_MK];
        this.jumlahMK = 0;
    }

    // Method untuk menambah mata kuliah
    public void tambahMataKuliah(MataKuliah mk) {
        if (jumlahMK < MAKS_MK) {
            daftarMataKuliah[jumlahMK] = mk;
            jumlahMK++;
        } else {
            System.out.println("Mata kuliah sudah mencapai batas maksimum!");
        }
    }

    // Method untuk menampilkan info mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Daftar Mata Kuliah:");
        if (jumlahMK == 0) {
            System.out.println("- Belum mengambil mata kuliah.");
        } else {
            for (int i = 0; i < jumlahMK; i++) {
                System.out.println("  - " + daftarMataKuliah[i].getNama() + " (" + daftarMataKuliah[i].getSks() + " SKS)");
            }
        }
    }
}
