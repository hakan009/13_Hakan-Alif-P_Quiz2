/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2asd;

/**
 *
 * @author USER
 */
public class pesanan10 {
    int kodePesanan;
    int harga;
    String namaPesanan;
    pesanan10 next, prev;
    
    pesanan10(pesanan10 prev, int kodePesanan, int harga, String namaPesanan, pesanan10 next){
        this.next= next;
        this.prev = prev;
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }
}
