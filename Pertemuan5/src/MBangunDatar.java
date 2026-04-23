/* Nama File    : MBangunDatar.java
 * Deskripsi    : Membuat class MBangunDatar untuk menguji class Persegi dan Lingkaran
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 19 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        // membuat objek persegi dan lingkaran
        Persegi p = new Persegi(4, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(14.0, "Biru", "Biru", "Putih");

        System.out.println("=== INFO PERSEGI ===");
        p.printInfo();
        System.out.println("Luas Persegi: " + p.getLuas());
        System.out.println("Keliling Persegi: " + p.getKeliling());
        System.out.println("Diagonal Persegi: " + p.getDiagonal());

        System.out.println("\n=== INFO LINGKARAN ===");
        l.printInfo();
        System.out.println("Luas Lingkaran: " + l.getLuas());
        System.out.println("Keliling Lingkaran: " + l.getKeliling());
        System.out.println("Diameter Lingkaran: " + l.getDiameter());

        System.out.println("\n=== OPERASI ZOOM ===");
        p.zoomIn();
        l.zoomOut();
        System.out.println("Persegi setelah zoom in (sisi +10%): " + p.getSisi());
        System.out.println("Lingkaran setelah zoom out (jari-jari -10%): " + l.getJari());

        System.out.println("\n=== PERBANDINGAN LUAS ===");
        System.out.println("Persegi dan Lingkaran sama luas? " + p.isEqualLuas(l));

        BangunDatar.printCounterBangunDatar();
    }
}