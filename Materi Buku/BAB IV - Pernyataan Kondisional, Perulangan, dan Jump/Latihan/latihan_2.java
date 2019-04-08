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

//PR nanti, belum paham -_-

public class latihan_2 {
    static int hasil(int n, int p)
    {
        if(p==0)
            return 1;
        else
            return n*hasil(n, p-1);
    }
    
    public static void main(String[] args)
    {
        int ni = 5;
        int pa = 3;
        
        System.out.println("hasil dari "+ni+" pangkat "+pa+" adalah :" +hasil(ni,pa));
    }
}
