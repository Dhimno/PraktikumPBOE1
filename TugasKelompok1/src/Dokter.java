/* File: Dokter.java */
public class Dokter extends Person {
    protected String kode, jenisKelamin, telpon, alamat, spesialisasi;

    public Dokter() {
        this(0, "D000", "Dokter Default", "Laki-laki", "0000000000", "Alamat", "Umum");
    }

    public Dokter(int id, String kode, String nama, String jenisKelamin, String telpon, String alamat, String spesialisasi) {
        super(id, nama);
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode dokter tidak boleh kosong");
        }
        this.kode = kode;
        this.jenisKelamin = jenisKelamin;
        this.telpon = telpon;
        this.alamat = alamat;
        this.spesialisasi = spesialisasi;
    }

    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getTelpon() {
        return telpon;
    }
    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getSpesialisasi() {
        return spesialisasi;
    }
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    @Override
    public String getRole() {
        return "Dokter";
    }

    @Override
    public void printInfo() {
        String kategori = spesialisasi.equalsIgnoreCase("Umum") ? "Dokter Umum" : "Dokter Spesialis (" + spesialisasi + ")";
        System.out.println("DOKTER: " + nama + " | Kode: " + kode + " | " + kategori);
    }

    // overloading
    public void printInfo(boolean showFull) {
        if (showFull) {
            printInfo();
            System.out.println("Jenis Kelamin: " + jenisKelamin);
            System.out.println("Telpon: " + telpon);
            System.out.println("Alamat: " + alamat);
        } else {
            printInfo();
        }
    }
}
