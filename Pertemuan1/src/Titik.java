/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Dhimas Reza Nafi Wahyudi
 * Tanggal      : 19 Februari 2026
 */

public class Titik {
    double absis;
    double ordinat;

    Titik(){
        absis = 0;
        ordinat = 0;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}

