/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.pkgswitch.pkgcase;

/**
 * Nama : ANANDA FRIZKY MAULANA 
 * NIM  : A2.1900016
 * Kelas: TI-1C
 */
import java.util.*;
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // switch case
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");
    }
}
