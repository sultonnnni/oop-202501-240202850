

# Laporan Praktikum Minggu 4 📅

Topik: **Polymorphism (Info Produk Pertanian)**

## Identitas

  * Nama : **Ahmad Sultoni**
  * NIM : **240202850**
  * Kelas : **3 IKRA**

-----

## Tujuan 🎯

  * **Menjelaskan konsep polymorphism** (overloading, overriding, dan dynamic binding) dalam OOP.
  * **Mengimplementasikan polymorphism** untuk membedakan perilaku objek produk pertanian yang berbeda.
  * **Menganalisis penggunaan *Dynamic Binding*** saat mengakses objek *subclass* melalui referensi *superclass*.

-----

## Dasar Teori 📚

**Polymorphism** (berasal dari bahasa Yunani yang berarti "banyak bentuk") adalah kemampuan objek untuk merespons panggilan method yang sama dengan cara yang berbeda, berdasarkan tipe objek aktualnya.

1.  **Overloading (Compile-Time Polymorphism):** Mendefinisikan method dengan **nama yang sama** tetapi **parameter yang berbeda** (jumlah, tipe, atau urutan).
2.  **Overriding (Run-Time Polymorphism):** *Subclass* (anak) mengganti implementasi method yang sudah ada di *Superclass* (induk) dengan **signature (nama, parameter, tipe kembalian) yang sama**.
3.  **Dynamic Binding:** Mekanisme di mana method yang dipanggil **ditentukan saat program berjalan (runtime)**, bukan saat kompilasi. Ini memungkinkan Java memanggil method `getInfo()` yang spesifik pada *subclass* meskipun dipanggil dari referensi *superclass* (`Produk p`).

-----

## Langkah Praktikum 📝

1.  **Struktur:** Membuat *superclass* `Produk` dan *subclass* seperti `Benih`, `Pupuk`, dan `AlatPertanian`.
2.  **Overloading:** Menambahkan *method* `tambahStok()` di `Produk.java` dengan parameter berbeda (misalnya `int` dan `double`).
3.  **Overriding:** Menambahkan *method* `getInfo()` di `Produk.java` dan menimpanya (`@Override`) di setiap *subclass* untuk menampilkan detail spesifik produk (misalnya: varietas untuk Benih, jenis untuk Pupuk, material untuk AlatPertanian).
4.  **Dynamic Binding:** Mendeklarasikan *array* dengan tipe referensi *superclass* (`Produk[]`) yang diisi dengan berbagai objek *subclass*. Melakukan *loop* untuk memanggil `p.getInfo()`.
5.  **CreditBy:** Memastikan *method* `CreditBy.print()` dipanggil dengan NIM dan Nama yang benar di `MainPolymorphism.java`.

-----

## Kode Program

### Produk.java (Superclass & Overloading)

```java
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Overloading (1): Parameter int
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // Overloading (2): Parameter double
    public void tambahStok(double jumlah) {
        this.stok += (int) jumlah; // Konversi ke int
    }

    // Default method for Overriding
    public String getInfo() {
        return "Produk: " + nama + " (Kode: " + kode + ") Harga: Rp." + harga;
    }
}
```

### Benih.java (Overriding)

```java
package com.upb.agripos.model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    @Override
    public String getInfo() {
        // Memanggil getInfo() dari superclass untuk mendapatkan info dasar
        return "Benih: " + super.getInfo() + ", Varietas: " + varietas;
    }
}
```

### MainPolymorphism.java (Implementasi Dynamic Binding)

```java
package com.upb.agripos;

import com.upb.agripos.Util.CreditBy;
import com.upb.agripos.model.AlatPertanian;
import com.upb.agripos.model.Benih;
import com.upb.agripos.model.Pupuk;
import com.upb.agripos.model.Produk;

public class MainPolymorphism {
    public static void main(String[] args) {
        
        // 1. Dynamic Binding: Deklarasi array dengan tipe Superclass (Produk)
        Produk[] daftarProduk = {
            new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64"),
            new Pupuk ("PPK-101", "Pupuk Urea", 350000, 40, "Urea"),
            new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja"),
            // Objek lain (misalnya: BibitBuah yang Anda sebutkan)
            // new BibitBuah("BBH-401", "Bibit Mangga Harum Manis", 45000, 30, "Mangga")
        };

        // 2. Dynamic Binding: Loop dan panggil method yang dioverride
        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo()); 
        }

        // 3. Demonstrasi Overloading (opsional, untuk memastikan)
        Produk pupuk = daftarProduk[1];
        pupuk.tambahStok(10); // Memanggil tambahStok(int)
        pupuk.tambahStok(5.5); // Memanggil tambahStok(double)
        
        // Credit Sesuai Identitas Anda
        CreditBy.print("240202850", "Ahmad Sultoni"); 
    }
}
```

