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