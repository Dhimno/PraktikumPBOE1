package LatihanUTS;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat peserta umum
        Umum pesertaUmum = new Umum("3201234567890001", "Budi Santoso", "budi@example.com");

        // Buat member
        Member member = new Member("3201234567890002", "Siti Aisyah", "siti@example.com", "M001", new Date());
        Member.setDiskon(0.1); // diskon 10%

        // Buat pelatihan reguler
        Reguler reguler = new Reguler("R001", "Java Fundamental", 30, "Pandu", 1500000, 0.1, "Senin-Kamis 18:00", "Pemula", "Offline");

        // Buat pelatihan insidental
        Insidental insidental = new Insidental("I001", "Android Bootcamp", 25, "Lina", 2000000, 0.1, "Sabtu-Minggu 09:00", true);

        // Tampilkan semua info
        System.out.println("=== Peserta Umum ===");
        pesertaUmum.printInfo();

        System.out.println("\n=== Member ===");
        member.printInfo();

        System.out.println("\n=== Pelatihan Reguler ===");
        reguler.printInfo();

        System.out.println("\n=== Pelatihan Insidental ===");
        insidental.printInfo();

        // Buat registrasi
        Registrasi reg1 = new Registrasi(new Date(), new Date(), "Transfer", pesertaUmum, reguler);
        Registrasi reg2 = new Registrasi(new Date(), new Date(), "Kartu Kredit", member, insidental);

        System.out.println("\n=== Registrasi 1 ===");
        reg1.printInfo();

        System.out.println("\n=== Registrasi 2 ===");
        reg2.printInfo();
    }
}
