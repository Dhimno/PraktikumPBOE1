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