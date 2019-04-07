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
public class bill_bulat_floating {
    public static void main(String[] args) {
        //Tipe data  bilangan bulat
        //Byte || panjang 8 bit || nilai minimum -128 || nilai maksimum 127
        //Short || panjang 16 bit || nlai minimum -32768 || nilai maksimum 32767
        //Int || panjang 32 bit || nilai minimum -2147483648 || nilai maksimum 2147483647
        //Long || panjang 64 bit || nilai minimum -9.22337E+18 || nilai maksimum 9.22337E+18
        
        //Tipe data bilangan floating point (desimal)
        //Float || panjang 4 byte || Nilai minimum -3.40E+38 || Nilai maksimum 3.40E+38
        //Double || panjang 8 byte || Nilai minimum -1.7e308 || Nilai minimum 1.7e308
        
        byte a=3;
        short b=5;
        
        //penjumlahan tipe data yang berbeda
        int c=a+b;
        
        //penggunaan tipe data floating point
        double d=5*3.14;
        float e=5/2;
        
        //cetak hasil operasi
        System.out.println("nilai int c = " +c);
        System.out.println("nilai double d = " +d);
        System.out.println("nilai float e = " +e);
    }
}
