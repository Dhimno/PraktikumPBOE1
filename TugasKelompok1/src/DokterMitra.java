/* Anggota Kelompok: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

class DokterMitra extends Dokter {
    private String instansiAsal;
    private double gajiPokok;

    public DokterMitra() { 
        super(); 
        this.instansiAsal = ""; 
        this.gajiPokok = 0.0;
    }

    public DokterMitra(int id, String kode, String nama, String jenisKelamin, String telpon, String alamat, String spesialisasi, String instansiAsal, double gajiPokok) {
        super(id, kode, nama, jenisKelamin, telpon, alamat, spesialisasi);
        this.instansiAsal = instansiAsal;
        this.gajiPokok = gajiPokok;
    }

    public void setAsal(String asal) { 
        this.instansiAsal = asal; 
    }

    public String getAsal() { 
        return instansiAsal; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    @Override 
    public void printInfo() { 
        super.printInfo(); 
        System.out.println("Status: Mitra dari " + instansiAsal); 
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}