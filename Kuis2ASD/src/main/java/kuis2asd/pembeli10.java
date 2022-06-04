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
public class pembeli10 {
    int no;
    String namaPembeli;
    String noHP;
    pembeli10 prev, next;
    
    pembeli10(pembeli10 prev, int no, String namaPembeli, String noHP, pembeli10 next){
        this.prev = prev;
        this.next = next;
        this.no = no;
        this.noHP = noHP;
        this.namaPembeli = namaPembeli;
    }
}
