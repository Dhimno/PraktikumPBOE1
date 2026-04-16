/* Nama File    : MManusia.java
 * Deskripsi    : Membuat class Main untuk menguji class Pengusaha dan Pekerja
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 16 April 2026
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        Pengusaha p1 = new Pengusaha("Dhimno", LocalDate.of(2020, 1, 1), "Jl. Merdeka No. 1", 1000000000.0, "PT. ABC");
        Pekerja k1 = new Pekerja("Budi", LocalDate.of(2021, 2, 1), "Jl. Sudirman No. 2", 5000000.0, "PT. XYZ");
        Petani t1 = new Petani("Siti", LocalDate.of(2019, 3, 1), "Jl. Gatot Subroto No. 3", 2000000.0, "Sawah");
        PNS n1 = new PNS("Andi", LocalDate.of(2018, 4, 1), "Jl. Thamrin No. 4", 7000000.0, "Kementerian Pendidikan");

        System.out.println("Nama Pengusaha: " + p1.getNama());
        System.out.println("Tanggal Mulai Kerja: " + p1.getTgl_mulai_kerja());
        System.out.println("Alamat: " + p1.getAlamat());
        System.out.println("Pendapatan: " + p1.getPendapatan());
        System.out.println("Nama Perusahaan: " + p1.getNamaPerusahaan());
        System.out.println("Pajak yang harus dibayar: " + p1.hitungPajak());

        System.out.println();

        System.out.println("Nama Pekerja: " + k1.getNama());
        System.out.println("Tanggal Mulai Kerja: " + k1.getTgl_mulai_kerja());
        System.out.println("Alamat: " + k1.getAlamat());
        System.out.println("Pendapatan: " + k1.getPendapatan());
        System.out.println("Nama Perusahaan: " + k1.getNamaPerusahaan());
        System.out.println("Pajak yang harus dibayar: " + k1.hitungPajak());

        System.out.println("Nama Petani: " + t1.getNama());
        System.out.println("Tanggal Mulai Kerja: " + t1.getTgl_mulai_kerja());
        System.out.println("Alamat: " + t1.getAlamat());
        System.out.println("Pendapatan: " + t1.getPendapatan());
        System.out.println("Jenis Pertanian: " + t1.getJenisPertanian());
        System.out.println("Pajak yang harus dibayar: " + t1.hitungPajak());

        System.out.println();

        System.out.println("Nama PNS: " + n1.getNama());
        System.out.println("Tanggal Mulai Kerja: " + n1.getTgl_mulai_kerja());
        System.out.println("Alamat: " + n1.getAlamat());
        System.out.println("Pendapatan: " + n1.getPendapatan());
        System.out.println("Golongan: " + n1.getGolongan());
        System.out.println("Pajak yang harus dibayar: " + n1.hitungPajak());
        System.out.println();

        System.out.println("Jumlah Manusia yang dibuat: " + Manusia.getCounterMns());

        
        
    }
}

