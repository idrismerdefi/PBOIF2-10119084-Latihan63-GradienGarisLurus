/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan63.gradiengarislurus;
/**
NAMA : MUHAMMAD IDRIS MERDEFI
KELAS : PBOIF2
NIM : 10119084
DESKRIPSI PROGAM : PROGRAM INI BERISI PROGRAM gradien garis lurus
 */
public class PBOIF210119084Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat objKoordinat1=new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik "
                + "("+objKoordinat1.getX1()+","+objKoordinat1.getY1()+") dan "
                        + "("+objKoordinat1.getX2()+","+objKoordinat1.getY2()+")");
        System.out.println("memiliki gradien sebesar "+objKoordinat1.hitungGradien());
        
        Koordinat objKoordinat2=new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik "
                + "("+objKoordinat2.getX1()+","+objKoordinat2.getY1()+") dan "
                        + "("+objKoordinat2.getX2()+","+objKoordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar "+objKoordinat2.hitungGradien());
    }
    
}
