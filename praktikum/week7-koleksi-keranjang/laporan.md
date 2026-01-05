Berikut adalah draf laporan praktikum yang sudah disusun secara sistematis berdasarkan kode dan hasil eksekusi yang telah kamu selesaikan tadi.

---

# Laporan Praktikum Minggu 7

Topik: **Koleksi Objek (Collection) - ArrayList dalam Keranjang Belanja**

## Identitas

* **Nama** : Ahmad Sultoni
* **NIM** : 240202850
* **Kelas** : [Silakan isi kelasmu, misal: TI-A]

---

## Tujuan

Mahasiswa mampu mengimplementasikan konsep *Collection* (khususnya `ArrayList`) untuk mengelola sekumpulan objek dalam satu wadah (keranjang belanja), serta memahami cara menambah dan menghapus objek dari daftar tersebut.

---

## Dasar Teori

1. **Collection Framework**: Kumpulan class dan interface di Java untuk menyimpan dan memanipulasi grup objek.
2. **ArrayList**: Class yang mengimplementasikan interface `List` untuk menyimpan data secara dinamis (ukuran dapat berubah-ubah).
3. **Encapsulation**: Mengamankan data dengan menggunakan akses `private` dan menyediakan `getter` untuk mengakses nilai atribut.

---

## Langkah Praktikum

1. **Persiapan**: Membuat file Java baru dengan nama `Maincart.java`.
2. **Coding**: Menggabungkan class `Product`, `ShoppingCart`, dan `Maincart` ke dalam satu file terpadu.
3. **Setup Identitas**: Mengubah kode `System.out.println` untuk mencantumkan nama Ahmad Sultoni dan NIM 240202850.
4. **Execution**: Melakukan *compile* dan *running* program melalui terminal VS Code untuk memastikan output sesuai dengan permintaan.

---

## Kode Program

```java
// Bagian utama program dalam Maincart.java
public class Maincart {
    public static void main(String[] args) {
        System.out.println("Hello, I am Ahmad Sultoni-240202850 (Week7)");

        Product p1 = new Product("P01", "Beras", 50000, 0);
        Product p2 = new Product("P02", "Pupuk", 30000, 0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.printCart();

        System.out.println("\nSetelah menghapus " + p1.getCode() + " " + p1.getName() + " dari keranjang:");
        cart.removeProduct(p1);
        cart.printCart();
    }
}

```

---

## Hasil Eksekusi

https://github.com/sultonnnni/oop-202501-240202850/blob/2575d5734cecbce88a2a7809c6ebfb9076e74f4f/praktikum/week7-koleksi-keranjang/screenshots/Cuplikan%20layar%202026-01-05%20094116.png
*Keterangan: Output terminal menunjukkan program berhasil mencetak list awal, menghapus produk 'Beras', dan menghitung total harga dengan benar.*

---

## Analisis

* **Alur Kode**: Program dimulai dengan inisialisasi dua objek `Product`. Objek tersebut dimasukkan ke dalam `ArrayList` di dalam class `ShoppingCart`. Metode `printCart` melakukan perulangan (*looping*) untuk menjumlahkan harga.
* **Perbedaan Pendekatan**: Minggu ini menggunakan `ArrayList` yang memungkinkan penambahan jumlah data secara fleksibel, berbeda dengan *Array* biasa yang ukurannya harus ditentukan di awal.
* **Kendala**: Terjadi error "not on classpath" di VS Code.
* **Solusi**: Mengatasi kendala dengan menghapus deklarasi `package` dan menjalankan program secara langsung di terminal atau melalui tombol Run setelah membersihkan notifikasi yang tertunda.

---

## Kesimpulan

Penggunaan `ArrayList` sangat efektif untuk membuat sistem keranjang belanja karena kita dapat menambah (`add`) dan menghapus (`remove`) item secara dinamis tanpa perlu khawatir dengan batasan kapasitas penyimpanan data.

---

## Quiz

*(Catatan: Isian ini tergantung pada pertanyaan di modulmu, berikut contoh jawaban umum untuk Week 7)*

1. **Apa perbedaan List dan Map?** **Jawaban:** `List` menyimpan data secara berurutan berdasarkan indeks, sedangkan `Map` menyimpan data dalam pasangan Key-Value (seperti kamus).
2. **Mengapa menggunakan ArrayList lebih baik daripada Array biasa untuk keranjang belanja?** **Jawaban:** Karena jumlah belanjaan pembeli tidak tetap; `ArrayList` bisa bertambah luas sesuai jumlah barang, sedangkan Array biasa ukurannya kaku.

