/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg38.recursive.bercabang;

import java.util.Scanner;

/**
 *Nama : ANANDA FRIZKY MAULANA 
 * NIM  : A2.1900016
 * Kelas: TI-1C
 */
public class RecursiveBercabang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan nilai n = ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke-"+ nilai +" adalah " + nilai_fibonacci);
    }


    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("Fibonacci ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
        }
    }
}
