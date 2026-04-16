package LatihanUTS;

public class Insidental extends Pelatihan {
    private String waktu;
    private boolean isOnline;

    public Insidental(){
        super();
        this.waktu = "";
        this.isOnline = false;
    }

    public Insidental(String kode, String nama, int kuota, String nama_instruksi, double harga, double pajak, String waktu, boolean isOnline) {
        super(kode, nama, kuota, nama_instruksi, harga, pajak);
        this.waktu = waktu;
        this.isOnline = isOnline;
    }

    public String getWaktu(){
        return this.waktu;
    }

    public void setWaktu(String waktu){
        this.waktu = waktu;
    }

    public boolean getIsOnline(){
        return this.isOnline;
    }

    public void setIsOnline(boolean isOnline){
        this.isOnline = isOnline;
    }

    public void printInfo(){
        System.out.println("Kode: " + getKode());
        System.out.println("Nama: " + getNama());
        System.out.println("Kuota: " + getKuota());
        System.out.println("Nama Instruksi: " + getNamaInstruksi());
        System.out.println("Harga: " + getHarga());
        System.out.println("Pajak: " + getPajak());
        System.out.println("Waktu: " + waktu);
        System.out.println("Metode: " + (isOnline ? "Online" : "Offline"));
    }
}
