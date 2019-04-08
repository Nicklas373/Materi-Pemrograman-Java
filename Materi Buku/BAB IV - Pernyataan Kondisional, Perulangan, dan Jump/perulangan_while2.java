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
public class perulangan_while2 {
    public static void main(String[] args){
        
        //deklarasi komponen
        boolean hasil=false;
        int i = 0;
        
        /*while (!hasil) || berarti jika nilai hasil tidak sama dengan nilai kondisi awal 
        yang bernilai false maka proses looping akan selesai.
        if(i==5) || berarti menjelaskan kondisi tambahan dalam looping, jika nilai i = 5 maka proses looping selesai.
        hasil = true || berarti menjelaskan bahwa jika kondisi if diatas sudah terpenuhi 
        maka nilai hasil akan berubah menjadi true
        i++ berarti penambahan dilakukan pada integer i sebanyak 1x pada setiap looping (i++ = i = i+1)**/
        
        /*Statement while disini memiliki 2 kondisi, dimana ada nilai hasil dan nilai i.
        Statement pertama jika nilai hasil tidak sama dengan nilai deklarasi awal dari nilai hasil, maka looping selesai
        Statement kedua jika nilai i = 5 maka akan mengubah nilai hasil menjadi true dan akan memberhentinkan proses looping
        Nilai i akan terus bertambah sampai kondisi terpenuhi dengan penambahan i++. **/
        while(!hasil)
        {
            if(i==5)
                hasil=true;
            System.out.println("while dengan boolean");
            
            i++;
        }
    }
}
