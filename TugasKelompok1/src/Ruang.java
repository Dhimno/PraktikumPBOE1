/* Anggota Kelompok: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

/* File: Ruang.java */
public class Ruang {
    private int id, namaRuang, fasilitas;
    private String kode;

    public Ruang() { 
        this(0, "", 0, 0); 
    }
    public Ruang(int id, String kode, int namaRuang, int fasilitas) {
        this.id = id; 
        this.kode = kode; 
        this.namaRuang = namaRuang; 
        this.fasilitas = fasilitas;
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

    public int getNamaRuang() { 
        return namaRuang; 
    }
    public void setNamaRuang(int namaRuang) { 
        this.namaRuang = namaRuang;
    }

    public int getFasilitas() { 
        return fasilitas; 
    }

    public void setFasilitas(int fasilitas) { 
        this.fasilitas = fasilitas; 
    }
    public void printInfo() {
        System.out.println("RUANG: " + kode + " | Fasilitas Level: " + fasilitas);
    }
}