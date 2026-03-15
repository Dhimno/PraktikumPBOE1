/* Nama File    : DosenTamu.java */
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
}