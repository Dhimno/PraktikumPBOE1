public abstract class Orang implements Printable {
    protected int id;
    protected String nama;

    public Orang(int id, String nama) {
        assert id >= 0 : "ID harus >= 0";
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getRole();

    @Override
    public void printInfo() {
        System.out.println("[" + getRole() + "] " + nama + " (ID: " + id + ")");
    }
}