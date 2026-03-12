/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi program utama untuk menggunakan class BangunDatar
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // Persegi
        Persegi P1 = new Persegi();
        P1.setSisi(10);
        P1.setWarna("Merah");
        P1.setBorder("Hitam");

        System.out.println("=== Persegi ===");
        P1.printInfo();
        System.out.println("Sisi      : " + P1.getSisi());
        System.out.println("Luas      : " + P1.getLuas());
        System.out.println("Keliling  : " + P1.getKeliling());
        System.out.println("Diagonal  : " + P1.getDiagonal());
        System.out.println();

        // Lingkaran
        Lingkaran L1 = new Lingkaran();
        L1.setJari(7);
        L1.setWarna("Biru");
        L1.setBorder("Putih");

        System.out.println("=== Lingkaran ===");
        L1.printInfo();
        System.out.println("Jari-jari : " + L1.getJari());
        System.out.println("Luas      : " + L1.getLuas());
        System.out.println("Keliling  : " + L1.getKeliling());
    }
}