/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bil.ril1;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class BilRil1 {

    public static void main(String[] args) {
        Scanner ril = new Scanner(System.in);

        System.out.print("Bilangan ril: ");
        double bilRil = ril.nextDouble();

        
        int DepanKoma = (int) bilRil;
        int BelakangKoma = (int) ((bilRil - DepanKoma) * 100);

        
        if (DepanKoma % 3 == 0 && BelakangKoma % 3 == 0) {
            System.out.println("Angka di depan dan di belakang koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka di depan dan di belakang koma bukan kelipatan 3.");
        }
    }
}
