/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Jum'at, 27 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu 
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


    // mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    // menentukan kuadran
    int getKuadran(){
        if(absis > 0 && ordinat > 0) return 1;
        if(absis < 0 && ordinat > 0) return 2;
        if(absis < 0 && ordinat < 0) return 3;
        if(absis > 0 && ordinat < 0) return 4;
        return 0; // jika di sumbu
    }

    // jarak ke pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // jarak ke titik lain
    double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // refleksi terhadap sumbu X (ubah objek ini)
    void refleksiX(){
        ordinat = -ordinat;
    }

    // refleksi terhadap sumbu Y (ubah objek ini)
    void refleksiY(){
        absis = -absis;
    }

    // menghasilkan titik baru hasil refleksi sumbu X
    Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    // menghasilkan titik baru hasil refleksi sumbu Y
    Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
    
    // // konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     this(0,0);
    // }
    
    // void printCounterTitik(){
    //     System.out.println(this.counterTitik);
    // }

} // end class Titik