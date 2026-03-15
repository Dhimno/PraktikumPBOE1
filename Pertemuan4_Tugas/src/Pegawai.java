/* Nama File    : Pegawai.java */
public class Pegawai {
    private String NIP;
    private String Nama;
    private String TanggalLahir;
    private String TMT;
    private double GajiPokok;

    public Pegawai() {
        this("", "", "", "", 0.0);
    }

    public Pegawai(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    // Getter & Setter
    public String getNIP() { 
        return NIP; 
    }
    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }

    public String getNama() { 
        return Nama; 
    }
    public void setNama(String Nama) { 
        this.Nama = Nama; 
    }

    public String getTanggalLahir() { 
        return TanggalLahir; 
    }

    public void setTanggalLahir(String TanggalLahir) { 
        this.TanggalLahir = TanggalLahir; 
    }

    public String getTMT() { 
        return TMT; 
    }
    public void setTMT(String TMT) { 
        this.TMT = TMT; 
    }

    public double getGajiPokok() { 
        return GajiPokok; 
    }
    public void setGajiPokok(double GajiPokok) { 
        this.GajiPokok = GajiPokok; 
    }

    public void printLaporan() {
        System.out.println("Laporan Pegawai: " + Nama + " (" + NIP + ")");
    }
}