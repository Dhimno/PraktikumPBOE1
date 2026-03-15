public class MRumahSakitFail {
    public static void main(String[] args) {
        try {   
            System.out.println("=== MRumahSakitFail: validasi data masuk ===");
            // Buat pasien dengan kode kosong -> akan throw IllegalArgumentException
            Pasien pasienInvalid = new Pasien(301, "", "Rina", "Perempuan", "Ibu Rumah Tangga", "Jakarta", "10-10-1990", "08123000000", "Jakarta", "10-03-2026", "Sakit kepala");
            Ruang ruang = new Ruang(3, "R-303", 303, 3);
            RawatInap rawatInap = new RawatInap(501, "RI005", pasienInvalid, ruang, "10-03-2026", "12-03-2026");
            rawatInap.printInfo();
            System.out.println("Data berhasil terbuat (seharusnya tidak)");
        } catch (IllegalArgumentException ex) {
            System.err.println("FAIL: Data tidak valid -> " + ex.getMessage());
        } catch (AssertionError ex) {
            System.err.println("FAIL: Assertion error -> " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("FAIL: Terjadi kesalahan lain -> " + ex.getMessage());
        }
    }
}