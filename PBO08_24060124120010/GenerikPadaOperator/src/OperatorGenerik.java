/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Membuat class OperatorGenerik yang berisi method-method generik untuk operasi tukar dan menghitung bobot.
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 30 April 2026
 */

public class OperatorGenerik {

    // prosedur tukar
    public static <T> void Tukar(Kotak<T> a, Kotak<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // fungsi Bobot2
    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}