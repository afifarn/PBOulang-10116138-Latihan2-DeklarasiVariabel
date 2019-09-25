/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeklarasiVariabel;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Memasukkan Nilai Atau Value 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiInt;
        final double phi= 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan Hasil
        System.out.println("");
        System.out.println("Isi Variabel Nilai = " + nilaiInt);
        System.out.println("Isi Variabel PHI = " + phi);
        System.out.println("Isi Variabel Logika = " + nilaiLogika);
        System.out.println("Isi Variabel Karakter = " + nilaiKarakter);

    }
    
}
