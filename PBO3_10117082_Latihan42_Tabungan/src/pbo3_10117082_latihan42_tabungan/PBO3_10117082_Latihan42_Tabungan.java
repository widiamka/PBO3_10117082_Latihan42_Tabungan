/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan42_tabungan;

import java.util.Scanner;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* pengurangan saldo sesuai yang diinginkan dengan inputan user
 */
public class PBO3_10117082_Latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;
        int saldo;

        System.out.println("====PROGRAM PENARIKAN UANG====");
        Scanner saldo1 = new Scanner(System.in);
        Scanner saldo2 = new Scanner(System.in);
        Tabungan tab = new Tabungan();

        System.out.print("Masukkan Saldo Awal : Rp. ");
        saldo = saldo1.nextInt();
        System.out.print("Jumlah uang yang diambil : Rp. ");
        jumlah = saldo2.nextInt();
        System.out.println("Saldo Anda Sekarang : Rp. " + tab.ambilUang
        (saldo-jumlah)
        );
    }
    
}
