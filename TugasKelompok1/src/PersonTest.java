public class PersonTest {
    public static void main(String[] args) {
        System.out.println("=== PERSON TEST ===");

        Dokter dokter = new Dokter(10, "D010", "Dr. Ika", "Perempuan", "081234567890", "Jl. Kesehatan 9", "Umum");
        Perawat perawat = new Perawat(20, "Sinta");

        Person p1 = dokter;
        Person p2 = perawat;

        System.out.println("- Person p1 role: " + p1.getRole());
        p1.printInfo();

        System.out.println("- Person p2 role: " + p2.getRole());
        p2.printInfo();

        System.out.println("\n=== TEST OVERRIDING && OVERLOADING ===");
        dokter.printInfo();
        dokter.printInfo(true);

        System.out.println("\n=== ASSERTION/EXCEPTION TEST ===");
        try {
            new Dokter(30, "", "Dr. Tirta", "Laki-laki", "080000000", "Alamat", "Umum");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}