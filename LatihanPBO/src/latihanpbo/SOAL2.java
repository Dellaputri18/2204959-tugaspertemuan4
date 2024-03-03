/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpbo;

/**
 *
 * @author dellaputrw
 */
import java.util.Scanner;

public class SOAL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan batasAwal: ");
        int batasAwal = input.nextInt();
        
        System.out.print("Masukkan batasAkhir: ");
        int batasAkhir = input.nextInt();
        
        int count = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + count);
        
        input.close();
    }
}

