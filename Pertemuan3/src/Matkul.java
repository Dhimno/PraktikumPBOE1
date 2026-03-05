public class Matkul {
    private String idMatkul;
    private String Nama;
    private int sks;
    private static int counterMatkul;

    /* Class */

    public Matkul(){
        this("0", "Placeholder", 0);
        counterMatkul++;
    }

    public Matkul(String idMatkul, String Nama, int sks){
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.sks = sks;
        counterMatkul++;
    }

    /* Getter */

    public String getID(){
        return idMatkul;
    }

    public String getNama(){
        return Nama;
    }

    public int sks(){
        return sks;
    }

    public static int getCounterMatkul(){
        return counterMatkul;
    }

    /* Mutator */

    public void setID(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatkul(){
        System.out.println("idMatkul = " + idMatkul + ", Nama = " + Nama + ", sks = " + sks);
    }
}
