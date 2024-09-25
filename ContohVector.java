import java.util.Vector;

public class ContohVector {
    public static void main(String[] args) {
        // membuat objek Vector untuk menyimpan daftar nama
        Vector<String> names = new Vector<>();

        // tambahkan beberapa nama ke dalam Vector
        names.add("Habib");
        names.add("Azizul");
        names.add("Riski");
        names.add("Kemas");

        // print isi Vector
        System.out.println("Daftar nama:");
        for (String name : names) {
            System.out.println(name); // print nama
        }

        // Menambahkan nama baru ke posisi ke 2
        names.add(2, "Rahmawan");
        System.out.println("\nSetelah menambahkan 'Rahmawan' pada indeks 2:");
        for (String name : names) {
            System.out.println(name); // print nama setelah di tambah
        }

        // print ukuran Vector
        System.out.println("\nUkuran Vector saat ini: " + names.size());

    }
}
