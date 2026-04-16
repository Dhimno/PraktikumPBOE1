package LatihanUTS;
import java.util.Date;

public class Registrasi {
    private Date tglRegistrasi;
    private Date tglBayar;
    private String metodePembayaran;
    private Peserta peserta;
    private Pelatihan pelatihan;

    public Registrasi() {
        this.tglRegistrasi = new Date();
        this.tglBayar = new Date();
        this.metodePembayaran = "";
        this.peserta = new Peserta();
        this.pelatihan = new Pelatihan();
    }

    public Registrasi(Date tglRegistrasi, Date tglBayar, String metodePembayaran, Peserta peserta, Pelatihan pelatihan) {
        this.tglRegistrasi = tglRegistrasi;
        this.tglBayar = tglBayar;
        this.metodePembayaran = metodePembayaran;
        this.peserta = peserta;
        this.pelatihan = pelatihan;
    }

    public Date getTglRegistrasi() {
        return this.tglRegistrasi;
    }

    public void setTglRegistrasi(Date tglRegistrasi) {
        this.tglRegistrasi = tglRegistrasi;
    }

    public Date getTglBayar() {
        return this.tglBayar;
    }

    public void setTglBayar(Date tglBayar) {
        this.tglBayar = tglBayar;
    }

    public String getMetodePembayaran() {
        return this.metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public Peserta getPeserta() {
        return this.peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }

    public Pelatihan getPelatihan() {
        return this.pelatihan;
    }

    public void setPelatihan(Pelatihan pelatihan) {
        this.pelatihan = pelatihan;
    }

    public void printInfo() {
        System.out.println("Tanggal Registrasi: " + tglRegistrasi);
        System.out.println("Tanggal Bayar: " + tglBayar);
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("Peserta: " + peserta.getNama());
        System.out.println("Pelatihan: " + pelatihan.getNama());
    }
}
