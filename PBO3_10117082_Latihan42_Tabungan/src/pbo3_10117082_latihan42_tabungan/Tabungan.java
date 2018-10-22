/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan42_tabungan;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* pengurangan saldo sesuai yang diinginkan dengan inputan user
 */
public class Tabungan {
    private int saldo;
    
public Tabungan(){
    
}

    public int Tabungan(int saldo){
     return   this.saldo = saldo;
        
       
    }
 public int ambilUang(int jumlah){
        return jumlah-saldo;
        
        
    }
}
