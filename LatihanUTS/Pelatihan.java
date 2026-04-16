package LatihanUTS;

public class Pelatihan {
    private String kode;
    private String nama;
    private int kuota;
    private String nama_instruksi;
    private double harga;
    private double pajak;

    public Pelatihan() {
        this.kode = "";
        this.nama = "";
        this.kuota = 0;
        this.nama_instruksi = "";
        this.harga = 0.0;
        this.pajak = 0.0;
    }

    public Pelatihan(String kode, String nama, int kuota, String nama_instruksi, double harga, double pajak) {
        this.kode = kode;
        this.nama = nama;
        this.kuota = kuota;
        this.nama_instruksi = nama_instruksi;
        this.harga = harga;
        this.pajak = pajak;
    }

    public String getKode(){
        return this.kode;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getKuota(){
        return this.kuota;
    }

    public void setKuota(int kuota){
        this.kuota = kuota;
    }

    public String getNamaInstruksi(){
        return this.nama_instruksi;
    }

    public void setNamaInstruksi(String nama_instruksi){
        this.nama_instruksi = nama_instruksi;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public double getPajak(){
        return this.pajak;
    }

    public void setPajak(double pajak){
        this.pajak = pajak;
    }

    public void printInfo(){
        System.out.println("Kode Pelatihan: " + this.kode);
        System.out.println("Nama Pelatihan: " + this.nama);
        System.out.println("Kuota: " + this.kuota);
        System.out.println("Nama Instruksi: " + this.nama_instruksi);
        System.out.println("Harga: " + this.harga);
        System.out.println("Pajak: " + this.pajak);
    }


    
}
