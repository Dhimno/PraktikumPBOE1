/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 5 Maret 2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        this("","");
    }
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }


    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan(){
        System.out.println("Plat Nomor = " + noPlat + ", Jenis = " + jenis);
    }
}
