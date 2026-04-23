/* Nama File    : Dosen.java
 * Deskripsi    : Kelas Dosen yang extends Civitasakademika
 *                Dengan atribut NIP
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Seminar.src;

public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }

    public String getNIP() {
        return NIP;
    }
}