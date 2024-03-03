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

public class SOAL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Masukkan nilai n yang non-negatif!");
            return; 
        }
        
        int factorial = 1;
        String calculationProcess = n + "! = ";
        for (int i = n; i >= 1; i--) {
            factorial *= i;
            calculationProcess += i;
            if (i != 1) {
                calculationProcess += " * ";
            }
        }
        
        System.out.println(calculationProcess + " = " + factorial);
        
        input.close();
    }
}

