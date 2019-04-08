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
public class pernyataan_break {
    public static void main(String[] args){
        /*Materi jump  (pengendalian alur program ke bagian program lain
        Java mendukung beberapa jenis pengendalian seperti..
        1. break;
        2. continue;
        3. return; **/
        
        /*deklarasi looping (for)
        int i = 0 || berarti deklarasi awal bahwa nilai i = 0, yang berarti proses looping dimulai dari 0 bukan 1
        i < 6 || berarti batas looping pada nilai i kurang dari 6
        i++ || berarti penambahan dilakukan pada integer i sebanyak 1x pada setiap looping (i++ = i = i+1)
        if(i==3) || berarti adanya kondisi tambahan dalam looping tersebut selain i<6 
        dalam bagian tersebut, jika kondisi terpenuhi maka akan mencetak teks dan akan mengeksekusi perintah break;
        break || berarti suatu penghentian dari suatu proses eksekusi tertentu.**/
        
        for(int i=0;i<6;i++){
            if(i==3)
            {
                System.out.println("perulangan berhenti");
                break;
            }
            System.out.println("perulangan ke : "+i);
        }
    }
}
