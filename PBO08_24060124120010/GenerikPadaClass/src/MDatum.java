/* Nama File    : MDatum.java
 * Deskripsi    : Program untuk menguji kelas Datum dengan berbagai jenis Anabul
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 30 April 2026
 */

public class MDatum {
    public static void main(String[] args) {

        Kucing k1 = new Anggora("Oreo", 3.5);
        Kucing k2 = new KembangTelon("Cleo", 4.2);
        Anjing a1 = new Anjing("Golden");
        Burung b1 = new Burung("Raja");

        Datum<Anabul> d1 = new Datum<>(k1);
        Datum<Anabul> d2 = new Datum<>(k2);
        Datum<Anabul> d3 = new Datum<>(a1);
        Datum<Anabul> d4 = new Datum<>(b1);

        Anabul x;

        x = d1.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();

        x = d2.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();

        x = d3.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();

        x = d4.getIsi();
        System.out.println("Nama: " + x.getNama());
        x.gerak();
        x.bersuara();
        x.infoTambahan();
        System.out.println();
    }
}