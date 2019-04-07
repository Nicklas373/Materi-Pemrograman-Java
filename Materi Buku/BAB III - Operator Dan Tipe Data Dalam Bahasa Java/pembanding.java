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
public class pembanding {
     public static void main(String[] args) {
         int j=10;
         int k=12;
         if(j<=k) //Operator "<=" Menunjukkan kurang dari sama dengan atau lebih kecil 
             System.out.println("Benar, nilai j lebih kecil atau sama dengan nilai K");
         else if (j!=k) //Operator "!=" Menunjukkan tidak sama dengan 
             System.out.println("Benar, nilai j tidak sama dengan nilai K");
         else if (j==k) //Operator "==" Menunjukkan sama dengan
             System.out.println("Salah, nilai j sama dengan nilai K");
         else if (j>=k) //Operator ">=" Menunjukkan lebih besar atau lebih dari sama dengan
             System.out.println("Salah, nilai j lebih besar atau sama dengan nilai K");
         else 
             System.out.println("Upsss, error :p");
     }
}
