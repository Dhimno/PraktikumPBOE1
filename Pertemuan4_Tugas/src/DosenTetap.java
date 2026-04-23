/* Nama File    : DosenTetap.java
 * Deskripsi    : Membuat class DosenTetap sebagai subclass dari Dosen
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */
public class DosenTetap extends Dosen {
    private String NIDN;
    private double BUP;

    public DosenTetap() {
        super();
        this.NIDN = "";
        this.BUP = 0.0;
    }

    public DosenTetap(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok, String Fakultas, String NIDN, double BUP) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
        this.BUP = BUP;
    }

    public String getNIDN() { 
        return NIDN; 
    }
    public void setNIDN(String NIDN) { 
        this.NIDN = NIDN; 
    }

    public double getBUP() { 
        return BUP; 
    }
    public void setBUP(double BUP) { 
        this.BUP = BUP; 
    }

    public double getTunjangan(int tahunTMT){
        return 0.02 * getHitungMasaKerja(tahunTMT) * getGajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN Dosen Tetap : " + NIDN);
        System.out.println("BUP Dosen Tetap : " + BUP);
    }
}
