/* Anggota Kelompok 5: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

/* File: Perawat.java */
public class Perawat {
    protected int id;
    protected String nama;
    public Perawat() { 
        this(0, ""); 
    }
    public Perawat(int id, String nama) { 
        this.id = id; 
        this.nama = nama; 
    }

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
    public void printInfo() { 
        System.out.println("Nama: " + nama); 
        System.out.println("ID: " + id);
    }
}