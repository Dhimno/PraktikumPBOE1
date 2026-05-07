/* Nama File    : MTeman.java
 * Deskripsi    : Main untuk menguji fungsionalitas class Teman. Dalam method main, kita membuat objek Teman, menambahkan beberapa nama teman ke dalam
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();

        teman.addNama("Andi");
        teman.addNama("Budi");
        teman.addNama("Cici");
        teman.addNama("Dewi");
        teman.addNama("Andi");

        System.out.println("Daftar teman setelah add:");
        teman.showTeman();
        System.out.println("Jumlah teman: " + teman.getNbelm());

        System.out.println("\nApakah Budi anggota? " + teman.isMember("Budi"));
        System.out.println("Jumlah nama Andi: " + teman.countNama("Andi"));

        teman.setNama(1, "Bayu");
        System.out.println("\nDaftar teman setelah mengganti index 1 menjadi Bayu:");
        teman.showTeman();

        teman.gantiNama("Andi", "Anton");
        System.out.println("\nDaftar teman setelah ganti nama Andi menjadi Anton:");
        teman.showTeman();

        teman.delNama("Cici");
        System.out.println("\nDaftar teman setelah menghapus Cici:");
        teman.showTeman();
        System.out.println("Jumlah teman sekarang: " + teman.getNbelm());
    }
}
