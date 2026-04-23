/* Anggota Kelompok 5: */
/* Gregorius Septiano Ariadi (24060124120026) */
/* Fadhil Yaafi Widodo (24060124140169) */
/* Djuan Setyo Jati (24060124140163) */
/* Dhimas Reza Nafi Wahyudi (24060124120010) */
/* Farhan Dwiyan Akbar (24060124140137) */
/* Kelas: E */

class DokterTetap extends Dokter {
    private double gajiPokok;
    public DokterTetap() { 
        super(); 
        this.gajiPokok = 0.0; 
    }

    public DokterTetap(int id, String kode, String nama, String jenisKelamin, String telpon, String alamat, String spesialisasi, double gajiPokok) {
        super(id, kode, nama, jenisKelamin, telpon, alamat, spesialisasi);
        this.gajiPokok = gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }
    public double getGajiPokok() { 
        return gajiPokok; 
    }

    @Override 
    public void printInfo() { 
        super.printInfo(); 
        System.out.println("Status: Pegawai Tetap"); 
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}