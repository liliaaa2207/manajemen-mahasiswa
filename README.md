# Proyek Manajemen Mahasiswa (Java OOP)

## Deskripsi Singkat
Program **Manajemen Mahasiswa** ini dibuat untuk menerapkan konsep **Object-Oriented Programming (OOP)** pada bahasa pemrograman **Java**.  
Program ini memungkinkan pengguna untuk mengelola data mahasiswa beserta daftar mata kuliah yang diambil, menghitung total SKS, dan menampilkan informasi lengkap mahasiswa.

Fitur-fitur yang diimplementasikan:
- Input dan menampilkan data mahasiswa.
- Menambahkan daftar mata kuliah.
- Menghitung total SKS.
- Validasi sederhana jika jumlah SKS melebihi batas tertentu (misal 24 SKS).
- Penanganan **Exception** untuk mencegah error saat input data tidak valid.
- Penerapan konsep dasar Java: class, object, constructor, method, array, looping, string, dan exception handling.

---

## Desain Class

```plaintext
+----------------------+
|      Mahasiswa       |
+----------------------+
| - nama: String       |
| - nim: String        |
| - semester: int      |
| - ipk: double        |
| - mataKuliah[]: ...  |
+----------------------+
| + tampilkanData()    |
| + hitungTotalSKS()   |
+----------------------+

        ▲
        │
        │
+----------------------+
|     MataKuliah       |
+----------------------+
| - namaMK: String     |
| - sks: int           |
+----------------------+
| + tampilkanMK()      |
+----------------------+

        ▲
        │
        │
+----------------------+
|        Main          |
+----------------------+
| + main(String[])     |
| + inputData()        |
| + tampilkanMenu()    |
+----------------------+

Link video YouTube = https://youtu.be/V0z24XcR0HE
