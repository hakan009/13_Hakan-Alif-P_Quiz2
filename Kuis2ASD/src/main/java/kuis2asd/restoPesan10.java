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
    
    public void addFirstPesan(int kodePesanan, String namaPesanan, int harga){
        if(isEmpty()){
            head = new pesanan10(null,  kodePesanan,  namaPesanan, harga, null);
        } else {
            pesanan10 newNode = new pesanan10(null, kodePesanan,  namaPesanan, harga, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLastPesan(int kodePesanan, String namaPesanan, int harga){
        if(isEmpty()){
            addFirstPesan(kodePesanan,  namaPesanan, harga);
        } else {
            pesanan10 current = head;
            while(current.next != null){
                current = current.next;
            }
            pesanan10 newNode = new pesanan10(current, kodePesanan,  namaPesanan, harga, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void print(){
        if(!isEmpty()){
            pesanan10 tmp = head;
            System.out.println("===================");
            System.out.println("Daftar Pemesanan");
            System.out.println("===================");
            System.out.println("|No\t|Nama Pembeli\t|No HP\t|");
            while (tmp != null){
                System.out.print("|" + tmp.kodePesanan + "\t|"+ tmp.namaPesanan + "\t|" + tmp.harga + "\t|");
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println();
            System.out.println("Total antrian: " + size);
            System.out.println();
        } else {
            System.out.println("Antrian kosong");
        }
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
