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
public class switch_case {
    public static void main(String[] args){
        //deklarasi komponen
        char arah='N';
        
        /*memulai perintah kondisional (Switch-Case)
        /Switch - Case hampir sama seperti if-else, terdapat perbedaan hanya dari struktur program yang ditulisnya saja.
        /Switch(arah) berarti "Arah" yang dijadikan kondisi atau pembanding, sama seperti 'if (N=X)'
        /Bedanya pembandingnya diletakkan pada case, tidak langsung 1 baris dalam switch atau "arah" itu sendiri.**/
        
        /*Case 
        /'N','W','S','E' dinyatakan sebagai pembanding dari pernyataan Switch(arah) yang berisi char 'N'
        /Jika Case benar, maka output akan keluar sesuai perbandingan.**/
        
        /*Break
        /Break digunakan untuk mengakhiri eksekusi dari perintah case, jika tidak diletakan fungsi break maka
        /program akan terus mengeksekusi perintah dibawahnya tanpa ada akhir ataupun terjadinya error pada logika switch.**/
        
        /*default
        /default digunakan sebagai pilihan terakhir atau sama seperti 'else' dalam nested if
        /default akan dicetak jika semua kondisi pada case tidak terpenuhi**/
        switch(arah)
        {
            case 'N':
                System.out.println("Arah Utara");
                break;
            case 'W':
                System.out.println("Arah Barat");
                break;
            case 'S':
                System.out.println("Arah Selatan");
            case 'E':
                System.out.println("Arah Timur");
            default:
                System.out.println("Arah yang anda masukkan salah");
        }
    }
}
