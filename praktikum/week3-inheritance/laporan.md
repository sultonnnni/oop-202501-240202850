Laporan Praktikum Minggu 3

Topik: Implementasi Konsep Inheritance pada Hierarki Data Produk

Identitas

Nama  : Ahmad Sultoni

NIM   : 240202850

Kelas : [Isi Kelas Anda]

Tujuan

Mahasiswa memahami dan mampu mengimplementasikan konsep Inheritance (Pewarisan) di Java.

Mahasiswa dapat membuat Superclass (Produk) dan Subclass (misalnya Benih, Pupuk) untuk memodelkan data produk yang memiliki hierarki.

Mahasiswa mampu menggunakan kata kunci super untuk memanggil constructor dan method dari Superclass.

Dasar Teori

Inheritance (Pewarisan): Mekanisme dalam OOP yang memungkinkan sebuah class anak (subclass) mewarisi atribut dan method dari class induk (superclass). Tujuan utamanya adalah code reusability.

Superclass & Subclass: Superclass (misalnya Produk) adalah class yang diwariskan, sementara Subclass (misalnya Benih) adalah class yang mewarisi (extend) Superclass.

Kata Kunci super: Digunakan di dalam Subclass untuk merujuk pada anggota Superclass. Ini wajib digunakan untuk memanggil constructor Superclass (super(...)) agar atribut yang diwarisi dapat diinisialisasi.

Overriding Method: Subclass dapat mengubah implementasi method yang sudah ada di Superclass (walaupun dalam kasus ini kita hanya memperluas dengan method baru yang memanggil method super).

Langkah Praktikum

Setup File: Membuat class induk Produk.java dan class utama Main.java.

Implementasi Superclass: Class Produk.java dibuat dengan atribut dasar (kode, nama, harga, stok) yang sifatnya umum untuk semua produk.

Implementasi Subclass: Enam Subclass (seperti Benih, Pupuk, Pestisida) dibuat dan mewarisi (extends) class Produk. Setiap Subclass menambahkan atribut spesifiknya (misalnya varietas pada Benih).

Penggunaan super: Di setiap constructor Subclass, dipanggil super(kode, nama, harga, stok) untuk memastikan inisialisasi atribut dasar dilakukan oleh Superclass.

Eksekusi dan Tampilan: Class Main.java membuat instance dari setiap Subclass dan memanggil method tampilannya untuk mencetak detail produk ke konsol, termasuk credit Nama dan NIM.

Kode Program

(Tuliskan kode utama yang dibuat. Karena ada 3 file, cantumkan bagian terpenting dari Produk.java dan Main.java.)

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


Hasil Eksekusi

(Sertakan screenshot hasil eksekusi program Anda yang menunjukkan output terminal berikut)

=== Detail Produk Benih ===
Kode: BNH-001
Nama: Benih Padi IR64
Harga: Rp25000.0
Stok: 100 unit
Varietas: IR64
---
=== Detail Produk Pupuk ===
Kode: PPK-101
Nama: Pupuk Urea
Harga: Rp350000.0
Stok: 40 unit
Jenis: Urea
---<img width="1920" height="1200" alt="Cuplikan layar 2025-10-28 184716" src="https://github.com/user-attachments/assets/172db9bd-1c06-48b3-ba73-fdcd784a8c89" />

... (lanjutan output produk lainnya) ...

credit by: 240202850 - Ahmad Sultoni
PS C:\Users\ahmad\Documents\oop-202501-240202850>


Analisis

Cara Kerja Kode: Class Produk menyediakan blueprint dasar untuk setiap produk. Subclass seperti Benih mewarisi cetak biru tersebut, sehingga tidak perlu mendefinisikan ulang properti dasar (kode, nama, harga, stok). Setiap Subclass hanya fokus pada penambahan atribut uniknya (misalnya, varietas pada Benih). Method tampilan detail pada Subclass memanfaatkan method tampilkanDetailDasar() dari Superclass menggunakan super.tampilkanDetailDasar(), menjamin konsistensi dan efisiensi kode.

Perbedaan Pendekatan Minggu Ini: Pendekatan minggu ini (OOP dengan Inheritance) jauh lebih unggul daripada pendekatan procedural (Minggu 1) yang mungkin hanya menggunakan satu method main dan banyak System.out.println(). Inheritance memungkinkan data dimodelkan sesuai dunia nyata, meminimalkan duplikasi kode, dan memudahkan penambahan jenis produk baru.

Kendala yang Dihadapi dan Cara Mengatasinya:

Kendala Utama: Saat awal implementasi, terjadi syntax error dan masalah package (7 error) yang disebabkan oleh ketidaklengkapan tanda kutip atau kurung kurawal, serta ketidaksesuaian nama package dengan struktur direktori.

Cara Mengatasi: Kesalahan sintaks diatasi dengan debugging pada baris-baris System.out.println() terakhir. Masalah package diatasi dengan memastikan file diletakkan di struktur folder yang benar (.../com/upb/agripos/) atau menghapus deklarasi package jika proyek dijalankan secara sederhana.

Kesimpulan

Praktikum ini berhasil mengimplementasikan konsep Inheritance yang merupakan pilar penting dalam OOP. Dengan memisahkan atribut umum ke dalam Superclass (Produk) dan atribut spesifik ke dalam Subclass, kode menjadi sangat terstruktur, reusable, dan mudah di-maintain.

Quiz

(Silakan sesuaikan pertanyaan ini dengan panduan praktikum Anda)

Apa fungsi utama dari kata kunci extends dalam Java?  
   Jawaban: Kata kunci extends digunakan untuk menunjukkan bahwa sebuah class mewarisi properti dan method dari class lain, menciptakan hubungan is-a (seperti Benih adalah Produk).  

Mengapa pemanggilan super() harus menjadi pernyataan pertama dalam constructor Subclass?  
   Jawaban: Karena constructor Subclass tidak dapat bekerja dengan atribut yang diwarisi sebelum constructor Superclass selesai menginisialisasi atribut tersebut. Pemanggilan super() menjamin Superclass diinisialisasi terlebih dahulu.  

Bagaimana kita bisa memanggil method yang didefinisikan di Superclass dari dalam Subclass? Berikan contohnya!  
   Jawaban: Kita menggunakan kata kunci super. Contohnya adalah super.tampilkanDetailDasar() yang dipanggil di method tampilkanDetail() dari Subclass Benih.
