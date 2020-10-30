/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil ejaan nama
 */

public class PBOIF210119044Latihan25EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        
        System.out.print("Masukkan nama depan anda untuk dieja : ");
        nama = input.next();
        System.out.println();
        System.out.println("Ejaan untuk "+"\""+nama+"\"" +" adalah :");
        for (int i=0; i<nama.length(); i++){
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
        
    }
    
}
