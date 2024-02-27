/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aritmatika2;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;
public class Aritmatika2 {

    public static void main(String[] args) {
        Scanner aritmatika = new Scanner(System.in);
        
        System.out.print("Bilangan pertama: ");
        int bil1 = aritmatika.nextInt();
        System.out.print("Bilangan kedua: ");
        int bil2 = aritmatika.nextInt();
         System.out.print("Operator aritmatika yang diinginkan (+, -, *, /, %): ");
        char tanda = aritmatika.next().charAt(0);
        
        int hasil = 0;

        switch (tanda) {
            case '+':
                hasil = bil1 + bil2;
                System.out.println("Hasil penjumlahan " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                break;
            case '-':
                hasil = bil1 - bil2;
                System.out.println("Hasil pengurangan " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                break;
            case '*':
                hasil = bil1 * bil2;
                System.out.println("Hasil perkalian " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                break;
            case '/':
                if (bil2 != 0) {
                    hasil = bil1 / bil2;
                    System.out.println("Hasil pembagian " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                } else {
                    System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
                }
                break;
            case '%':
                if (bil2 != 0) {
                    hasil = bil1 % bil2;
                    System.out.println("Hasil modulus " + bil1 + " dan " + bil2 + " adalah : " + hasil);
                } else {
                    System.out.println("Error: Modulus dengan nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Error: Operator aritmatika tidak valid.");
        }
    }
}
