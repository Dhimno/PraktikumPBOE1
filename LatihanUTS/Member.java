package LatihanUTS;
import java.util.Date;

public class Member extends Peserta{
    private String noAnggota;
    private Date tglBergabung;
    private static double diskon;

    public Member() {
        super();
        this.noAnggota = "";
        this.tglBergabung = new Date();
    }

    public Member(String NIK, String nama, String email, String noAnggota, Date tglBergabung) {
        super(NIK, nama, email);
        this.noAnggota = noAnggota;
        this.tglBergabung = tglBergabung;
    }

    public String getNoAnggota() {
        return this.noAnggota;
    }

    public void setNoAnggota(String noAnggota) {
        this.noAnggota = noAnggota;
    }

    public Date getTglBergabung() {
        return this.tglBergabung;
    }

    public void setTglBergabung(Date tglBergabung) {
        this.tglBergabung = tglBergabung;
    }   
    
    public static double getDiskon() {
        return diskon;
    }

    public static void setDiskon(double diskon) {
        Member.diskon = diskon;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("No Anggota: " + this.noAnggota);
        System.out.println("Tanggal Bergabung: " + this.tglBergabung);
        System.out.println("Diskon: " + Member.getDiskon());

    }
    
}
