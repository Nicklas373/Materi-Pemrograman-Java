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
public class pernyataan_return {
    public static void main(String[] args){
        //deklarasi komponen
        int sisi=5;
        System.out.println("luas volume kubus dengan sisi "+sisi+" adalah :"+kubus(sisi));
    }
    
    //deklarasi fungsi kubus yang memiliki tipe data integer
    static int kubus(int i)
    {
        //deklarasi komponen dan kalkulasi volume
        //nilai i didapat dari nilai sisi = 5, diambil dari proses kalkulasi pada fungsi "kubus(sisi)" yang berarti
        //fungsi kubus adalah volume=i*i*i dan (sisi) dimana sisi memiliki nilai 5 dan menggantikan nilai i dalam bentuk integer
        int volume=i*i*i;
        
        //deklarasi return memiliki fungsi untuk mengembalikan nilai dari volume kedalam fungsi (kubus) untuk ditampilkan kembali
        //pada fungsi main, return volume mengembalikan nilai penuh setelah terjadinya kalkulasi pada deklarasi volume.
        return volume;
    }
}
