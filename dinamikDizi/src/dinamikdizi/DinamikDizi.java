/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamikdizi;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DinamikDizi {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        list liste = new list();
        liste.elemanAta();
        System.out.println("Hoşgeldiniz..");

        for (int i = 0; i < liste.sayac; i++) {
            System.out.println(i + " . Eleman : " + liste.dizi[i]);
        }
        for (;;) {
            System.out.println("");
            System.out.println("--------------------- ");
            System.out.println("eleman eklemek için 1'e ,elaman silmek için 2'ye basın");

            int secim = scn.nextInt();

            if (secim == 1) {
                liste.elemanEkle();
                for (int i = 0; i < liste.dizi.length; i++) {
                    System.out.println(i + " . Eleman : " + liste.dizi[i]);
                }
            } else if (secim == 2) {
                liste.elemanSil();
                for (int i = 0; i < liste.sayac; i++) {
                    System.out.println(i + " . Eleman : " + liste.dizi[i]);
                }
            } else {
                return;
            }
        }

    }
}
