# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Class dan Object]

## Identitas
- Nama  : [Ahmad Sultoni]
- NIM   : [240202850]
- Kelas : [3IKRA]

---

## Tujuan
Tujuan praktikum minggu pertama ini adalah supaya mahasiswa memahami konsep dasar dari class dan object dalam pemrograman berorientasi objek (OOP).
Selain itu, mahasiswa juga diharapkan bisa membuat contoh program sederhana menggunakan class, dengan menerapkan enkapsulasi, yaitu menyembunyikan data menggunakan modifier private dan mengaksesnya lewat getter dan setter.
---

## Dasar Teori
1. Class adalah blueprint atau rancangan dari sebuah objek. Di dalamnya terdapat atribut dan method yang mendeskripsikan perilaku dari objek tersebut.

2. Object merupakan hasil instansiasi dari class, yaitu bentuk nyata dari blueprint yang dibuat.

3. Enkapsulasi berfungsi untuk melindungi data agar tidak bisa diakses langsung dari luar class.

4. Getter dan Setter digunakan untuk mengambil dan mengubah nilai atribut yang bersifat private.

5. Dengan konsep OOP, program jadi lebih rapi, reusable, dan mudah dikembangkan karena tiap bagian punya tanggung jawab sendiri.
---

## Langkah Praktikum

1.  Membuat project baru bernama ProdukPertanian menggunakan VS Code
2.  Membuat file Produk.java yang berisi class Produk dengan atribut kode, nama, harga, dan stok.
3. Menambahkan konstruktor serta method getter dan setter untuk setiap atribut.
4. Membuat file Main.java untuk mengetes class Produk yang sudah dibuat.
5. Menjalankan program menggunakan terminal dan memastikan output sesuai dengan data input.
6. Melakukan commit dengan pesan:

Commit: Membuat class Produk dengan konsep enkapsulasi (Minggu 1)
---

## Kode Program

```produk.java
// Copublic class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Konstruktor
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        }
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        }
    }
}

#Main.java

public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Padi", 25000, 100);

        System.out.println("Kode Produk : " + p1.getKode());
        System.out.println("Nama Produk : " + p1.getNama());
        System.out.println("Harga       : Rp" + p1.getHarga());
        System.out.println("Stok        : " + p1.getStok());
    }
}

```
)

---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  

)
---

## Analisis
(
 Program berjalan dengan baik dan menampilkan data sesuai yang diinput pada konstruktor.
Konsep enkapsulasi berhasil diterapkan, di mana semua atribut dibuat private dan hanya bisa diakses lewat method getter dan setter.
Pendekatan OOP ini jauh lebih rapi dibanding pemrograman prosedural, karena setiap bagian kode sudah punya perannya sendiri.
Jika nanti ingin menambahkan fitur seperti update stok atau hitung total harga, tinggal menambah method baru di dalam class Produk tanpa mengubah struktur utama program.

Kendala:
Waktu pertama run sempat error karena nama file dan nama class beda (produk.java kecil semua). Setelah disamakan jadi Produk.java, program bisa dijalankan dengan lancar.

)
---

## Kesimpulan
Dari praktikum ini, saya belajar dasar konsep OOP yaitu Class dan Object.
Dengan membuat class Produk, saya jadi paham bagaimana data bisa diatur dan diamankan lewat enkapsulasi.
Program jadi lebih fleksibel dan mudah dikembangkan karena setiap class bisa berdiri sendiri tapi tetap saling terhubung.
Konsep ini penting banget buat project skala besar, seperti aplikasi kasir, sistem stok barang, atau e-commerce.

---

## Quiz
1. Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?
Jawaban:
Supaya data tidak bisa diubah sembarangan dari luar class. Dengan begitu, data tetap aman dan hanya bisa dimodifikasi lewat method resmi (setter).

2. Apa fungsi getter dan setter dalam enkapsulasi?
Jawaban:
Getter dipakai untuk mengambil data, sedangkan setter untuk mengubah data dengan validasi. Dua method ini menjaga supaya perubahan nilai tetap sesuai aturan.

3. Bagaimana class Produk bisa dikembangkan untuk aplikasi yang lebih kompleks?
Jawaban:
Class Produk bisa dijadikan model utama dalam sistem POS atau e-commerce. Nanti bisa ditambah fitur seperti transaksi, diskon, stok otomatis, atau koneksi ke database tanpa harus ubah struktur utama class-nya.
   
