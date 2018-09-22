/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan5.kambingglobal;

/**
 *
 * @author lenovo
 * 
 * NAMA  : BONAVENTURA ALDINO SENDA SENI
 * KELAS : PBO-3
 * NIM   : 10117122
 * 
 */
public class PBO310117122Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    // Variabel jumlahkambing menjadi variabel instance
    
     int jumlahKambing = 88;
     
     // Method untuk menampilkan jumlah kambing
     public void getJumlahKambing(){
         System.out.println("Jumlah kambing: " + jumlahKambing);
     }
     
     public void tambahKambing(){
         jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
     }
     
    public static void main(String[] args) {
         PBO310117122Latihan5KambingGlobal kambingSusu;
         kambingSusu = new PBO310117122Latihan5KambingGlobal();
        
       // Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
       // Menambah satu kambing
        kambingSusu.tambahKambing();
        
       //Menampilkan jumlah kambing yang ada 
        kambingSusu.getJumlahKambing();
    }
}
