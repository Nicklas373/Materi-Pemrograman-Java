/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitigapiramida;

import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Segitigapiramida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Deklarasi scanner
           1. Scanner untuk cetak nilai 
           2. Scanner untuk tinggi segitiga
           Masing - masing memiliki tipe data integer**/
        
        Scanner i_user = new Scanner (System.in);
        System.out.println("Masukkan nilai yang ingin dicetak : ");
        int ns = i_user.nextInt();
        Scanner i_nilai = new Scanner (System.in);
        System.out.println("Masukkan tinggi segitiga : ");
        int ts = i_nilai.nextInt();
        
        for(int i=1; i<=ts; i++) {
            /*Memulai proses looping
             1. Menghitung Jumlah tinggi segitiga **/
            for(int j=ts; j>i; j--) {
                System.out.print(" ");
            }
                for(int k=1; k<=i; k++) {
                    /*1. Menghitung jumlah output per baris
                      2. Mencetak output berupa nilai input user **/
                    System.out.print(ns + " ");
                }
                    System.out.println(); //Membuat baris baru
                }
           System.out.println(); //Membuat baris baru
        }
}