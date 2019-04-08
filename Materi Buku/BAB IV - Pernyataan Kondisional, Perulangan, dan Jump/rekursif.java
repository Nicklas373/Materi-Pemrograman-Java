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
public class rekursif {
    public static void main(String[] args){
    //deklarasi komponen
    int a = 5;
    
    System.out.println("nilai faktorial dari "+a+" Adalah : "+factorial(a));
    }
    
    /*memulai proses perulangan rekursif
    static int factorial(int n) || memasukkan sub program dalam kelas rekursif yang dapat di eksekusi pada sub program lainnya.
    proses factorial pada rekursif ini memiliki proses yang hampir sama dengan looping pada umumnya,
    namun sedikit lebih rumit karena alur kerja rekursifnya.**/
    
    /*Alur rekursif dimulai dari kondisi if(n==0) yang memiliki fungsi sebagai kondisi akhir looping, 
    jika kondisi terpenuhi maka proses looping berhenti.
    method factorial pun dimulai, disini nilai n adalah 4 (diambil dari nilai a), karena nilai n != 0 maka looping berlanjut.
    dengan ekpresi looping (n-1), jadi looping selanjutnya nilai dari n adalah 3.
    hal ini berlanjut sampai kondisi nilai n bernilai 0 dan looping pun akan berakhir.
    pada saat kondisi terpenuhi nilai n akan berubah menjadi 1 setelah 0, karena adanya kode return 1
    yang berfungsi untuk mengembalikan semua value menjadi 1.
    proses factorial pun dimulai dan akan memanggil semua nilai n untuk dikalikan sebanyak proses looping terjadi.
    n = 1*1*2*3*4 = 24 (semua nilai looping pada n akan disimpan pada setiap proses looping berlangsung), setiap nilai diambil
    berdasarkan hasil akhir dari setiap akhir ekspresi pengurangan (n-1)**/
    static int factorial(int n) {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}