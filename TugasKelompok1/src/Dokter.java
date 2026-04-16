<<<<<<< Updated upstream
=======
/* Anggota Kelompok 5: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

>>>>>>> Stashed changes
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
