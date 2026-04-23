/* Nama File    : MMahasiswa.java
 * Deskripsi    : Program utama untuk menguji kelas Mahasiswa
 *                Demonstrasi konstruktor dan method overloading
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */


public class MMahasiswa {
    public static void main(String[] args) {
        // c. Konstruktor default
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Default: NIM=" + m1.getNIM() + ", Nama=" + m1.getNama() + ", Programstudi=" + m1.getProgramstudi());

        // d. Konstruktor dengan 3 parameter
        Mahasiswa m2 = new Mahasiswa(12345, "John Doe", "Informatika");
        System.out.println("Param: NIM=" + m2.getNIM() + ", Nama=" + m2.getNama() + ", Programstudi=" + m2.getProgramstudi());

        // e. Konstruktor copy
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Copy: NIM=" + m3.getNIM() + ", Nama=" + m3.getNama() + ", Programstudi=" + m3.getProgramstudi());

        // b. Aplikasi semua varian setProgramStudi
        Mahasiswa m4 = new Mahasiswa(67890, "Jane Smith", "Teknik");
        System.out.println("Sebelum: " + m4.getProgramstudi());

        // Varian 1: tanpa parameter
        m4.setProgramStudi();
        System.out.println("Set kosong: " + m4.getProgramstudi());

        // Varian 2: dengan string
        m4.setProgramStudi("Matematika");
        System.out.println("Set string: " + m4.getProgramstudi());

        // Varian 3: dengan objek Mahasiswa lain
        m4.setProgramStudi(m2);
        System.out.println("Set dari objek: " + m4.getProgramstudi());
    }
}
