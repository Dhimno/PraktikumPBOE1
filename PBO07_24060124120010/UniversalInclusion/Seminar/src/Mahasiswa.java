/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa yang extends Civitasakademika
 *                Dengan atribut NIM dan Dosenwali
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Seminar.src;

public class Mahasiswa extends Civitasakademika {
    private String NIM;
    private Dosen Dosenwali;

    public Mahasiswa(String Nama, String NIM) {
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = null;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    public String getNIM() {
        return NIM;
    }

    public Dosen getDosenwali() {
        return Dosenwali;
    }

    public void setWali(Dosen dosenwali) {
        this.Dosenwali = dosenwali;
    }

    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + NIM + ", Nama: " + getNama() + ", Dosenwali: " + (Dosenwali != null ? Dosenwali.getNama() : "Tidak ada"));
    }
}