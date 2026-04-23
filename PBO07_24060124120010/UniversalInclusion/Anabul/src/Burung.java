/* Nama File    : Burung.java
 * Deskripsi    : Kelas Burung yang extends Anabul
 *                Suara: Cuit, Gerak: Terbang
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Anabul.src;

public class Burung extends Anabul {
    @Override
    public void suara() {
        System.out.println("Cuit");
    }

    @Override
    public void gerak() {
        System.out.println("Terbang");
    }
}
