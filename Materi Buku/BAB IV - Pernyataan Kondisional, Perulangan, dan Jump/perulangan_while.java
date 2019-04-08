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
public class perulangan_while {
    public static void main(String[] args){
        /*inisialiasi perulangan while
        while (batas perulangan)
        {
         statement
         Ekspresi penambahan (i++ / i--)
        }**/
        
        //deklarasi komponen
        int i = 6;
        
        /*while (i>0) || berarti jika kondisi i lebih dari 0 atau pernyataan dalam kondisi benar maka
        looping akan terus berlangsung, jumlah looping bergantung pada nilai i jika pernyataan dalam kondisi benar
        i-- ||  berarti penambahan dilakukan pada integer i sebanyak 1x pada setiap looping (i-- = i = i-1)**/
        while(i>0)
        {
            System.out.println("Algorithm is not too difficult");
            i--;
        }
    }
}
