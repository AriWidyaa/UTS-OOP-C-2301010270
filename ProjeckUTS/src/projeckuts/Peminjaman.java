/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeckuts;

/**
 *
 * @author ariwi
 */
public class Peminjaman {
    private String namaMahasiswa;
    private String nim;
    private String kodeBuku;
    private String judulBuku;
    private String tglPinjam;
    private String tglKembali;
    
    public Peminjaman(String namaMahasiswa, String nim, String kodeBuku, String judulBuku, String tglPinjam, String tglKembali){
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }
    
    public void setKodeBuku(String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    
    public void setKodeBuku(){
        this.kodeBuku = "Tidak Diketahui";
    }
    
    public String getNamaMahasiswa(){
        return namaMahasiswa;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getKodeBuku(){
        return kodeBuku;
    }
    
    public String getJudulBuku(){
        return judulBuku;
    }
    
    public String getTglPinjam(){
        return tglPinjam;
    }
    
    public String getTglKembali(){
        return tglKembali;
    }
    
    @Override
    public String toString() {
        return "Nama: " +namaMahasiswa + ", NIM: " + nim+ ", Kode Buku: " +kodeBuku+ ", Judul Buku: " + judulBuku+ ", Tanggal Pinjam: " + tglPinjam+ ", Tanggal Kembali: " + tglKembali;
    }
}
