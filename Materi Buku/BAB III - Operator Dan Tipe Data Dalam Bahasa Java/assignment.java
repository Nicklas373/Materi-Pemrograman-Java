/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_test;

/**
 *
 * @author Acer
 */
public class assignment {
    public static void main(String[] args) {
        int j,p,q,r,s,t;
        j=4;
        p=1;q=2;r=3;s=4;t=5;
        //assignment atau pemberian nilai peubah
        p+=j; //operator "+=" sama seperti x = x + y / p = p + j
        q-=j; //operator "-=" sama seperti x = x - y / q = q - j
        r*=j; //operator "*=" sama seperti x = x * y / r = r * j
        s/=j; //operator "/=" sama seperti x = x / y atau s = s / j
        t%=j; //operator "%=" sama seperti x = x % y / t = t % j
        System.out.println("p =" +p);
        System.out.println("q =" +q);
        System.out.println("r =" +r);
        System.out.println("s =" +s);
        System.out.println("t =" +t);
    }
}
