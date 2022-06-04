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
public class restoBeli10 {
    pembeli10 head;
    int size;
    
    public restoBeli10(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int no, String namaPembeli, String noHP){
        if(isEmpty()){
            head = new pembeli10(null, no, namaPembeli, noHP, null);
        } else {
            pembeli10 newNode = new pembeli10(null, no, namaPembeli, noHP, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int no, String namaPembeli, String noHP){
        if(isEmpty()){
            addFirst(no, namaPembeli, noHP);
        } else {
            pembeli10 current = head;
            while(current.next != null){
                current = current.next;
            }
            pembeli10 newNode = new pembeli10(current, no, namaPembeli, noHP, null);
            current.next = newNode;
            size++;
        }
    }
     
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            pembeli10 tmp = head;
            System.out.println("===================");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("===================");
            System.out.println("|No\t|Nama Pembeli\t|No HP\t|");
            while (tmp != null){
                System.out.print("|" + tmp.no + "\t|"+ tmp.namaPembeli + "\t|" + tmp.noHP + "\t|");
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
    
    public void removeFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Antrian masih kosong, tidak dapat dihapus");
        }else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list film masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        } 
        pembeli10 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
           
    public void bubbleSortPembeli(){
        pembeli10 current = null, index = null;
        int tmp;
        String temp;
        if(isEmpty()){
            return;
        } else {
            for(current = head; current.next != null; current = current.next){
                 for(index = current.next; index != null; index = index.next) {
                     if(current.no < index.no) {  
                        tmp = current.no;  
                        current.no = index.no;  
                        index.no = tmp;
                        temp = current.namaPembeli;
                        current.namaPembeli = index.namaPembeli;
                        index.namaPembeli = temp;
                        temp = current.noHP;
                        current.noHP = index.noHP;
                        index.noHP = temp;
                     }
                 }
            }
        }
    }
    
}
