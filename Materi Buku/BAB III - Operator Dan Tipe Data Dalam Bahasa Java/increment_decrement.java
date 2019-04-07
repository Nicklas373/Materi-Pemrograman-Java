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
public class increment_decrement {
    public static void main(String[] args) {
         int j,k,p,q,r,s,t;
    j=5;
    k=3;
    
    // operasi aritmetika
    // operator ++x atau x++ = x+1
    // operator --x atau x-- = x-1
    p=++j;
    q=j++;
    r=++j;
    s=k--; 
    t=--k;
    System.out.println("p =" +p);
    System.out.println("q =" +q);
    System.out.println("r =" +r);
    System.out.println("s =" +s);
    System.out.println("t =" +t);
    }
}
