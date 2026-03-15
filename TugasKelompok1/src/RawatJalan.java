class RawatJalan extends Rawat {
    private Dokter dokter;
    private String diagnosis, resep;

    public RawatJalan() { 
        super(); 
        this.dokter = new Dokter(); 
        this.diagnosis = ""; 
        this.resep = ""; 
    }

    public RawatJalan(int id, String kode, String keluhan, Pasien pasien, Dokter dokter, String diagnosis, String resep, String tanggal) {
        super(id, kode, keluhan, pasien);
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