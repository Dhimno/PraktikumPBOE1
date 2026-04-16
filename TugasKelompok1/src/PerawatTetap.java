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
class PerawatTetap extends Perawat {
    private String nip;
    private double gajiPokok;

    public PerawatTetap() { 
        super(); 
        this.nip = "";
        this.gajiPokok = 0.0;

    }

    public PerawatTetap(int id, String nama, String nip, double gajiPokok) {
        super(id, nama);
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    @Override 
    public void printInfo() { 
        super.printInfo(); 
        System.out.println("Status: Tetap (NIP: " + nip + ")"); 
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}