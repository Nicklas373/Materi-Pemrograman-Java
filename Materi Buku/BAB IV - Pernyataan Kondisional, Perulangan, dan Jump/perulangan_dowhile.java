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
public class perulangan_dowhile {
    public static void main(String[] args){
        //deklarasi komponen
        int i = 0;
        
        /*do || berfungsi sebagai awal mulainya kondisi looping dengan while sebagai kondisi penyelesaian looping
        i++ || berarti penambahan dilakukan pada integer i sebanyak 1x pada setiap looping (i++ = i = i+1)
        while (i<6) || berarti jika kondisi i < 6 maka proses looping akan dilanjutkan 
        sampai kondisi i benar - benar mendekati nilai 6.**/
        
        /*Looping do while memiliki alur kerja yang hampir sama dengan looping while pada umumnya
        hanya saja terdapat perbedaan pada alur awal yang dimulai dengan do
        dan parameter akhirnya dengan while sebagai kondisi yang harus terpenuhi untuk menyelesaikan looping**/
        
        do
        {
            System.out.println("perulangan do-while");
            i++;
        }  while(i<6);
        }
    }