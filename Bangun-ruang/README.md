# Penjelasan Kode Program `BangunRuang.java`

## 1. Komentar Template Awal
```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
```
Baris komentar ini merupakan komentar otomatis yang dibuat oleh IDE (biasanya NetBeans).  
Komentar tidak akan dieksekusi oleh program dan hanya berfungsi sebagai informasi bagi programmer.

---

# 2. Import Library

```java
import java.util.Scanner;
```

Baris ini digunakan untuk **mengimpor class `Scanner`** dari package `java.util`.

Fungsi Scanner:
- Digunakan untuk **membaca input dari pengguna**
- Input dapat berasal dari keyboard (`System.in`)

Contoh fungsi Scanner:
- `nextInt()` ? membaca angka integer
- `nextDouble()` ? membaca angka desimal
- `nextLine()` ? membaca teks

Pada program ini Scanner digunakan untuk membaca **nilai jari-jari bola** yang dimasukkan pengguna.

---

# 3. Deklarasi Class

```java
public class BangunRuang {
```

Baris ini mendefinisikan sebuah **class bernama `BangunRuang`**.

Penjelasan:
- `public` ? class dapat diakses dari class lain
- `class` ? merupakan blueprint atau kerangka dari sebuah program Java
- `BangunRuang` ? nama class

Dalam Java, **nama file harus sama dengan nama class** jika class tersebut bersifat `public`.

---

# 4. Method Main

```java
public static void main(String args[]) {
```

Method `main()` adalah **titik awal eksekusi program Java**.

Penjelasan komponennya:

| Bagian | Fungsi |
|------|------|
| public | dapat diakses dari luar class |
| static | method dapat dijalankan tanpa membuat objek |
| void | method tidak mengembalikan nilai |
| main | nama method utama |
| String args[] | parameter untuk menerima argumen dari command line |

Ketika program dijalankan, **Java akan menjalankan method `main()` terlebih dahulu**.

---

# 5. Membuat Objek Scanner

```java
Scanner input = new Scanner(System.in);
```

Baris ini membuat **objek Scanner bernama `input`**.

Penjelasan:
- `Scanner` ? nama class
- `input` ? nama objek
- `new Scanner(System.in)` ? membuat Scanner yang membaca dari keyboard

Dengan objek ini program dapat membaca input dari pengguna.

---

# 6. Menampilkan Judul Program

```java
System.out.println("=== PROGRAM HITUNG BOLA ===");
System.out.println();
```

Penjelasan:

`System.out.println()` digunakan untuk **menampilkan teks ke layar**.

Perbedaan:
- `println()` ? setelah mencetak teks akan pindah ke baris baru
- `print()` ? tidak pindah baris

Baris kedua digunakan untuk membuat **spasi kosong** agar tampilan lebih rapi.

---

# 7. Meminta Input dari User

```java
System.out.print("Masukkan jari-jari bola (cm) : ");
double r = input.nextDouble();
```

Langkah yang terjadi:

1. Program menampilkan pesan agar pengguna memasukkan nilai jari-jari bola.
2. `input.nextDouble()` membaca angka desimal dari keyboard.
3. Nilai tersebut disimpan dalam variabel `r`.

Penjelasan variabel:

| Variabel | Tipe Data | Fungsi |
|--------|--------|--------|
| r | double | menyimpan nilai jari-jari bola |

Tipe data `double` digunakan karena nilai jari-jari bisa berupa **angka desimal**.

---

# 8. Menghitung Volume Bola

```java
double volume = (4.0 / 3) * 3.14159 * r * r * r;
```

Baris ini menghitung **volume bola**.

Rumus volume bola:

```
V = 4/3 � p � r�
```

Penjelasan bagian kode:

| Bagian | Fungsi |
|------|------|
| 4.0 / 3 | pembagian dalam bentuk desimal |
| 3.14159 | nilai pendekatan dari p |
| r * r * r | menghitung r� |

Hasil perhitungan disimpan dalam variabel `volume`.

---

# 9. Menghitung Luas Permukaan Bola

```java
double luasPermukaan = 4 * 3.14159 * r * r;
```

Baris ini menghitung **luas permukaan bola**.

Rumus luas permukaan bola:

```
L = 4 � p � r�
```

Penjelasan bagian kode:

| Bagian | Fungsi |
|------|------|
| 4 | konstanta dalam rumus |
| 3.14159 | nilai p |
| r * r | menghitung r� |

Hasilnya disimpan dalam variabel `luasPermukaan`.

---

# 10. Menampilkan Hasil Perhitungan

```java
System.out.println("\nHasil perhitungan:");
System.out.println("-------------------");
```

`\n` digunakan untuk **membuat baris baru** sebelum teks ditampilkan.

Baris kedua menampilkan garis pemisah agar tampilan output lebih jelas.

---

# 11. Menampilkan Nilai dengan Format

```java
System.out.printf("Jari-jari bola       = %.2f cm\n", r);
System.out.printf("Volume bola          = %.2f cm�\n", volume);
System.out.printf("Luas permukaan bola  = %.2f cm�\n", luasPermukaan);
```

`printf()` digunakan untuk **menampilkan teks dengan format tertentu**.

Penjelasan format:

| Format | Fungsi |
|------|------|
| %.2f | menampilkan angka desimal dengan 2 angka di belakang koma |
| \n | pindah baris |

Contoh hasil tampilan:

```
Jari-jari bola       = 7.00 cm
Volume bola          = 1436.76 cm�
Luas permukaan bola  = 615.75 cm�
```

---

# 12. Menutup Scanner

```java
input.close();
```

Baris ini digunakan untuk **menutup objek Scanner**.

Tujuan:
- Menghindari kebocoran resource
- Membersihkan memori setelah Scanner tidak digunakan lagi

---

# 13. Penutup Method dan Class

```java
}
}
```

Kurung kurawal ini menandakan:
- penutup method `main()`
- penutup class `BangunRuang`

---
### Contoh Output Program
### Tampilan Folder Proyek di Local

<image-card alt="Struktur folder proyek BangunRuang lokal" src="Screenshot%202026-03-12%20145953.png" ></image-card>

### Contoh Output Saat Program Dijalankan

<image-card alt="Output program BangunRuang" src="Screenshot%202026-03-12%20145953.png" ></image-card>
<!-- Kalau screenshot ini adalah output console, ganti caption sesuai. -->


# Kesimpulan Program

Program ini berfungsi untuk:

1. Meminta input jari-jari bola dari pengguna
2. Menghitung **volume bola**
3. Menghitung **luas permukaan bola**
4. Menampilkan hasil perhitungan ke layar dengan format yang rapi

Program menggunakan:
- **Scanner** untuk input
- **rumus matematika bangun ruang**
- **printf formatting** untuk tampilan hasil
