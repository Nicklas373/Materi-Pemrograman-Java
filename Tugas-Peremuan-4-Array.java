/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayapp;

/**
 *
 * @author FASILKOM
 */
public class ArrayAssignEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declares an array of integers
        int[]x;
        
        x = new int[4];
        
        x[0] = 10;
        x[1] = 11;
        x[2] = 12;
        x[3] = 13;
        
        System.out.println("Index 0: " + x[0]);
        System.out.println("Index 1: " + x[1]);
        System.out.println("Index 2: " + x[2]);
        System.out.println("Index 3: " + x[3]);
    }
    
}
