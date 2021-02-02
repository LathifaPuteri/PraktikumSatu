/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //object
    Lingkaran bulet = new Lingkaran();
    Persegi kotak = new Persegi();        
    
    //judul
        System.out.println("MARI BERHITUNG");
        
    //perulangan untuk inputan user
        Scanner input = new Scanner(System.in);
        String[]luas = {"Luas Lingkaran", "Luas Persegi"};
        for (int i = 0; i <luas.length; i++)
            System.out.println(i+". "+luas[i]);
        System.out.println("Silahkan masukkan nomor Luas yang ingin di hitung = ");
        int pilihan = input.nextInt();
        System.out.println("Perhitungan yang di pilih = "+luas[pilihan]);
       
    //percabangan switch case
        switch (pilihan){
        //pilihan 1
            case 0:
                System.out.println("============================================");
                System.out.println("Menghitung Luas Lingkaran");
                System.out.println("--------------------------------------------");
                bulet.hitung();
                break;
        //pilihan 2
            case 1:
                System.out.println("============================================");
                System.out.println("Menghitung Luas Persegi");
                System.out.println("--------------------------------------------");
                kotak.hitung();
                break;
    }    
        
    }
}