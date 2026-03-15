public class MRumahSakit {
    public static void main(String[] args) {
        // Dokter dan Perawat
        DokterMitra dokterMitra = new DokterMitra(1, "D001", "Dr. Rian", "Laki-laki", "08123456789", "Jl. Merdeka 10", "Bedah", "RS Mitra", 12000000.0);
        DokterTetap dokterTetap = new DokterTetap(2, "D002", "Dr. Lina", "Perempuan", "08129876543", "Jl. Sudirman 20", "Umum", 15000000.0);
        PerawatKontrak perawatKontrak = new PerawatKontrak(101, "Nina", "31-12-2025", 5000000);
        PerawatTetap perawatTetap = new PerawatTetap(102, "Tia", "NIP-2024-002", 8000000.0);

        System.out.println("=== DATA TENAGA KESEHATAN ===");
        dokterMitra.printInfo();
        System.out.println();
        dokterTetap.printInfo();
        System.out.println();
        perawatKontrak.printInfo();
        System.out.println();
        perawatTetap.printInfo();
        System.out.println();

        // Pasien Rawat Inap
        Pasien pasienInap = new Pasien(201, "P001", "Eka", "Laki-laki", "PNS", "Jakarta", "01-01-2000", "08111111111", "Jakarta", "01-03-2026", "Demam tinggi dan dehidrasi");
        Ruang ruang = new Ruang(1, "R-101", 101, 3);
        RawatInap rawatInap = new RawatInap(301, "RI001", pasienInap, ruang, "05-03-2026", "10-03-2026");

        // Pasien Rawat Jalan
        Pasien pasienJalan = new Pasien(202, "P002", "Budi", "Laki-laki", "Karyawan Swasta", "Bandung", "02-02-1995", "08222222222", "Bandung", "02-03-2026", "Batuk pilek");
        RawatJalan rawatJalan = new RawatJalan(302, "RJ001", pasienJalan, dokterTetap, "Infeksi Saluran Pernafasan Atas", "Paracetamol 500mg", "03-03-2026");

        // Rekam medis untuk rawat inap
        RekamMedis rmInap = new RekamMedis(401, rawatInap, dokterMitra, perawatTetap, "Demam akibat infeksi virus", "Paracetamol, Cairan IV", "06-03-2026");

        System.out.println("=== DATA RAWAT INAP ===");
        rawatInap.printInfo();
        System.out.println();

        System.out.println("=== DATA RAWAT JALAN ===");
        rawatJalan.printInfo();
        System.out.println();

        System.out.println("=== REKAM MEDIS ===");
        rmInap.printInfo();
        System.out.println();

        System.out.println("=== RINGKASAN ===");
        System.out.println("Dokter Mitra: " + dokterMitra.getNama() + " (" + dokterMitra.getAsal() + ")");
        System.out.println("Dokter Tetap: " + dokterTetap.getNama());
        System.out.println("Perawat Kontrak: " + perawatKontrak.getNama());
        System.out.println("Perawat Tetap: " + perawatTetap.getNama());
        System.out.println("Pasien Inap: " + pasienInap.getNama() + " di ruang " + ruang.getKode());
        System.out.println("Pasien Jalan: " + pasienJalan.getNama() + " ditangani dokternya " + rawatJalan.getDokter().getNama());
        System.out.println("Rekam medis (Rawat Inap): " + rmInap.getDiagnosis() + " | " + rmInap.getResep());
    }
}
