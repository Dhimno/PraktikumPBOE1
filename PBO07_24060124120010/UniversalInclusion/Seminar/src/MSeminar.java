/* Nama File    : MSeminar.java
 * Deskripsi    : Program utama untuk menguji kelas Seminar
 *                Demonstrasi registrasi peserta dan berbagai operasi
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

package PBO07_24060124120010.UniversalInclusion.Seminar.src;

public class MSeminar {
    public static void main(String[] args) {
        Seminar seminar = new Seminar();

        // e. 2 objek dosen dan 5 objek mahasiswa
        Dosen d1 = new Dosen("Dr. Smith", "12345");
        Dosen d2 = new Dosen("Prof. Johnson", "67890");

        Mahasiswa m1 = new Mahasiswa("Alice", "11111");
        Mahasiswa m2 = new Mahasiswa("Bob", "22222");
        Mahasiswa m3 = new Mahasiswa("Charlie", "33333");
        Mahasiswa m4 = new Mahasiswa("Diana", "44444");
        Mahasiswa m5 = new Mahasiswa("Eve", "55555");

        // f. Registrasi semua
        Seminar.registrasi(d1);
        Seminar.registrasi(d2);
        Seminar.registrasi(m1);
        Seminar.registrasi(m2);
        Seminar.registrasi(m3);
        Seminar.registrasi(m4);
        Seminar.registrasi(m5);

        // c. countPeserta
        System.out.println("Banyak peserta: " + Seminar.countPeserta());

        // g. tampilPeserta
        Seminar.tampilPeserta();

        // h. countMahasiswa
        System.out.println("Banyak mahasiswa: " + Seminar.countMahasiswa());

        // i. setWali dan j. tampilDataMahasiswa
        m1.setWali(d1);
        m2.setWali(d2);
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
    }
}