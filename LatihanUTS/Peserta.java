package LatihanUTS;

public class Peserta {
    private String NIK;
    private String nama;
    private String email;

    public Peserta() {
        this.NIK = "";
        this.nama = "";
        this.email = "";
    }

    public Peserta(String NIK, String nama, String email) {
        this.NIK = NIK;
        this.nama = nama;
        this.email = email;
    }

    public String getNIK() {
        return this.NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo() {
        System.out.println("NIK: " + this.NIK);
        System.out.println("Nama: " + this.nama);
        System.out.println("Email: " + this.email);
    }
    
}
