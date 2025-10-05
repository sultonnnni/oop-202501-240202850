
# Laporan Praktikum Minggu 1
**Topik: Implementasi “Hello World” Menggunakan Tiga Paradigma Pemrograman di Java**

## Identitas
- **Nama**  : Ahmad Sultoni
- **NIM**   : 240202850
- **Kelas** : 3IKRA

---

## Tujuan
1. Mahasiswa memahami konsep tiga paradigma dasar pemrograman: prosedural, OOP, dan fungsional dalam bahasa Java.  
2. Mahasiswa mampu mengimplementasikan program sederhana `Hello World, I'm [nama] - [nim]` menggunakan ketiga paradigma tersebut.  
3. Mahasiswa dapat mengenali perbedaan gaya penulisan kode serta pola pikir dalam setiap paradigma.  
4. Mahasiswa menguasai dasar penggunaan method, class–object, dan lambda expression di Java.  

---

## Dasar Teori
- **Paradigma Prosedural**: program disusun berdasarkan urutan instruksi.  
- **Paradigma OOP**: program berbasis objek, dengan konsep class dan object.  
- **Paradigma Fungsional**: program berbasis fungsi murni, memanfaatkan lambda expression.  

---

## Langkah Praktikum
1. Membuat folder `oop-202501-240202850` di VS Code.  
2. Menambahkan file:  
   - `helloProcedural.java`  
   - `helloOOP.java`  
   - `hellofunctional.java`  
3. Menuliskan kode pada masing-masing file sesuai paradigma.  
4. Melakukan compile dengan `javac` dan run dengan `java`.  
5. Mencatat hasil output setiap program.  

---

## Kode Program

### 1. Prosedural
```java
public class helloProcedural {
    public static void sapa(String nama, String nim){
        System.out.println("Hello World I'm " + nama + " - " + nim);
    }
    public static void main(String[] args) {
        String nama = "Ahmad Sultoni";
        String nim = "240202850";
        System.out.println("Hello World, I'm " + nama + " - " + nim);
        sapa("Ahmad Sultoni", "240202850");
    }
}
```

### 2. OOP
```java
class mahasiswa {
    String nama;
    int nim;
    mahasiswa(String nm, int ni){
        nama = nm;
        nim = ni;
    }
    void panggil(){
        System.out.println("hallow, " + nama + " - " + nim);
    }
}
public class helloOOP {
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa("Ahmad Sultoni", 240202850);
        m.panggil();
    }
}
```

### 3. Fungsional
```java
import java.util.function.BiConsumer;
public class hellofunctional {
    public static void main(String[] args) {
        BiConsumer<String,Integer> panggil =
            (nama, nim) -> System.out.println("hallo, " + nama + " - " + nim);
        panggil.accept("Ahmad Sultoni", 240202850);
    }
}
```

---

## Hasil Eksekusi

### 1. Prosedural
```
Hello World, I'm Ahmad Sultoni - 240202850
Hello World I'm Ahmad Sultoni - 240202850
```

### 2. OOP
```
hallow, Ahmad Sultoni - 240202850
```

### 3. Fungsional
```
hallo, Ahmad Sultoni - 240202850
```

---

## Analisis
- **Prosedural**: eksekusi berurutan, cocok untuk program kecil.  
- **OOP**: lebih terstruktur karena memisahkan data (atribut) dan perilaku (method).  
- **Fungsional**: ringkas menggunakan lambda expression.  

**Kendala**:  
- Error sering muncul karena nama class tidak sama dengan nama file.  

**Solusi**:  
- Selalu samakan nama file `.java` dengan nama class utama.  

---

## Kesimpulan
- Paradigma **Prosedural**: sederhana tapi kurang fleksibel untuk program besar.  
- Paradigma **OOP**: modular, cocok untuk aplikasi berskala besar.  
- Paradigma **Fungsional**: lebih singkat dan mudah dibaca untuk fungsi tertentu.  

Mahasiswa dapat memahami kelebihan dan kekurangan setiap paradigma melalui implementasi sederhana.  

---

## Quiz dan Jawaban
1. **Apakah OOP selalu lebih baik dari prosedural?**  
   Tidak, tergantung pada kebutuhan aplikasi.  

2. **Kapan functional programming lebih cocok?**  
   Saat manipulasi data besar, paralel, atau butuh minim efek samping.  

3. **Bagaimana pengaruh paradigma pada maintainability & scalability?**  
   - Prosedural: sulit untuk scaling.  
   - OOP: modular dan scalable.  
   - Fungsional: mudah diuji, cocok untuk data-intensive.  

4. **Mengapa OOP cocok untuk aplikasi POS?**  
   Karena banyak entitas (produk, transaksi, pelanggan) yang bisa dimodelkan sebagai objek.  

5. **Bagaimana paradigma fungsional mengurangi boilerplate code?**  
   Dengan lambda & higher-order function, sehingga kode lebih singkat & reusable.  
