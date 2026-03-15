/* File: Dokter.java */
public class Dokter {
    protected int id;
    protected String kode, nama, jenisKelamin, telpon, alamat, spesialisasi;

    public Dokter() { 
        this(0, "", "", "", "", "", ""); 
    }
    public Dokter(int id, String kode, String nama, String jenisKelamin, String telpon, String alamat, String spesialisasi) {
        this.id = id; 
        this.kode = kode; 
        this.nama = nama; 
        this.jenisKelamin = jenisKelamin;
        this.telpon = telpon; 
        this.alamat = alamat; 
        this.spesialisasi = spesialisasi;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    public String getKode() { 
        return kode; 
    }
    public void setKode(String kode) { 
        this.kode = kode; 
    }
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) {
        this.nama = nama; 
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

    public void printInfo() {
        String kategori = spesialisasi.equalsIgnoreCase("Umum") ? "Dokter Umum" : "Dokter Spesialis (" + spesialisasi + ")";
        System.out.println("DOKTER: " + nama + " | Kategori: " + kategori);
    }
}
