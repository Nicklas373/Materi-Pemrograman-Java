/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author Acer
 */
public class nested_if {
    public static void main(String[] args){
        //deklarasi komponen
        char nilai='B';
        
        /*memulai perintah kondisional
        jika nilai = A maka cetak teks "Nilai anda istimewa"
        jika nilai = B maka cetak teks "Nilai anda sangat memuaskan"
        Begitu pula selanjutnya
        Disini jika If pertama tidak memenuhi kondisi, maka akan pindah ke kondisi selanjutnya
        Karena adanya else if (nested if) sebagai lanjutnya dari kondisional pertama**/
        if(nilai=='A')
            System.out.println("Nilai anda istimewa");
        else if(nilai=='B')
            System.out.println("Nilai anda sangat memuaskan");
        else if(nilai=='C')
            System.out.println("Nilai anda cukup");
        else if(nilai=='D')
            System.out.println("Nilai anda kurang");
        else if(nilai=='E')
            System.out.println("Anda tidak lulus");
        else
            System.out.println("Maaf, anda memasukkan nilai yg salah");
    }
}
