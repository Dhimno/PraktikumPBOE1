/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(){
        this.jari=0;
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari=jari;
    }

    public double getLuas(){
        return 3.14 * (this.jari * this.jari);
    }

    public double getKeliling(){
        return 2 * 3.14 * this.jari;
    }

    @Override
    public void printInfo(){
    System.out.println("Jumlah Warna: " + getWarna());
    System.out.println("Jumlah Border: " + getBorder());
    System.out.println("Luas: " + getLuas());
    System.out.println("Jari: " + getJari());
    }
}
