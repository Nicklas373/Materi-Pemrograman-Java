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
public class pernyataan_continue {
    public static void main(String[] args){
        
        /*deklarasi looping (for)
        int i = 0 || berarti deklarasi awal bahwa nilai i = 0, yang berarti proses looping dimulai dari 0 bukan 1
        i < 6 || berarti batas looping pada nilai i kurang dari 6
        i++ || berarti penambahan dilakukan pada integer i sebanyak 1x pada setiap looping (i++ = i = i+1)
        if(i==4) || berarti adanya kondisi tambahan dalam looping tersebut selain i<6 
        dalam bagian tersebut, jika kondisi terpenuhi maka akan mencetak teks dan akan mengeksekusi perintah continue;**/
        
        /*perintah continue digunakan untuk melewati proses looping yang sedang berlangsung dan melanjutkan ke proses looping selanjutnya
        tanpa mencetak atau memproses looping yang sedang berlangsung.
        dalam kondisi looping ini, looping akan mencetak sampai 4 (0,1,2,3) dan akan menjalankan eksekusi if
        pada eksekusi if ada eksekusi tambahan (i+1), nilai i pada saat kondisi tersebut adalah 4 + 1 = 5 (pada ekspresi penambahan if)
        maka nilai i akan berubah menjadi 5 dari 4, continue akan melewati looping nilai 4 dan akan meneruskan langsung ke nilai 5
        tanpa memproses looping sebelumnya**/
        
        for(int i=0;i<6;i++){
            if(i==4)
            {
                System.out.println("lompat ke looping :"+(i+1));
                continue;
            }
            System.out.println("looping ke : "+i);
        }
    }
}
