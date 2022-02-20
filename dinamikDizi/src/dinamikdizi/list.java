/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamikdizi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class list {

    Scanner scn = new Scanner(System.in);
    Random rnd = new Random();
    int[] dizi = new int[10];
    int boyut = dizi.length;
    int sayac = dizi.length;

    public void elemanAta() {

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(50);

        }

    }

    public void elemanSil() {

        System.out.println("hangi indis silinsin?");
        int indis = scn.nextInt();
        dizi[indis] = 0;
    }

    public void elemanEkle() {
        sayac++;        
        System.out.println("hangi indise eklensin?");
        int indis1 = scn.nextInt();
        System.out.println("hangi sayi eklensin?");
        int sayi1 = scn.nextInt();
        while (sayac >= boyut || indis1 > boyut) {
            boyut = boyut * 2;
        }
          int[] dizi1 = new int[boyut];
         if (indis1>dizi.length) {
           for (int i = 0; i < dizi.length; i++) {
            dizi1[i] = dizi[i];
        } 
           dizi1[indis1] = sayi1;
        }else{
        for (int i = 0; i < indis1; i++) {
            dizi1[i] = dizi[i];
        }
        dizi1[indis1] = sayi1;

        for (int j = indis1+1; j < dizi.length; j++) {
            dizi1[j] = dizi[j-1];

        }
         }
        dizi = dizi1;

    }

}
