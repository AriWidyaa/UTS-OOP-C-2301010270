/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeckuts;

import java.util.Scanner;

/**
 *
 * @author Ari Widya
 * TGL : 6 Mei 2025
 */
public class ProjeckUTS {

    /**
     * @param args the command line arguments
     */
        private static Peminjaman[] dataPeminjaman = new Peminjaman[100];
        private static int jumlahData = 0;
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int pilihan = 0;
            
            while (pilihan !=5) {
                System.out.println("\n===== DAFTAR PEMINJAMAN BUKU =====");
                System.out.println("1. Tambah Data Peminjaman");
                System.out.println("2. Tampilakan Data Peminjaman");
                System.out.println("3. Ubah Data Peminjaman");
                System.out.println("4. Hapus Data Peminjaman");
                System.out.println("5. Keluar");
                System.out.println("Pilih Menu :");
                pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1:
                        tambahData(scanner);
                        break;
                    case 2:
                        tampilkanData();
                        break;
                    case 3:
                        ubahData(scanner);
                        break;
                    case 4:
                        hapusData(scanner);
                        break;
                    case 5:
                        System.out.println("Keluar Dari Program");
                        break;
                    default:
                        System.out.println("Pilihan Tidak Valid");
                }
            }
            
            scanner.close();
        }
        
        private static void tambahData(Scanner scanner){
            System.out.print("Nama Mahasiswa : ");
            String nama = scanner.nextLine();
            System.out.print("NIM : ");
            String nim = scanner.nextLine();
            System.out.print("Kode Buku : ");
            String kode = scanner.nextLine();
            System.out.print("Judul Buku : ");
            String judul = scanner.nextLine();
            System.out.print("Tanggal Pinjam : ");
            String tglPinjam = scanner.nextLine();
            System.out.print("Tanggal Kembali : ");
            String tglKembali = scanner.nextLine();
            
            dataPeminjaman[jumlahData] = new Peminjaman(nama, nim, kode, judul, tglPinjam, tglKembali);
            jumlahData++;
            System.out.println("Data Berhasil di Tambahkan!");
        }
        
        private static void tampilkanData(){
            System.out.println("\n===== DAFTAR PEMINJAMAN =====");
            for (int i = 0; i < jumlahData; i++){
                System.out.println((i + 1) + ". " + dataPeminjaman[i]);
            }
        }
        
        private static void ubahData(Scanner scanner){
            tampilkanData();
            System.out.print("Masukkan Nomor Data Yang Ingin di Ubah!");
            int index = scanner.nextInt() - 1;
            scanner.nextLine();
            
            if (index >=0 && index < jumlahData) {
                System.out.print("Kode Buku Baru : ");
                String kodeBuku = scanner.nextLine();
                dataPeminjaman[index].setKodeBuku(kodeBuku);
                System.out.println("Data Berhasil di Ubah!");
            }else{
                System.out.println("Nomor Data Tidak Valid.");
            }
        }
        
        private static void hapusData(Scanner scanner){
            tampilkanData();
            System.out.print("Masukkan Nomor Data Yang Ingin di Hapus : ");
            int index = scanner.nextInt() - 1;
            
            if (index >= 0 && index < jumlahData){
                for (int i = index; i < jumlahData - 1; i++) {
                    dataPeminjaman[i] = dataPeminjaman[i+1];
                }
                jumlahData--;
                System.out.println("Data Berhasil di Hapus!");
            }else{
                System.out.println("Nomor Data Tidak Valid.");
            }
        }
    }
    
  

    