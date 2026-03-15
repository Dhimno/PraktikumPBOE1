class PerawatKontrak extends Perawat {
    private String masaBerlaku;
    private int gaji;
    public PerawatKontrak() { 
        super(); 
        this.masaBerlaku = ""; 
        this.gaji = 0;
    }

    public PerawatKontrak(int id, String nama, String masaBerlaku, int gaji) {
        super(id, nama);
        this.masaBerlaku = masaBerlaku;
        this.gaji = gaji;
    }
    public String getMasaBerlaku() { 
        return masaBerlaku; 
    }

    public void setMasaBerlaku(String masaBerlaku) { 
        this.masaBerlaku = masaBerlaku; 
    }

    public int getGaji() { 
        return gaji; 
    }

    public void setGaji(int gaji) { 
        this.gaji = gaji; 
    }

    @Override 
    public void printInfo() { 
        super.printInfo(); 
        System.out.println("Status: Kontrak s/d " + masaBerlaku); 
        System.out.println("Gaji: " + gaji); 
    }
}