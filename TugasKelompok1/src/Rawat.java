/* File: Rawat.java */
public class Rawat {
    protected int id;
    protected String kode, keluhan;
    protected Pasien pasien;

    public Rawat() { 
        this(0, "", "", new Pasien()); 
    }
    public Rawat(int id, String kode, String keluhan, Pasien pasien) {
        this.id = id; 
        this.kode = kode; 
        this.keluhan = keluhan; 
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

    public String getKeluhan() { 
        return keluhan; 
    }

    public void setKeluhan(String keluhan) { 
        this.keluhan = keluhan; 
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
        System.out.println("Keluhan: " + keluhan);
        pasien.printInfo();
    }
}