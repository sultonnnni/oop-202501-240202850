

# Laporan Praktikum Minggu 9

Topik: **Exception Handling (Penanganan Instruksi Tidak Wajar)**

## Identitas

* **Nama** : Ahmad Sultoni
* **NIM** : 240202850
* **Kelas** : 3IKRA

---

## Tujuan

Mahasiswa mampu mengimplementasikan mekanisme **Exception Handling** menggunakan blok `try-catch` dan keyword `throw` untuk menangani kesalahan logika program (seperti stok habis atau input tidak valid) agar aplikasi tidak berhenti secara paksa (*crash*).

---

## Dasar Teori

1. **Exception**: Sebuah objek yang merepresentasikan kejadian luar biasa atau kesalahan yang terjadi saat program sedang berjalan (runtime).
2. **Try-Catch**: Blok kode yang digunakan untuk mencoba menjalankan perintah yang berisiko error (`try`) dan menangkap kesalahan tersebut jika terjadi (`catch`).
3. **Custom Exception**: Pembuatan class pengecualian sendiri (misal: `KeranjangException`) untuk menangani kasus spesifik dalam logika bisnis aplikasi.
4. **Throw**: Keyword yang digunakan untuk melempar exception secara manual ketika suatu kondisi validasi tidak terpenuhi.

---

## Langkah Praktikum

1. **Persiapan**: Membuka VS Code dan menuju ke folder `praktikum/week9-exception-handling/`.
2. **Coding**: Membuat file `MainExceptionDemo.java` yang berisi class `Product`, `ShoppingCart`, dan `KeranjangException`.
3. **Identitas**: Menyesuaikan output program agar menampilkan nama **Ahmad Sultoni** dan NIM **240202850**.
4. **Kompilasi**: Menjalankan perintah `javac MainExceptionDemo.java` di terminal untuk mengubah kode sumber menjadi bytecode.
5. **Eksekusi**: Menjalankan program menggunakan perintah `java MainExceptionDemo` dan mengamati hasil penangkapan error di terminal.

---

## Kode Program

```java
// Bagian utama penanganan Exception dalam MainExceptionDemo.java
try {
    // Validasi stok produk (Pupuk Organik dengan stok 5, diminta 10)
    cart.validateStock(pupuk, 10);
} catch (KeranjangException e) {
    // Menampilkan pesan kesalahan tanpa menghentikan program
    System.out.println("Kesalahan: " + e.getMessage());
}

```

---

## Hasil Eksekusi

https://github.com/sultonnnni/oop-202501-240202850/blob/86581ff0373a9cfc00478c6635eebcbda2c60b50/praktikum/week9-exception-handling/screenshots/Cuplikan%20layar%202026-01-05%20095504.png

---

## Analisis

* **Alur Kode**: Program secara sengaja menguji kondisi yang salah (seperti memasukkan quantity 0 atau meminta stok melebihi batas). Saat kondisi ini terdeteksi, program melempar `KeranjangException`.
* **Mekanisme**: Karena kode dibungkus dalam blok `try-catch`, program tidak berhenti (force close), melainkan langsung melompat ke blok `catch` untuk mencetak pesan edukatif di terminal.
* **Kendala & Solusi**: Terdapat kendala "Could not find main class" dan masalah *classpath* pada VS Code. Kendala ini diatasi dengan melakukan kompilasi dan pemanggilan program secara manual lewat terminal.

---

## Kesimpulan

Dengan menerapkan *Exception Handling*, program menjadi lebih tangguh (*robust*) karena mampu menangani kesalahan pengguna atau data secara mandiri tanpa merusak alur kerja aplikasi secara keseluruhan.

---

## Quiz

1. **Apa fungsi dari blok `finally`?**
**Jawaban:** Blok yang akan selalu dijalankan baik terjadi exception maupun tidak, biasanya digunakan untuk menutup koneksi database atau file.
2. **Apa perbedaan antara `throw` dan `throws`?**
**Jawaban:** `throw` digunakan untuk melempar exception secara manual di dalam method, sedangkan `throws` digunakan di signature method untuk memberitahu bahwa method tersebut berpotensi menghasilkan exception.

