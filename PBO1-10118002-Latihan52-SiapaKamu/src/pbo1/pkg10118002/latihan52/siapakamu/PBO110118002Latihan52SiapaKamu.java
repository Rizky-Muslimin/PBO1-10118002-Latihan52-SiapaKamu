
package pbo1.pkg10118002.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 * Deskripsi Program : Program ini untuk membuat tampilan dosen dan mahasiswa.
 */
public class PBO110118002Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118002");
        System.out.println("\nNIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Rizky Muslimin");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO1");
        mahasiswa.kelasApa();
    }
    
}
