/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class ejaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String text;
        int i, panjang_text;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        text = input.next();
        panjang_text = text.length();
        String[] kata = text.split("");
        
        System.out.println("Ejaan Untuk " + text + " adalah ");
        
            for (i = 0; i < panjang_text; i++){
            System.out.println("Huruf ke- " + (i+1) + " : " +kata[i]);
    
            }
    }
    
}
