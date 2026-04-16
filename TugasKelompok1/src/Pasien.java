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
/* File: Pasien.java */
public class Pasien {
    private int id;
    private String kode, nama, jenisKelamin, pekerjaan, tempatLahir, tanggalLahir, telpon, alamat, tanggalDaftar, keluhan;

    public Pasien() { 
        this(0, "", "", "", "", "", "", "", "", "", ""); 
    }
    public Pasien(int id, String kode, String nama, String jenisKelamin, String pekerjaan, String tempatLahir, String tanggalLahir, String telpon, String alamat, String tanggalDaftar, String keluhan) {
        this.id = id; 
        this.kode = kode; 
        this.nama = nama; 
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan; 
        this.tempatLahir = tempatLahir; 
        this.tanggalLahir = tanggalLahir;
        this.telpon = telpon; 
        this.alamat = alamat; 
        this.tanggalDaftar = tanggalDaftar;
        this.keluhan = keluhan;
    }

    // Getter & Setter
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
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

    public String getPekerjaan() { 
        return pekerjaan; 
    }

    public void setPekerjaan(String pekerjaan) { 
        this.pekerjaan = pekerjaan; 
    }

    public String getTempatLahir() { 
        return tempatLahir; 
    }

    public void setTempatLahir(String tempatLahir) { 
        this.tempatLahir = tempatLahir; 
    }

    public String getTanggalLahir() { 
        return tanggalLahir; 
    }
    public void setTanggalLahir(String tanggalLahir) { 
        this.tanggalLahir = tanggalLahir; 
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

    public String getTanggalDaftar() { 
        return tanggalDaftar; 
    }

    public void setTanggalDaftar(String tanggalDaftar) { 
        this.tanggalDaftar = tanggalDaftar; 
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void printInfo() {
        System.out.println("PASIEN: [" + kode + "] " + nama + " | Keluhan: " + keluhan + " | Alamat: " + alamat);
    }
}