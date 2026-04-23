/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing yang extends Anabul
 *                Suara: Guk-guk, Gerak: Melata
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Anabul.src;

public class Anjing extends Anabul {
    @Override
    public void suara() {
        System.out.println("Guk-guk");
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}
