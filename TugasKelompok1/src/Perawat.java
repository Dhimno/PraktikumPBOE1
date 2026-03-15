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