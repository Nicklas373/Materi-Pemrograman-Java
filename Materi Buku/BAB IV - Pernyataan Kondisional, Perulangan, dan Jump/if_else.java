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
public class if_else {
    public static void main(String[] args){
        //deklarasi komponen
        double IPK=3.8;
        
        //memulai perintah kondisional
        //jika nilai IPK lebih dari sama dengan 3.75 maka cetak "Anda lulus dengan predikat cumlaude"
        //jika tidak maka cetak "Anda lulus, namun tidak mendapat predikat cumlaude"
        if(IPK>=3.75)
            System.out.println("Anda lulus dengan predikat cumlaude");
        else
            System.out.println("Anda lulus, namun tidak mendapat predikat cumlaude");
    }
}
