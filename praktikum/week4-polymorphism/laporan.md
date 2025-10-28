# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

## Identitas
- Nama  : [Ahmad Sultoni]
- NIM   : [240202850]
- Kelas : [3IKRA]

---

## Tujuan
1.Mahasiswa memahami dan mampu mengimplementasikan konsep Inheritance (Pewarisan) di Java.

2.Mahasiswa dapat membuat Superclass (Produk) dan Subclass (misalnya Benih, Pupuk) untuk memodelkan data produk yang memiliki hierarki.

3.Mahasiswa mampu menggunakan kata kunci super untuk memanggil constructor dan method dari Superclass.

Dasar Teori

---

## Dasar Teori
1.Inheritance (Pewarisan): Mekanisme dalam OOP yang memungkinkan sebuah class anak (subclass) mewarisi atribut dan method dari class induk (superclass). Tujuan utamanya adalah code reusability.

2.Superclass & Subclass: Superclass (misalnya Produk) adalah class yang diwariskan, sementara Subclass (misalnya Benih) adalah class yang mewarisi (extend) Superclass.

3.Kata Kunci super: Digunakan di dalam Subclass untuk merujuk pada anggota Superclass. Ini wajib digunakan untuk memanggil constructor Superclass (super(...)) agar atribut yang diwarisi dapat diinisialisasi.

4.Overriding Method: Subclass dapat mengubah implementasi method yang sudah ada di Superclass (walaupun dalam kasus ini kita hanya memperluas dengan method baru yang memanggil method super).
---

## Langkah Praktikum
1.Setup File: Membuat class induk Produk.java dan class utama Main.java.

2.Implementasi Superclass: Class Produk.java dibuat dengan atribut dasar (kode, nama, harga, stok) yang sifatnya umum untuk semua produk.

3.Implementasi Subclass: Enam Subclass (seperti Benih, Pupuk, Pestisida) dibuat dan mewarisi (extends) class Produk. Setiap Subclass menambahkan atribut spesifiknya (misalnya varietas pada Benih).

4.Penggunaan super: Di setiap constructor Subclass, dipanggil super(kode, nama, harga, stok) untuk memastikan inisialisasi atribut dasar dilakukan oleh Superclass.

5.Eksekusi dan Tampilan: Class Main.java membuat instance dari setiap Subclass dan memanggil method tampilannya untuk mencetak detail produk ke konsol, termasuk credit Nama dan NIM.
---

## Kode Program
// Dari file Produk.java (Superclass)
public class Produk {
    private String kode;
    // ...
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode; // ... inisialisasi
    }
    public void tampilkanDetailDasar() {
        System.out.println("Kode: " + kode);
        // ...
    }
}

// Dari Subclass (Contoh Benih)
class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok); // Memanggil constructor Superclass
        this.varietas = varietas;
    }
    // ...
}

// Dari file Main.java (Eksekusi)
public class Main {
    public static void main(String[] args) {
        Benih benih = new Benih("BNH-001", "Benih Padi IR64", 25000.0, 100, "IR64");
        Pupuk pupuk = new Pupuk("PPK-101", "Pupuk Urea", 350000.0, 40, "Urea");
        
        benih.tampilkanDetail(); 
        System.out.println("---"); 
        pupuk.tampilkanDetail();
        
        System.out.println("\ncredit by: 240202850 - Ahmad Sultoni");
        // ...
    }
}


---

## Hasil Eksekusi
<img width="1045" height="883" alt="image" src="https://github.com/user-attachments/assets/fa2345ac-983d-4b44-b3a8-66ddb1f63dd6" />

---

## Analisis
1.Cara Kerja Kode: Class Produk menyediakan blueprint dasar untuk setiap produk. Subclass seperti Benih mewarisi cetak biru tersebut, sehingga tidak perlu mendefinisikan ulang properti dasar (kode, nama, harga, stok). Setiap Subclass hanya fokus pada penambahan atribut uniknya (misalnya, varietas pada Benih). Method tampilan detail pada Subclass memanfaatkan method tampilkanDetailDasar() dari Superclass menggunakan super.tampilkanDetailDasar(), menjamin konsistensi dan efisiensi kode.

2.Perbedaan Pendekatan Minggu Ini: Pendekatan minggu ini (OOP dengan Inheritance) jauh lebih unggul daripada pendekatan procedural (Minggu 1) yang mungkin hanya menggunakan satu method main dan banyak System.out.println(). Inheritance memungkinkan data dimodelkan sesuai dunia nyata, meminimalkan duplikasi kode, dan memudahkan penambahan jenis produk baru.

Kendala yang Dihadapi dan Cara Mengatasinya:

Kendala Utama: Saat awal implementasi, terjadi syntax error dan masalah package (7 error) yang disebabkan oleh ketidaklengkapan tanda kutip atau kurung kurawal, serta ketidaksesuaian nama package dengan struktur direktori.

Cara Mengatasi: Kesalahan sintaks diatasi dengan debugging pada baris-baris System.out.println() terakhir. Masalah package diatasi dengan memastikan file diletakkan di struktur folder yang benar (.../com/upb/agripos/) atau menghapus deklarasi package jika proyek dijalankan secara sederhana.
---

## Kesimpulan
Praktikum ini berhasil mengimplementasikan konsep Inheritance yang merupakan pilar penting dalam OOP. Dengan memisahkan atribut umum ke dalam Superclass (Produk) dan atribut spesifik ke dalam Subclass, kode menjadi sangat terstruktur, reusable, dan mudah di-maintain.

## Quiz
(1. Apa fungsi utama dari kata kunci extends dalam Java?  
   Jawaban: Kata kunci extends digunakan untuk menunjukkan bahwa sebuah class mewarisi properti dan method dari class lain, menciptakan hubungan is-a (seperti Benih adalah Produk).   

2. Mengapa pemanggilan super() harus menjadi pernyataan pertama dalam constructor Subclass?  
   Jawaban: Karena constructor Subclass tidak dapat bekerja dengan atribut yang diwarisi sebelum constructor Superclass selesai menginisialisasi atribut tersebut. Pemanggilan super() menjamin Superclass diinisialisasi terlebih dahulu.  
3. Bagaimana kita bisa memanggil method yang didefinisikan di Superclass dari dalam Subclass? Berikan contohnya!  
   Jawaban: Kita menggunakan kata kunci super. Contohnya adalah super.tampilkanDetailDasar() yang dipanggil di method tampilkanDetail() dari Subclass Benih.