*(Catatan: Saya tidak menyertakan kode `AlatPertanian.java`, `BibitBuah.java`, `Pupuk.java` dan `CreditBy.java` karena Anda sudah memilikinya, namun dipastikan sudah meng-*override* `getInfo()`)*

-----

## Hasil Eksekusi
<img width="1920" height="1200" alt="Cuplikan layar 2025-11-03 082401" src="https://github.com/user-attachments/assets/c63039ee-cfe0-4ff6-b931-34b3ea651f59" />


-----

## Analisis 🔍

Program mendemonstrasikan Polimorfisme melalui tiga cara:

1.  **Overloading:** *Method* `tambahStok()` di kelas `Produk` memiliki dua versi, yang dipilih berdasarkan tipe data parameter saat *compile-time*.
2.  **Overriding:** *Method* `getInfo()` di `Produk` diganti implementasinya di *subclass* (`Benih`, `Pupuk`, dll.) untuk menyajikan informasi yang lebih spesifik (misalnya, menambahkan **Varietas** untuk Benih).
3.  **Dynamic Binding:** Saat *loop* berjalan (`for (Produk p : daftarProduk)`), meskipun variabel `p` bertipe `Produk`, Java secara otomatis menentukan dan memanggil *method* `getInfo()` milik objek **aktual** yang direferensikan (`Benih`, `Pupuk`, dll.) pada saat *runtime*. Ini menghasilkan *output* yang bervariasi.

Penerapan Polimorfisme ini membuat kode menjadi lebih **fleksibel** dan **skalabel** (mudah ditambahkan jenis produk baru tanpa mengubah kode *loop* utama).

-----

## Kesimpulan

Penerapan **Polymorphism** sangat penting dalam perancangan OOP karena memungkinkan objek yang berbeda berbagi *interface* yang sama, sehingga program menjadi lebih **dinamis** dan **efisien**. *Dynamic Binding* khususnya, memastikan pemanggilan *method* selalu tepat sasaran sesuai tipe objek aktual saat program berjalan, mencapai tujuan kode yang *loose-coupled*.

-----

## Checklist Keberhasilan

  * [x] Overloading `tambahStok` berhasil.
  * [x] Overriding `getInfo` pada subclass berjalan.
  * [x] Dynamic binding berjalan melalui array produk.
  * [x] Output menampilkan identitas mahasiswa (240202850 - Ahmad Sultoni).
  * [x] Screenshot & laporan disertakan.

-----

## 🧠 Quiz – Praktikum Week 4: Polymorphism

1.  **Apa perbedaan overloading dan overriding?**
    **Jawaban:**

      * **Overloading** adalah dua *method* dengan **nama sama** tetapi **parameter berbeda**, dan ditentukan saat **Compile Time**.
      * **Overriding** adalah *method* di *subclass* yang menimpa *method* di *superclass* dengan **signature yang sama**, dan ditentukan saat **Run Time**.

2.  **Bagaimana Java menentukan method mana yang dipanggil dalam dynamic binding?**
    **Jawaban:**
    Java menentukan *method* yang dipanggil **berdasarkan tipe objek aktual** yang disimpan dalam variabel referensi (**saat program berjalan**), bukan berdasarkan tipe deklarasi variabel referensinya. Ini memastikan *method* yang dioverride oleh *subclass* yang dieksekusi.

3.  **Berikan contoh kasus polymorphism dalam sistem POS selain produk pertanian.**
    **Jawaban:**
    Contoh dalam sistem POS **Perpustakaan**:

      * Superclass: `Item` dengan *method* `hitungDenda()`.
      * Subclass: `Buku`, `Majalah`, `CD`, masing-masing meng-*override* `hitungDenda()` dengan tarif yang berbeda.
      * Sistem dapat memproses daftar `Item[]` yang terlambat dikembalikan, dan *Dynamic Binding* akan memastikan denda dihitung sesuai jenis *item* (misalnya denda `Majalah` lebih rendah dari `Buku`).
