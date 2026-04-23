/* Nama File    : Tendik.java
 * Deskripsi    : Membuat class Tendik sebagai subclass dari Pegawai
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */
public class Tendik extends Pegawai {
    private String Bidang;
    private double BUP;

    public Tendik() {
        super();
        this.Bidang = "";
        this.BUP = 0.0;
    }

    public Tendik(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok, String Bidang, double BUP) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Bidang = Bidang;
        this.BUP = BUP;
    }

    public String getBidang() { 
        return Bidang; 
    }
    public void setBidang(String Bidang) { 
        this.Bidang = Bidang; 
    }

    public double getBUP() { 
        return BUP; 
    }
    public void setBUP(double BUP) { 
        this.BUP = BUP; 
    }
    public double getTunjangan(int tahunTMT){
        return 0.01 * getHitungMasaKerja(tahunTMT) * getGajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang Tendik : " + Bidang);
        System.out.println("BUP Tendik : " + BUP);
    }

}