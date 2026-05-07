/* Nama File    : Anggora.java
 * Deskripsi    : Membuat class Anggora sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing Anggora. Method bersuara akan menampilkan bahwa kucing Anggora berbunyi meong lembut.
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) berbunyi meong lembut");
    }
}