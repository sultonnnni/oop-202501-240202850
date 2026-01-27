
# 📘 **Laporan Praktikum Week 14**

**Topik:** *Integrasi Individu (OOP + Database + GUI + Testing)*

---

## Identitas

| **Nama**  | **Ahmad Sultoni** |
| **NIM**   | **240202850**     |
| **Kelas** | **3 IKRA**        |

---

## 1. Ringkasan Aplikasi (Agri-POS)

Agri-POS adalah aplikasi kasir sederhana untuk toko pertanian. Aplikasi ini memiliki fitur:

1. **Manajemen Produk (CRUD):** Menambah, melihat, dan menghapus produk yang tersimpan di database PostgreSQL.
2. **Keranjang Belanja:** Menambahkan produk ke keranjang, menghitung total belanja secara otomatis menggunakan Java Collections.
3. **Validasi Sistem:** Mencegah input harga negatif atau stok kosong menggunakan Custom Exception.
4. **Persistensi Data:** Semua data produk terhubung langsung ke database.

---

## 2. Keterangan Integrasi (Bab 1–13)

* **Bab 1–5 (OOP):** Penerapan *Encapsulation* pada Model (`Product`, `CartItem`) dan *Abstraction* pada interface `ProductDAO`.
* **Bab 6 (SOLID):** Penerapan *Single Responsibility Principle (SRP)* dengan pemisahan View, Controller, Service, dan DAO.
* **Bab 7 (Collections):** Penggunaan `HashMap` untuk pengelolaan keranjang belanja agar akses data lebih efisien.
* **Bab 9 (Exception):** Custom Exception `AgriPosException` untuk validasi aturan bisnis.
* **Bab 10 (Design Pattern & Testing):**

  * **Singleton Pattern** pada koneksi database
  * **JUnit** untuk pengujian logika perhitungan keranjang
* **Bab 11 (JDBC):** Akses database PostgreSQL menggunakan `PreparedStatement`.
* **Bab 12–13 (GUI):** Antarmuka grafis berbasis JavaFX (`TableView`, `Alert`, *Lambda Expression*).

---

## 3. Artefak UML (Desain Bab 6)

### Class Diagram, Activity Diagram, Sequence Diagram, Use Case Diagram

*(Disesuaikan dengan arsitektur MVC + Service + DAO pada aplikasi Agri-POS)*

---

## 4. Tabel Traceability (Implementasi)

| Artefak Bab 6 | Referensi              | Handler / Trigger            | Controller / Service                                               | DAO                    | Dampak                                             |
| ------------- | ---------------------- | ---------------------------- | ------------------------------------------------------------------ | ---------------------- | -------------------------------------------------- |
| **Use Case**  | UC-01 Tambah Produk    | Tombol *Simpan Produk*       | `PosController.addProduct()` → `ProductService.addProduct()`       | `ProductDAO.insert()`  | Data tersimpan di database dan tabel diperbarui    |
| **Use Case**  | UC-02 Hapus Produk     | Tombol *Hapus Produk*        | `PosController.deleteProduct()` → `ProductService.deleteProduct()` | `ProductDAO.delete()`  | Data terhapus dari database                        |
| **Activity**  | AD-01 Tambah Keranjang | Tombol *Tambah ke Keranjang* | `PosController.addToCart()` → `CartService.addItem()`              | –                      | Data tersimpan di memori & total belanja terhitung |
| **Sequence**  | SD-01 Load Data        | Start Aplikasi               | `PosController.loadData()` → `ProductService.getAllProducts()`     | `ProductDAO.findAll()` | Data tampil di `TableView`                         |

---

## 5. Kendala & Solusi

1. **Kendala:** Sinkronisasi stok database dengan data keranjang.
   **Solusi:** Keranjang hanya menyimpan data sementara (in-memory), validasi stok dilakukan sebelum item ditambahkan.

2. **Kendala:** Koneksi database dibuat berulang kali.
   **Solusi:** Menggunakan **Singleton Pattern** pada `DatabaseHelper` agar koneksi hanya dibuat satu kali.

---

## 📂 Implementasi Kode Program

*(Kode tetap sama, **tidak perlu diubah**, kecuali bagian identitas di Main Application)*

---

### 🔧 Perubahan Penting (WAJIB DIGANTI)

#### **File:** `AppJavaFX.java`

```java
@Override
public void start(Stage stage) {
    // Console Identity
    System.out.println("Hello World, I am Ahmad Sultoni - 240202850");

    PosView view = new PosView();
    new PosController(view);

    Scene scene = new Scene(view, 800, 500);
    stage.setTitle("Agri-POS Integrated System (Week 14)");
    stage.setScene(scene);
    stage.show();
}
```

---

