/* Nama File    : Civitasakademika.java
 * Deskripsi    : Kelas abstrak Civitasakademika sebagai induk
 *                Dengan atribut Nama dan method abstrak getNomor()
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Seminar.src;

public abstract class Civitasakademika {
    protected String Nama;

    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public abstract String getNomor();
}