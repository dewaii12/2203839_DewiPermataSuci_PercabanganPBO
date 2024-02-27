/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jam3;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class Jam3 {

    public static void main(String[] args) {
        Scanner jam = new Scanner(System.in);

        System.out.print("Jam mulai (jam menit): ");
        int jamMulai = jam.nextInt();
        int menitMulai = jam.nextInt();

        System.out.print("Jam keluar (jam menit): ");
        int jamKeluar = jam.nextInt();
        int menitKeluar = jam.nextInt();

        int selisihMenit = SelisihMenit(jamMulai, menitMulai, jamKeluar, menitKeluar);

        int lamaJam = selisihMenit / 60;
        int lamaMenit = selisihMenit % 60;

        System.out.println("Lama waktu (menit): " + selisihMenit + " Menit");
        System.out.println("Lama waktu (jam:menit): " + lamaJam + " jam " + (lamaMenit > 0 ? lamaMenit + " menit" : ""));
    }

    private static int SelisihMenit(int jamMulai, int menitMulai, int jamKeluar, int menitKeluar) {
        int totalMenitMulai = jamMulai * 60 + menitMulai;
        int totalMenitKeluar = jamKeluar * 60 + menitKeluar;
        return totalMenitKeluar - totalMenitMulai;
    }
}


