/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19.latihan.operator.logika;

/**
 * Nama : ANANDA FRIZKY MAULANA
 * NIM  : A2.1900016
 * Kelas: TI-1C
 */
import java.util.*;
public class LatihanOperatorLogika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("masukan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)

        System.out.print("masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */

        System.out.println("tebakan anda: " + statusTebakan);
    }
}