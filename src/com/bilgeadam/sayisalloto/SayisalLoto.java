package com.bilgeadam.sayisalloto;

import java.util.Random;

public class SayisalLoto {

    public int sayiGetir(int maxSayi) {
        Random rnd = new Random();
        return rnd.nextInt(maxSayi) + 1;

    }

    public static void main(String[] args) {
        SayisalLoto loto = new SayisalLoto();

        // 6'lı bir array oluşturduk.
        int sayılar[] = new int[6];

        //döngüyle array' dolduralım
        for (int i = 0; i < 6; i++) {
            sayılar[i] = loto.sayiGetir(49);
        }

        // array'ı yazdır.
        for (int i = 0; i < 6; i++) {
            System.out.println(sayılar[i]);
        }


    }
}
