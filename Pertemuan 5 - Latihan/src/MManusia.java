public class MManusia {
    public static void main(String[] args) {
        Pengusaha p1 = new Pengusaha("Dina", java.time.LocalDate.of(2020, 1, 10), "Jakarta", 5000000, "12.345.678.9-012.345");
        PNS p2 = new PNS("Budi", java.time.LocalDate.of(2018, 3, 15), "Bandung", 7000000, "1987654321");
        Petani p3 = new Petani("Andi", java.time.LocalDate.of(2022, 7, 20), "Sukabumi", 2500000, "Sukabumi");

        System.out.println("=== INFORMASI PENGUSAHA ===");
        p1.cetakInfo();
        System.out.println("Masa Kerja Pengusaha: " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Pajak Pengusaha: Rp " + String.format("%,.0f", p1.hitungPajak()));

        System.out.println("\n=== INFORMASI PNS ===");
        p2.cetakInfo();
        System.out.println("Masa Kerja PNS: " + p2.hitungMasaKerja() + " tahun");
        System.out.println("Pajak PNS: Rp " + String.format("%,.0f", p2.hitungPajak()));

        System.out.println("\n=== INFORMASI PETANI ===");
        p3.cetakInfo();
        System.out.println("Masa Kerja Petani: " + p3.hitungMasaKerja() + " tahun");
        System.out.println("Pajak Petani: Rp " + String.format("%,.0f", p3.hitungPajak()));

        System.out.println("\n=== COUNTERS ===");
        System.out.println("Total Manusia: " + Manusia.getCounterMns());
        System.out.println("Total Pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Total PNS: " + PNS.getCounterPNS());
        System.out.println("Total Petani: " + Petani.getCounterPetani());
    }
}
