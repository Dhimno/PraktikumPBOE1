/* Nama File    : MMatkul.java
 * Deskripsi    : berisi program utama untuk menggunakan class Matkul
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class MMatkul {
    public static void main(String[] args) {
        Matkul M1 = new Matkul();
        M1.printMatkul();
        M1.setIDMatkul("24060124120026");
        M1.setNama("Tioritis");
        M1.setSks(20);
        M1.printMatkul();
    }
}
