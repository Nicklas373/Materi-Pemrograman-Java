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
public class char_boolean {
    public static void main(String[] args) {
        //Tipe data boolean dan char
        //Char || panjang 16 bit Unicode || Nilai ('a','b','c' ....)
        //Boolean || panjang 1 bit || Nilai (true atau false)
        
        boolean hasil=true;
        char huruf='A';
        
        if (hasil)
                System.out.println("Benar, variabel boolean hasil bernilai true");
        else 
            System.out.println("variabel boolean hasil bernilai False");
        
        System.out.println("isi dari variabel char huruf : " +huruf);
    }
}
