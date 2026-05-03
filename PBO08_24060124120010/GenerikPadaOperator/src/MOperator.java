/* Nama File    : MOperator.java
 * Deskripsi    : Class utama untuk menguji fungsi generik pada operator tukar dan bobot
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 30 April 2026
 */

public class MOperator {
    public static void main(String[] args) {
        Kotak<Integer> a = new Kotak<>(10);
        Kotak<Integer> b = new Kotak<>(25);

        System.out.println("Sebelum: a=" + a.getIsi() + ", b=" + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Sesudah: a=" + a.getIsi() + ", b=" + b.getIsi());
        System.out.println();

        Kotak<String> s1 = new Kotak<>("Selamat");
        Kotak<String> s2 = new Kotak<>("Pagi");

        System.out.println("Sebelum: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("Sesudah: s1=" + s1.getIsi() + ", s2=" + s2.getIsi());
        System.out.println();

        Kotak<Anabul> h1 = new Kotak<>(new Kucing("Nala", 2.9));
        Kotak<Anabul> h2 = new Kotak<>(new Anjing("Rex"));

        System.out.println("Sebelum:");
        System.out.println(h1.getIsi().getNama());
        System.out.println(h2.getIsi().getNama());

        OperatorGenerik.Tukar(h1, h2);

        System.out.println("Sesudah:");
        System.out.println(h1.getIsi().getNama());
        System.out.println(h2.getIsi().getNama());
        System.out.println();

        Kucing k1 = new Anggora("Pixel", 2.9);
        Kucing k2 = new KembangTelon("Shadow", 3.4);

        double total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("Total bobot: " + total + " kg");
    }
}