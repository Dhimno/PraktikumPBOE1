/* Anggota Kelompok: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

/* File: Perawat.java */
public class Perawat extends Orang {
    public Perawat() {
        super(0, "Perawat Default");
    }

    public Perawat(int id, String nama) {
        super(id, nama);
    }

    @Override
    public String getRole() {
        return "Perawat";
    }

    @Override
    public void printInfo() {
        System.out.println("PERAWAT: " + nama + " (ID: " + id + ")");
    }
}