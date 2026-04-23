/* Anggota Kelompok 5: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

/* File: Rawat.java */
public class Rawat {
    protected int id;
    protected String kode;
    protected Pasien pasien;

    public Rawat() { 
        this(0, "", new Pasien()); 
    }
    public Rawat(int id, String kode, Pasien pasien) {
        this.id = id; 
        this.kode = kode; 
        this.pasien = pasien;
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

    public Pasien getPasien() { 
        return pasien; 
    }

    public void setPasien(Pasien pasien) { 
        this.pasien = pasien; 
    }
    public void printInfo() {
        System.out.println("ID Pasien: " + pasien.getId());
        System.out.println("KODE LAYANAN: " + kode);
        System.out.println("Keluhan: " + pasien.getKeluhan());
        pasien.printInfo();
    }
}