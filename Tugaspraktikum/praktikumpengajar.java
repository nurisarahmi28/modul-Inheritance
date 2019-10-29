/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaspraktikum;

import java.util.Scanner;

/**
 *
 * @author nuris
 */
public class praktikumpengajar{
    public static void main(String[]args){
        data Namapengajar1 = new data("bu Seno","Bahasa Inggris","perempuan","RPL/TKJ");
        data Namapengajar2 = new data("bu Rara","ppkn","perempuan","RPL/TKJ");
        data Namapengajar3 = new data("pak Arifin","Produktif","Laki-laki","RPL");
        data Namapengajar4 = new data("pak hafidz","Bahasa Indonesia","Laki-laki","RPL/TKJ");
        
        System.out.println("\n Silahkan pilih yang ingin anda ketahui informasinya:");
        System.out.println("1. Bu Seno\n2. Bu Rara\n3. Pak Arifin\n4. Pak Hafidz");
        Scanner cimay = new Scanner(System.in);
        int jawab = cimay.nextInt();
        switch (jawab){
            case 1:
                System.out.println("Data Namapengajar");
                Namapengajar1.info();
                break;
            case 2:
                System.out.println("Data Namapengajar");
                Namapengajar2.info();
                break;
            case 3:
                System.out.println("Data Namapengajar");
                Namapengajar3.info();
                break;
            case 4:
                System.out.println("Data Namapengajar");
                Namapengajar4.info();
        }
    }
}
    
   
        
    









    
    
   
    
    
        
    
    
    
     
    

