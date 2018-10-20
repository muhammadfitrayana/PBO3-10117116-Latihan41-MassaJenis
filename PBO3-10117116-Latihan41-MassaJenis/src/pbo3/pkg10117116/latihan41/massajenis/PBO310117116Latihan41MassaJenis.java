/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Menentukan Massa Jenis
 *  
 */
public class PBO310117116Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
       
       
        
        
       Kubus kubus = new Kubus();
       kubus.setSisi(5);
       kubus.setMassa(250);
       
       
       
        System.out.println("=====MASSA JENIS KUBUS=====");
        System.out.println("Sisi  : " + kubus.getSisi());
        System.out.println("Massa : " + kubus.getMassa());
        System.out.println("");
        System.out.println("=====HASIL PEHITUNGAN=====");
        System.out.println("Volume : " + kubus.hitungVolume(0));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis
                           (kubus.getMassa(),kubus.hitungVolume(0)));
     
       
        
    }
    
}
