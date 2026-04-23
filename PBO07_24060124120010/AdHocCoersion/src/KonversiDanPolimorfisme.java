/* Nama File    : KonversiDanPolimorfisme.java
 * Deskripsi    : Program ilustrasi polimorfisme ad hoc coercion
 *                Konversi tipe data dan operasi string
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : 23 April 2026
 */

public class KonversiDanPolimorfisme {
    public static void main(String[] args) {
        int nilai = 65;
        System.out.println("Sebagai integer: " + nilai);
        System.out.println("Sebagai karakter: " + (char) nilai);
        System.out.println("Sebagai real: " + (double) nilai);

        int original = 42;
        double real = (double) original;
        int kembali = (int) real;
        System.out.println("Original: " + original + ", Real: " + real + ", Kembali: " + kembali);

        String X = "1234";
        String Y = "5678";
        String S = X + Y; 
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S (konkatenasi): " + S);
        System.out.println("Z (penjumlahan): " + Z);

        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R (konkatenasi): " + R);
        System.out.println("D (penjumlahan): " + D);

        int A = Integer.parseInt(S);
        System.out.println("A: " + A);

        String T = Integer.toString(A);
        System.out.println("T: " + T);
    }
}
