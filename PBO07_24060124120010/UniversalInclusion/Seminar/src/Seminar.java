/* Nama File    : Seminar.java
 * Deskripsi    : Kelas Seminar untuk mengelola peserta seminar
 *                Dengan array statis pesertas dan berbagai method
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Seminar.src;

public class Seminar {
    private static final int MAX_PESERTA = 100;
    private static Civitasakademika[] pesertas = new Civitasakademika[MAX_PESERTA];
    private static int banyakpeserta = 0;

    public Seminar() {
        banyakpeserta = 0;
    }

    public static int countPeserta() {
        return banyakpeserta;
    }

    public static void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < MAX_PESERTA) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    public static void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
        }
    }

    public static int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}