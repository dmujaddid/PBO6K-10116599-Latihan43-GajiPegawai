/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan43.gajipegawai;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : 
 * 
 */
public class PBO6K10116599Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inisialisasi
        GajiPegawai gajiPegawai = new GajiPegawai();
        
        gajiPegawai.setNama("Rizki Adam Kurniawan");
        gajiPegawai.setAlamat("Jalan Semar dlm 4 No. 72/66");
        gajiPegawai.setUangTransport(250000);
        gajiPegawai.setUangTunjangan(300000);
        gajiPegawai.setGajiPokok(4500000);
        gajiPegawai.setTotalGaji(5050000);
        
        // Output program
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan\t: " +gajiPegawai.getNama());
        System.out.println("Alamat\t\t: " +gajiPegawai.getAlamat());
        System.out.println("Uang Transport\t: Rp " +gajiPegawai.getUangTransport());
        System.out.println("Uang Tunjangan\t: Rp " +gajiPegawai.getUangTunjangan());
        System.out.println("Gaji Pokok\t: Rp " +gajiPegawai.getGajiPokok());
        System.out.println("TOTAL GAJI\t: Rp " +gajiPegawai.getTotalGaji());
        
        
    }
    
}
