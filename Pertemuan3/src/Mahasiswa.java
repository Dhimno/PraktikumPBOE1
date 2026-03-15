/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 5 Maret 2026
 */

import java.util.ArrayList;
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<Matkul> listMatkul;
    private Dosen1 dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this("", "", "");
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNIM(){
        return NIM;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public String getProdi(){
        return Prodi;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public void setListMatkul(ArrayList<Matkul> listMatkul){
        this.listMatkul = listMatkul;
    }

    public Dosen1 getDosen(){
        return dosenWali;
    }

    public void setDosenWali(Dosen1 dosenWali){
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul(Matkul newMatkul){
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS(){
        int i;
        int count = 0;
        for(i=0; i<listMatkul.size(); i++){
            count = count + listMatkul.get(i).getsks();
        }
        return count;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Prodi = " + Prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Prodi = " + Prodi);
        System.out.println("List Mata Kuliah = ");
        int j;
        for(j = 0; j < listMatkul.size(); j++){
            System.out.println(listMatkul.get(j).getNama());
        }

        System.out.println("NIP dosen Wali = " + dosenWali.getNIP());
        System.out.println("Nama dosen Wali = " + dosenWali.getNama());
        System.out.println("Data dosen Wali = " + dosenWali.getNama());
        System.out.println("No Plat Kendaraan = " + kendaraan.getNoPlat());
        System.out.println("Kendaraan Jenis = " + kendaraan.getJenis());
    }


}
