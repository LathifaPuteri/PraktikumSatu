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
public class Persegi {
    int s;
    double hasil;
    
    void hitung (){
        Scanner input = new Scanner(System.in);
        
    //user menginputkan jari jari lingkaran
        System.out.println("Masukkan panjang sisi persegi = ");
        s = input.nextInt();
        
    //rumus luas lingkaran
    hasil = (s)*(s);
        System.out.println("Hasil = "+hasil);
    }
}
