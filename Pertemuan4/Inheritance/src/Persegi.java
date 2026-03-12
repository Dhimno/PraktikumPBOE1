/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi=sisi;
    }

    public double getLuas(){
        return this.sisi * this.sisi;
    }

    public double getKeliling(){
        return this.sisi * 4;
    }

    public double getDiagonal(){
        return Math.sqrt(this.sisi*this.sisi + this.sisi*this.sisi);
    }
    @Override
    public void printInfo(){
    super.printInfo();
    System.out.println("Sisi: " + sisi);
    }
}
