/* Nama File    : IResize.java
 * Deskripsi    : Membuat interface IResize untuk mengubah ukuran bangun datar
 * Pembuat      : Dhimas Reza Nafi Wahyudi/24060124120010
 * Tanggal      : Kamis, 16 April 2026
 */

public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}