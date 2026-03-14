
# Penjelasan Kode Program `ARRAY1BAGUS.java`

## 1. Deklarasi Package

```java
package array1bagus;
```

Baris ini menunjukkan bahwa class `ARRAY1BAGUS` berada di dalam **package bernama `array1bagus`**.

Fungsi package dalam Java:
- Mengelompokkan class agar lebih terorganisir
- Menghindari konflik nama class
- Mempermudah pengelolaan project

Jika program dijalankan dalam IDE seperti NetBeans atau IntelliJ, biasanya package dibuat otomatis saat membuat project.

---

# 2. Deklarasi Class

```java
public class ARRAY1BAGUS {
```

Baris ini mendefinisikan sebuah **class bernama `ARRAY1BAGUS`**.

Penjelasan:

| Kata | Fungsi |
|-----|------|
| public | class dapat diakses dari luar package |
| class | mendefinisikan blueprint program |
| ARRAY1BAGUS | nama class |

Dalam Java:
- Nama file harus sama dengan nama class jika class tersebut `public`
- Oleh karena itu file ini bernama **ARRAY1BAGUS.java**

---

# 3. Method Utama (Main Method)

```java
public static void main(String[] args) {
```

Method `main()` merupakan **titik awal eksekusi program Java**.

Penjelasan bagian-bagiannya:

| Bagian | Fungsi |
|------|------|
| public | dapat diakses dari luar class |
| static | method dapat dijalankan tanpa membuat objek |
| void | method tidak mengembalikan nilai |
| main | nama method utama |
| String[] args | parameter untuk menerima argumen dari command line |

Saat program dijalankan, Java akan **mengeksekusi method `main()` terlebih dahulu**.

---

# 4. Deklarasi Array

```java
int a[] = new int[3];
```

Baris ini digunakan untuk **membuat array bertipe data integer**.

Penjelasan:

| Bagian | Fungsi |
|------|------|
| int | tipe data array |
| a[] | nama array |
| new int[3] | membuat array dengan kapasitas 3 elemen |

Array `a` dapat menyimpan **3 buah nilai integer**.

Struktur memori array:

| Index | Nilai |
|------|------|
| a[0] | ? |
| a[1] | ? |
| a[2] | ? |

Pada awal pembuatan array:
- semua nilai otomatis **0** (nilai default tipe int).

---

# 5. Mengisi Nilai Array

```java
a[0] = 4;
a[1] = 5;
a[2] = 9;
```

Baris ini digunakan untuk **mengisi nilai ke dalam array**.

Penjelasan:

| Index | Nilai |
|------|------|
| a[0] | 4 |
| a[1] | 5 |
| a[2] | 9 |

Dalam Java, **index array selalu dimulai dari 0**.

Jadi array dengan ukuran 3 memiliki index:

```
0, 1, 2
```

---

# 6. Menampilkan Nilai Array

```java
System.out.println(a[0]);
```

Baris ini digunakan untuk **menampilkan nilai array pada index ke-0**.

Karena sebelumnya:

```
a[0] = 4
```

Maka output yang muncul adalah:

```
4
```

---

# 7. Mengubah Nilai Array

```java
a[0] = 10;
```

Baris ini **mengubah nilai pada index ke-0**.

Nilai array yang sebelumnya:

| Index | Nilai |
|------|------|
| a[0] | 4 |
| a[1] | 5 |
| a[2] | 9 |

Setelah perubahan:

| Index | Nilai |
|------|------|
| a[0] | 10 |
| a[1] | 5 |
| a[2] | 9 |

Artinya nilai lama **ditimpa oleh nilai baru**.

---

# 8. Menampilkan Nilai Setelah Diubah

```java
System.out.println(a[0]);
```

Baris ini kembali menampilkan nilai array pada index `0`.

Karena sebelumnya sudah diubah menjadi:

```
a[0] = 10
```

Maka output yang muncul sekarang adalah:

```
10
```

---

# 9. Penutup Method dan Class

```java
}
}
```

Kurung kurawal ini digunakan untuk:

- Menutup method `main()`
- Menutup class `ARRAY1BAGUS`

---

# Alur Kerja Program

Urutan eksekusi program:

1. Program membuat array dengan ukuran **3 elemen**
2. Program mengisi array dengan nilai **4, 5, 9**
3. Program menampilkan nilai **a[0]**
4. Program mengubah nilai **a[0] menjadi 10**
5. Program menampilkan kembali nilai **a[0]**

---

# Contoh Output Program

![Isi folder Bangun-ruang di local](Screenshot%202026-03-12%20215203.png)

---

Penjelasan:

- Baris pertama berasal dari `System.out.println(a[0]);`
- Baris kedua berasal dari nilai `a[0]` setelah diubah menjadi `10`

---

# Kesimpulan

Program ini merupakan contoh sederhana penggunaan **array dalam Java**.

Konsep yang dipelajari dalam program ini:

1. Cara membuat array
2. Cara mengisi nilai array
3. Cara mengakses elemen array menggunakan index
4. Cara mengubah nilai dalam array
5. Cara menampilkan isi array ke layar
