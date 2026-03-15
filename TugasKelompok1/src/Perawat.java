/* File: Perawat.java */
public class Perawat extends Orang {
    public Perawat() {
        super(0, "Perawat Default");
    }

    public Perawat(int id, String nama) {
        super(id, nama);
    }

    @Override
    public String getRole() {
        return "Perawat";
    }

    @Override
    public void printInfo() {
        System.out.println("PERAWAT: " + nama + " (ID: " + id + ")");
    }
}