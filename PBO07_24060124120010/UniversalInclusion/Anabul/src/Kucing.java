/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing yang extends Anabul
 *                Suara: Meong, Gerak: Melata
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Anabul.src;

public class Kucing extends Anabul {
    @Override
    public void suara() {
        System.out.println("Meong");
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}
