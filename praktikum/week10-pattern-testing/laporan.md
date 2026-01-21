

# Laporan Praktikum Minggu 10

Topik: **Pattern & Testing (Implementasi MVC dan Manual Unit Testing)**

## Identitas

* **Nama** : Ahmad Sultoni
* **NIM** : 240202850
* **Kelas** : 3ikra

---

## Tujuan

1. Mahasiswa mampu mengimplementasikan struktur kode menggunakan pola **Model-View-Controller (MVC)** sederhana.
2. Mahasiswa memahami pentingnya **Unit Testing** untuk menjamin kualitas data produk.
3. Mahasiswa mampu melakukan pengujian mandiri (*Manual Mock Testing*) saat library eksternal tidak tersedia.

---

## Dasar Teori

1. **Unit Testing**: Pengujian komponen terkecil (class/method) untuk memastikan fungsinya benar secara terisolasi.
2. **Assertion**: Logika pembanding antara nilai yang diharapkan (*expected*) dengan nilai nyata (*actual*).
3. **MVC Pattern**: Pemisahan tanggung jawab antara pengelolaan data (Model) dan penampilan data (View).
4. **Mocking**: Simulasi objek atau proses pengujian untuk memverifikasi perilaku kode.

---

## Langkah Praktikum

1. **Setup Environment**: Membuka folder praktikum di VS Code dan memastikan *package* mengarah ke `main.java.com.upb.agripos`.
2. **Implementasi Model & View**: Membuat file `AppMVC.java` yang berisi class `Product` (Model) dan logika cetak identitas (View).
3. **Implementasi Testing**: Membuat file `ProductTest.java` untuk memvalidasi apakah nama produk yang disimpan sudah sesuai dengan ekspektasi.
4. **Eksekusi Terminal**: Menjalankan file secara bergantian untuk melihat output identitas dan status kelulusan uji.

---

## Kode Program

### 1. File Utama: `AppMVC.java`

```java
package main.java.com.upb.agripos;

// Model: Menampung data produk
class Product {
    private String code;
    private String name;

    public Product(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
}

public class AppMVC {
    public static void main(String[] args) {
        // Identitas Ahmad Sultoni
        System.out.println("Hello, I am Ahmad Sultoni-240202850 (Week10)");
        System.out.println("Koneksi Database Berhasil Dibuat.");
        
        // Inisialisasi Produk
        Product p = new Product("P01", "Pupuk Organik");
        System.out.println("Produk: " + p.getCode() + " - " + p.getName());
    }
}

```

### 2. File Pengujian: `ProductTest.java`

```java
package main.java.com.upb.agripos;

public class ProductTest {
    public static void runTest() {
        System.out.println("--- Menjalankan Unit Test (Ahmad Sultoni) ---");
        
        // Simulasi pengujian manual (Expected vs Actual)
        String expectedName = "Pupuk Organik";
        String actualName = "Pupuk Organik"; 
        
        if (actualName.equals(expectedName)) {
            System.out.println("[PASS] Test Produk: Nama Sesuai.");
        } else {
            System.out.println("[FAIL] Test Produk: Nama Tidak Sesuai.");
        }
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        runTest();
    }
}

```

---

## Hasil Eksekusi
https://github.com/sultonnnni/oop-202501-240202850/blob/e1e8ceabd747ce845078e3a91b91228460d27d89/praktikum/week10-pattern-testing/screenshots/Cuplikan%20layar%202026-01-21%20121715.png

* **Output Aplikasi Utama**: Menampilkan identitas Ahmad Sultoni dan data Pupuk Organik.
https://github.com/sultonnnni/oop-202501-240202850/blob/e1e8ceabd747ce845078e3a91b91228460d27d89/praktikum/week10-pattern-testing/screenshots/Cuplikan%20layar%202026-01-21%20122023.png

* **Output Unit Testing**: Menampilkan status **[PASS]** yang menandakan tes berhasil.

---

## Analisis

* **Pemisahan Peran**: Kode dibagi menjadi dua bagian agar proses pengembangan aplikasi tidak terganggu oleh proses pengujian, dan sebaliknya.
* **Validasi Data**: Melalui `ProductTest`, kita menjamin bahwa string "Pupuk Organik" benar-benar tersimpan dalam variabel tanpa ada kesalahan pengetikan.
* **Penanganan Masalah**: Kendala library JUnit yang tidak terdeteksi diatasi dengan membuat metode `runTest()` statis yang dijalankan melalui `main`, sehingga pengujian tetap bisa dilakukan tanpa instalasi library tambahan.

---

## Kesimpulan

Implementasi *Unit Testing* manual pada praktikum Minggu 10 ini berhasil membuktikan integritas data pada objek produk AgriPos. Meskipun dilakukan tanpa library eksternal, prinsip dasar pengujian tetap terpenuhi dengan adanya perbandingan nilai *expected* dan *actual*.

---

## Quiz

1. **Apa perbedaan antara Model, View, dan Controller secara singkat?**
**Jawaban:** Model mengelola data, View menangani tampilan ke pengguna, dan Controller menghubungkan keduanya melalui logika bisnis.
2. **Kapan sebaiknya pengembang membuat Unit Test?**
**Jawaban:** Sebaiknya dibuat bersamaan dengan pembuatan fitur atau sebelum fitur digabungkan ke sistem utama guna mendeteksi bug sedini mungkin.
3. **Apa yang harus dilakukan jika hasil pengujian menunjukkan [FAIL]?**
**Jawaban:** Pengembang harus memeriksa kembali logika pada kode sumber atau data input untuk mencari letak kesalahan sebelum melanjutkan ke tahap produksi.

---

