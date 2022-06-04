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
public class restoPesan10 {
    pesanan10 head;
    int size;
    
    public restoPesan10(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void bubbleSortPesanan(){
        pesanan10 current = null, index = null;
        int tmp;
        String temp;
        if(isEmpty()){
            return;
        } else {
            for(current = head; current.next != null; current = current.next){
                 for(index = current.next; index != null; index = index.next) {
                     if(current.namaPesanan.equalsIgnoreCase(index.namaPesanan)) {  
                        tmp = current.kodePesanan;  
                        current.kodePesanan = index.kodePesanan;  
                        index.kodePesanan = tmp;
                        temp = current.namaPesanan;
                        current.namaPesanan = index.namaPesanan;
                        index.namaPesanan = temp;
                        tmp = current.harga;
                        current.harga = index.harga;
                        index.harga = tmp;
                     }
                 }
            }
        }
    }
}
