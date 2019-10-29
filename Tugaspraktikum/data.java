/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaspraktikum;

/**
 *
 * @author nuris
 */
public class data extends Namapengajar {

    String Namapengajar;

    public data(String Namapengajar,String mapel, String kelas, String jeniskelamin) {
        super(mapel, kelas, jeniskelamin);
        this.Namapengajar = Namapengajar;
    }
    public void info(){
        System.out.println("Nama pengajar : "+this.Namapengajar);
        super.info();
    }
}


    
    

