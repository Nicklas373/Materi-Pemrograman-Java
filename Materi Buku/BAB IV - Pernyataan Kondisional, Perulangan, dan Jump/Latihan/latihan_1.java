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

 /*Soal Latihan
 Dimisalkan ada 3 buah tongkat dengan panjang yang berbeda. Buatlah sebuah program yang menyatakan bahwa ketiga tongkat
 itu bisa atau tidak bisa membentuk sebuah segitiga dengan aturan berikut:
 1. Apabila terdapat 1 tongkat yang memiliki panjang lebih dari jumlah panjang 2 tongkat yang lain, segitiga tidak dapat dibentuk
 (Petunjuk: gunakan pernyataan kondisional, dan bat method yang memiliki 3 parameter input)**/

public class latihan_1 {
    
    //memulai fungsi boolean dengan 3 deklarasi integer (p,l,t)
    //kondisi pertama jika nilai p lebih dari nilai l+t maka kondisi boolean dikembalikan dalam kondisi salah
    //kondisi kedua jika nilai l lebih dari nilai p+t maka kondisi boolean dikembalikan dalam kondisi salah
    //kondisi ketiga jika nilai t lebih dari nilai l+p maka kondisi boolean dikembalikan dalam kondisi salah
    
    static boolean segitiga (int p, int l, int t)
    {
        if(p>(l+t))
            return false;
        else if (l>(p+t))
                return false;
        else if (t>(p+l))
                return false;
        else
            return true;
    }
    
    //deklarasi fungsi main
    public static void main(String[] args){
        //deklarasi komponen
        int s1=10;
        int s2=3;
        int s3=5;
        
        //deklarasi boolean hasil untuk fungsi segitiga, dimana nilai s1,s2,s3 akan menggantikan nilai p,l,t di fungsi segitiga
        //proses berlanjut di fungsi segitiga, disini nilai p = 10, l = 3 dan t = 5 setelah mendapat nilai dari fungsi main.
        //Jika nilai p lebih dari nilai t+l maka kondisi boolean dikembalikan dalam kondisi salah
        //Jika nilai l lebih dari nilai p+t maka kondisi boolean dikembalikan dalam kondisi salah
        //Jika nilai t lebih dari nilai p+l maka kondisi boolean dikembalikan dalam kondisi salah
        //Selain dari itu maka kondisi boolean dikembalikan dalam kondisi benar
        
        //pada kondisi ini, nilai boolean dikembalikan dalam kondisi salah karena
        //nilai kalkulasi dari salah satu nilai tersebut memiliki hasil yang lebih besar dari kedua nilai yang ada.
        // (p>(l+t)) = 10>(3+5) = 10 > 8 || maka kondisi salah
        // (l>(p+t)) = 3>(10+5) = 3 > 15 || maka kondisi salah
        // (t>(p+l)) = 5>(10+3) = 5 + 13 || maka kondisi salah
        //Dari nilai pada s1,s2,s3 yang berlaku, semuanya berakhir pada kondisi salah sehingga nilai dari boolean hasil adalah false
        
        boolean hasil=segitiga(s1,s2,s3);
        
        //karena nilai dari hasil = false, maka pada kondisi if(hasil) yang berarti hasil = true
        //maka kondisi if tidak terpenuhi karena hasil != nilai hasil segitiga
        if(hasil)
            System.out.println("segitiga dapat terbentuk");
        else
            System.out.println("segitiga tidak dapat terbentuk");
    }
}
