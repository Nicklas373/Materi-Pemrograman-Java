/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran_gaji;

// mengimpor Scanner ke program
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Pembayaran_gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat variabel
        String nama;
        int jhari_kerja, jjam_lembur;
        double uang_lembur, upah, gaji, trans_lembur, bagi_lembur, a = 10, b = 100;
        
       //membuat scanner
       Scanner i_user = new Scanner(System.in);
       
       //memulai proses input data
       System.out.println("Masukkan nama : ");
       nama = i_user.nextLine();
       System.out.println("Masukkan jam hari kerja: ");
       jhari_kerja = i_user.nextInt();
       System.out.println("Masukkan jam hari lembur: ");
       jjam_lembur = i_user.nextInt();
       
       //memulai proses hitung upah
       upah = jhari_kerja * 300000;
       
       //memulai proses hitung uang lembur
       uang_lembur = jjam_lembur * 5000;
       
       //memulai proses kondisi jam lembur
       if (jjam_lembur  > 10) {
           bagi_lembur = a/b;
           trans_lembur = bagi_lembur * uang_lembur;
       } else {
           trans_lembur = 0;
       }
       
       //memulai proses hitung gaji
       gaji = upah + uang_lembur + trans_lembur;
       
       //cetak gaji
       System.out.println("Nama anda : " + nama);
       System.out.println("Total gaji :" + "Rp." + gaji);
    }   
}