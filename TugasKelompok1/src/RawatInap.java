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
class RawatInap extends Rawat {
    private Ruang ruang;
    private String waktuMasuk, waktuKeluar;

    public RawatInap() { 
        super(); 
        this.ruang = new Ruang(); 
        this.waktuMasuk = ""; 
        this.waktuKeluar = ""; 
    }

    public RawatInap(int id, String kode, Pasien pasien, Ruang ruang, String waktuMasuk, String waktuKeluar) {
        super(id, kode, pasien);
        this.ruang = ruang;
        this.waktuMasuk = waktuMasuk;
        this.waktuKeluar = waktuKeluar;
    }

    public Ruang getRuang() { 
        return ruang; 
    }
    public void setRuang(Ruang ruang) { 
        this.ruang = ruang; 
    }
    
    public String getWaktuMasuk() { 
        return waktuMasuk; 
    }

    public void setWaktuMasuk(String waktuMasuk) { 
        this.waktuMasuk = waktuMasuk; 
    }

    public String getWaktuKeluar() { 
        return waktuKeluar; 
    }

    public void setWaktuKeluar(String waktuKeluar) { 
        this.waktuKeluar = waktuKeluar; 
    }

    @Override 
    public void printInfo() {
        System.out.println("--- JENIS: RAWAT INAP ---");
        super.printInfo();
        System.out.println("Waktu Masuk: " + waktuMasuk);
        System.out.println("Waktu Keluar: " + waktuKeluar);
        ruang.printInfo();
    }
}