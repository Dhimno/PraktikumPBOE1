/* Nama File    : Dosen.java */
public class Dosen extends Pegawai {
    private String Fakultas;

    public Dosen() {
        super();
        this.Fakultas = "";
    }

    public Dosen(String NIP, String Nama, String TanggalLahir, String TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas() { 
        return Fakultas; 
    }
    public void setFakultas(String Fakultas) { 
        this.Fakultas = Fakultas; 
    }
   @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas Dosen : " + Fakultas);
    }
}