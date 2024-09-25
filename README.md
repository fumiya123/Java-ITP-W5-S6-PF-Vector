# Java-ITP-W5-S6-PF-Vector

Kelas Introduction to Programming / Week 5 / Session 6

- Pertama membuat objek Vector untuk menyimpan daftar nama dengan kode `Vector<String> names = new Vector<>();`, `names` di sini adalah nama Vektor yang kita buat.
- Tambahkan beberapa nama ke dalam Vector dengan fungsi `.add()` menjadi `names.add("Habib")`.
- Print isi objek Vektor `names` menggunakan `for-each` untuk mencetak semua elemen yang ada di Vector, dengan kode berikut `for (String name : names)`
  - `String name` adalah vaiabel yang akan menampung nilai dari Vektor `names` yang di-loop.
  - Print `String name` dengan kode `System.out.println(name)`.
- Lanjut kita mencoba menambakan nama baru pada posisi ke 2 dengan kode berikut `names.add(2, "Rahmawan");`
  - angka `2` pada `names.add(2, "Rahmawan");` berarti kita ingin menambah nama Rahmawan pada index ke 2.
  - jika kita print maka nama Rahmawan akan muncul di urutan ke 3 karena index Vektor `names` dimulai dari 0.
- Terakhir kita print ukuran Vector `names` dengan kode `System.out.println("\nUkuran Vector saat ini: " + names.size());`, `names.size` merupakan fungsi untuk mengetahui jumlah elemen dalam Vektor `names`

Sekian.

Habib Azizul Haq  
(2702488253)
