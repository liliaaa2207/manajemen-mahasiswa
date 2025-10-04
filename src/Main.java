package com.mahasiswa;

public class Main {
    public static void main(String[] args) {
        // Buat array untuk menyimpan daftar mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

        // Inisialisasi objek Mahasiswa
        daftarMahasiswa[0] = new Mahasiswa("Budi", "12345");
        daftarMahasiswa[1] = new Mahasiswa("Ani", "67890");
        daftarMahasiswa[2] = new Mahasiswa("Cici", "11223");

        // Tambahkan mata kuliah untuk masing-masing mahasiswa
        MataKuliah mk1 = new MataKuliah("Pemrograman", 3);
        MataKuliah mk2 = new MataKuliah("Struktur Data", 4);
        MataKuliah mk3 = new MataKuliah("Matematika Diskrit", 2);

        daftarMahasiswa[0].tambahMataKuliah(mk1);
        daftarMahasiswa[0].tambahMataKuliah(mk2);

        daftarMahasiswa[1].tambahMataKuliah(mk3);

        daftarMahasiswa[2].tambahMataKuliah(mk1);
        daftarMahasiswa[2].tambahMataKuliah(mk3);

        // Looping untuk menampilkan semua data mahasiswa
        System.out.println("===== DATA MAHASISWA =====");
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanInfo();
            System.out.println("---------------------------");
        }
    }
}
