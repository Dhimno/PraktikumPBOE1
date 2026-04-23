/* Nama File    : MAnabul.java
 * Deskripsi    : Program utama untuk mensimulasikan semua jenis Anabul
 *                Demonstrasi polimorfisme universal inclusion
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Anabul.src;

public class MAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing();
        Anabul anjing = new Anjing();
        Anabul burung = new Burung();

        System.out.println("Kucing:");
        kucing.suara();
        kucing.gerak();

        System.out.println("Anjing:");
        anjing.suara();
        anjing.gerak();

        System.out.println("Burung:");
        burung.suara();
        burung.gerak();
    }
}
