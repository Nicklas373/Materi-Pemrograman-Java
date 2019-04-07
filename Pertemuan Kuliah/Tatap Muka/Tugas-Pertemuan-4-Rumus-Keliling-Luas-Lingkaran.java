/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarijari;

import java.util.Scanner;
/**
 *
 * @author FASILKOM
 */
public class Jarijari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int input,r;
        Double Phi, kl, l;
        Phi = 3.14;
      
        Scanner i_user = new Scanner(System.in);
        
        System.out.println("Masukkan jari jari ");
        r = i_user.nextInt();
        System.out.println("Pilih luas atau keliling ?");
        System.out.println("1 = Luas, 2 = Keliling");
        input = i_user.nextInt();
        if(input == 1){
        l = Phi*(r*r);
        System.out.println("Luas = " + l);
        }else if (input == 2) {
        kl =2*Phi*r;
        System.out.println("Keliling = " + kl);
        } else {
            System.out.println("Invalid");
        }
      
    }
    
}
