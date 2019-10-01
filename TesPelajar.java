/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageAsistensi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TesPelajar {
    public static void main (String []args){ 
       
        Pelajar p1 = new Pelajar();
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama\t\t:");
        p1.setNama(input.nextLine());
        
        System.out.print("Masukkan Nip\t\t:");
        p1.setNip (input.nextLine());
        
        System.out.print("Masukkan Nilai Ujian 1\t:");
        p1.setNilaiUjian1(input.nextDouble());
        
        System.out.print("Masukkan Nilai Ujian 2\t:");
        p1.setNilaiUjian2(input.nextDouble());
        
        System.out.print("Masukkan Nilai Tugas\t:");
        p1.setNilaiTugas(input.nextDouble());
        
        System.out.println("=================================================");
        
        System.out.println("DATA PELAJAR");
        System.out.println();
       
        p1.infoStatus();
               
}}