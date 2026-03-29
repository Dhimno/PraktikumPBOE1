/* Anggota Kelompok: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

/* File: RekamMedis.java */
public class RekamMedis {
    private int id;
    private RawatInap rawatInap;
    private Dokter dokter;
    private Perawat perawat;
    private String diagnosis, resep, tanggal;

    public RekamMedis() {
        this.id = 0; 
        this.rawatInap = new RawatInap(); 
        this.dokter = new Dokter();
        this.perawat = new Perawat(); 
        this.diagnosis = ""; 
        this.resep = ""; 
        this.tanggal = "";
    }

    public RekamMedis(int id, RawatInap rawatInap, Dokter dokter, Perawat perawat, String diagnosis, String resep, String tanggal) {
        this.id = id; 
        this.rawatInap = rawatInap; 
        this.dokter = dokter; 
        this.perawat = perawat; 
        this.diagnosis = diagnosis; 
        this.resep = resep; 
        this.tanggal = tanggal;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }  
    public RawatInap getRawatInap() { 
        return rawatInap; 
    }
    public void setRawatInap(RawatInap rawatInap) { 
        this.rawatInap = rawatInap; 
    }
    public Dokter getDokter() { 
        return dokter; 
    }
    public void setDokter(Dokter dokter) { 
        this.dokter = dokter; 
    }
    public Perawat getPerawat() { 
        return perawat; 
    }
    public void setPerawat(Perawat perawat) { 
        this.perawat = perawat; 
    }
    public String getDiagnosis() { 
        return diagnosis; 
    }
    public void setDiagnosis(String diagnosis) { 
        this.diagnosis = diagnosis; 
    }
    public String getResep() { 
        return resep; 
    }
    public void setResep(String resep) { 
        this.resep = resep; 
    }
    public String getTanggal() { 
        return tanggal; 
    }
    public void setTanggal(String tanggal) { 
        this.tanggal = tanggal; 
    }  

    public void printInfo() {
        System.out.println("========== REKAM MEDIS ==========");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Pasien: " + rawatInap.getPasien().getNama());
        System.out.println("Dokter Pemeriksa: " + dokter.getNama());
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Resep: " + resep);
        System.out.println("=================================");
    }
}