/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa dengan polimorfisme ad hoc overloading
 *                Atribut NIM, Nama, Programstudi dan method setProgramStudi overloaded
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa {
    private int NIM;
    private String Nama;
    private String Programstudi;

    // Konstruktor default
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // Konstruktor dengan 3 parameter
    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // Konstruktor copy
    public Mahasiswa(Mahasiswa other) {
        this.NIM = other.NIM;
        this.Nama = other.Nama;
        this.Programstudi = other.Programstudi;
    }

    // Getter dan Setter
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getProgramstudi() {
        return Programstudi;
    }

    // Overloaded setProgramStudi
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    public void setProgramStudi(Mahasiswa other) {
        this.Programstudi = other.Programstudi;
    }
}
