/* Nama File    : DosenTamu.java
 * Deskripsi    : Membuat class DosenTamu sebagai subclass dari Dosen
 * Pembuat      : Dhimas Reza Nafi Wahyudi / 24060124120010
 * Tanggal      : Kamis, 12 Maret 2026
 */
public class DosenTamu extends Dosen {
    private String NIDK;

    public DosenTamu() {
        super();
        this.NIDK = "";
    }

    public DosenTamu(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok, String Fakultas, String NIDK) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
    }

    public String getNIDK() { 
        return NIDK; 
    }
    public void setNIDK(String NIDK) { 
        this.NIDK = NIDK; 
    }

    public double getTunjangan() {
        return 0.15 * getGajiPokok(); /* 15% dari gaji pokok */
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK Dosen Tamu : " + NIDK);
        System.out.println("Tunjangan Dosen Tamu : " + getTunjangan());
    }
}