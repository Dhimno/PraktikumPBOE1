/* Nama File    : MDosen.java
 * Deskripsi    : berisi program utama untuk menggunakan class MDosen
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class MDosen {
    public static void main(String[] args) {
        Dosen1 D1 = new Dosen1();
        D1.printDosen();
        D1.setNIP("24060124120026");
        D1.setNama("Gregorious Septi");
        D1.setProdi("Ilmu Perdukunan");
        D1.printDosen();
    }

}
