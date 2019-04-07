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
public class Latihan_bangun_ruang {
    public static void main(String[] args){
        //Soal || Buatlah sebuah program untuk menghitung luas bangun ruang balok dan kubus
        
        //Deklarasi komponen
        int sisi, panjang, lebar, tinggi;
        double luas;
        
        sisi = 5;
        panjang = 4;
        lebar = 2;
        tinggi = 9;
        
        //Menghitung luas balok
        luas = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        System.out.println("Luas balok adalah = " +luas);
        
        //Menghitung luas kubus
        luas = 6*sisi*sisi;
        System.out.println("Luas kubus adalah = " +luas);
    }
}
