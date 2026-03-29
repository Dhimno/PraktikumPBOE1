/* Anggota Kelompok: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

class RawatJalan extends Rawat {
    private Dokter dokter;
    private String diagnosis, resep;

    public RawatJalan() { 
        super(); 
        this.dokter = new Dokter(); 
        this.diagnosis = ""; 
        this.resep = ""; 
    }

    public RawatJalan(int id, String kode, Pasien pasien, Dokter dokter, String diagnosis, String resep, String tanggal) {
        super(id, kode, pasien);
        this.dokter = dokter;
        this.diagnosis = diagnosis;
        this.resep = resep;
    }

    public Dokter getDokter() { 
        return dokter; 
    }
    public void setDokter(Dokter d) { 
        this.dokter = d; 
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

    @Override 
    public void printInfo() {
        System.out.println("--- JENIS: RAWAT JALAN ---");
        super.printInfo();
        System.out.println("Dokter: " + dokter.getNama());
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Resep: " + resep);
        dokter.printInfo();
    }
}