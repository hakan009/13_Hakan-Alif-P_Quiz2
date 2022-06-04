/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2asd;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class restoMain10 {
     public static void menu(){
        System.out.println("====================");
        System.out.println("Menu");
        System.out.println("====================");
        System.out.println("1. Tambah antrian");
        System.out.println("2. Cetak antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan nama");
        System.out.println("5. Total Pendapatan");
        System.out.println("6. Keluar");
        System.out.println("====================");
     }
     
     public static void main(String[] args) throws Exception {
        Scanner hakan = new Scanner(System.in);
        Scanner alif = new Scanner(System.in);
        int pilihMenu, indeks;
        String cari;
        String nama = "Hakan Alif Pramudya";
        String nim = "2141720218";
        String absen = "13";
        
        restoBeli10 b= new restoBeli10();
        restoPesan10 p = new restoPesan10();
        
         System.out.println("Dibuat oleh: " + nama);
         System.out.println("NIM: " + nim);
         System.out.println("Absen: " + absen);
        
        do{
         menu();
            pilihMenu = hakan.nextInt();
            System.out.println("===================");
            try{
                switch(pilihMenu){
                    case 1:   
                        System.out.println("===============");
                        System.out.println("No antri: ");
                        int no = hakan.nextInt();
                        System.out.print("Nama Customer: ");
                        String namaPembeli = alif.nextLine();
                        System.out.print("No HP: ");
                        String noHP = alif.nextLine();
                        b.addLast(no, namaPembeli, noHP);
                        System.out.println("===========");
                        break;
                    
                    case 2:
                        b.print();
                        break;
                        
                    case 3:
                        b.removeFirst();
                        break;
                        
                    case 6:
                        System.exit(0);
                        break;
                        
                }
            }catch(Exception E){
                
            }
            
        }while(pilihMenu <= 6 || pilihMenu >= 1);
}
}
