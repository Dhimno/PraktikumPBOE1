/* Nama File    : MPegawai.java
 * Deskripsi    : Membuat class MPegawai untuk menguji class Dosen, DosenTetap, DosenTamu, dan Tendik
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */

public class MPegawai {
    public static void main(String[] args) {
        DosenTamu dtamu = new DosenTamu("D001", "Prof. Tio", "01-01-1980", "01-09-2024", 12000000.0, "Informatika", "NIDK123");
        DosenTetap dtetap = new DosenTetap("D002", "Dr. Farhan", "02-02-1978", "01-09-2020", 15000000.0, "Teknik", "NIDN987", 5000000.0);
        Tendik tendik = new Tendik("T001", "Ibu Megawati", "05-03-1985", "01-09-2019", 7000000.0, "Administrasi", 1500000.0);

        System.out.println("=== Dosen Tamu ===");
        dtamu.printInfo();
        System.out.println("NIP         : " + dtamu.getNIP());
        System.out.println("Nama        : " + dtamu.getNama());
        System.out.println("Fakultas    : " + dtamu.getFakultas());
        System.out.println("Gaji Pokok  : " + dtamu.getGajiPokok());
        System.out.println("Tunjangan   : " + dtamu.getTunjangan());
        System.out.println("Total Gaji  : " + (dtamu.getGajiPokok() + dtamu.getTunjangan()));
        System.out.println();

        System.out.println("=== Dosen Tetap ===");
        dtetap.printInfo();
        System.out.println("NIP         : " + dtetap.getNIP());
        System.out.println("Nama        : " + dtetap.getNama());
        System.out.println("Fakultas    : " + dtetap.getFakultas());
        System.out.println("Gaji Pokok  : " + dtetap.getGajiPokok());
        System.out.println("BUP         : " + dtetap.getBUP());
        double tunjanganDosenTetap = dtetap.getTunjangan(2020);
        System.out.println("Tunjangan   : " + tunjanganDosenTetap);
        System.out.println("Total Gaji  : " + (dtetap.getGajiPokok() + tunjanganDosenTetap));
        System.out.println();

        System.out.println("=== Tenaga Pendidikan ===");
        tendik.printInfo();
        System.out.println("NIP         : " + tendik.getNIP());
        System.out.println("Nama        : " + tendik.getNama());
        System.out.println("Bidang      : " + tendik.getBidang());
        System.out.println("Gaji Pokok  : " + tendik.getGajiPokok());
        double tunjanganTendik = tendik.getTunjangan(2019);
        System.out.println("Tunjangan   : " + tunjanganTendik);
        System.out.println("Total Gaji  : " + (tendik.getGajiPokok() + tunjanganTendik));
    }
}

