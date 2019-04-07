/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_test;

/**
 *
 * @author Acer
 */
public class lingkaran {
    public static void main(String[] args){
        //Soal || tentukan luas dan keliling lingkaran yang berjari=jari 12cm
        
        //Deklarasi komponen
        int jari = 12;
        double luas, keliling;
        
        //Menghitung luas  dan keliling lingkaran
        luas = 3.14*jari*jari;
        keliling = 2*3.14*jari;
        System.out.println("Luas lingkaran = " +luas);
        System.out.println("Keliling lingkaran = " +keliling);
    }
}
