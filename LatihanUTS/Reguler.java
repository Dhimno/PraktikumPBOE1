package LatihanUTS;

public class Reguler extends Pelatihan {
    private String waktu;
    private String level;
    private String metode;

    public Reguler(){
        super();
        this.waktu = "";
        this.level = "";
        this.metode = "";
    }

    public Reguler(String kode, String nama, int kuota, String nama_instruksi, double harga, double pajak, String waktu, String level, String metode) {
        super(kode, nama, kuota, nama_instruksi, harga, pajak);
        this.waktu = waktu;
        this.level = level;
        this.metode = metode;
    }

    public String getWaktu(){
        return this.waktu;
    }

    public String getLevel(){
        return this.level;
    }

    public String getMetode(){
        return this.metode;
    }
    public void setWaktu(String waktu){
        this.waktu = waktu;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public void setMetode(String metode){
        this.metode = metode;  
    }

    public void printInfo(){
        System.out.println("Kode: " + getKode());
        System.out.println("Nama: " + getNama());
        System.out.println("Kuota: " + getKuota());
        System.out.println("Nama Instruksi: " + getNamaInstruksi());
        System.out.println("Harga: " + getHarga());
        System.out.println("Pajak: " + getPajak());
        System.out.println("Waktu: " + waktu);
        System.out.println("Level: " + level);
        System.out.println("Metode: " + metode);
    }
}
