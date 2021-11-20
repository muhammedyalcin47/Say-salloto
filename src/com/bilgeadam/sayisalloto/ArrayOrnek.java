package com.bilgeadam.sayisalloto;

public class ArrayOrnek {

    public static void main(String[] args) {

        // arraylerin tipi olmak zorundadır.
        int sayılar[] = new int[6];

        // 6'lı oluşturduysak, array indeksleri 0'dan 5'e kadardır.

        sayılar[0] = 23;
        sayılar[1] = 11;
        sayılar[2] = -35;
        sayılar[3] = 46;
        sayılar[4] = 0;
        sayılar[5] = -29;

        // bu hata verir, 6 diye bir indeks yok.
        //sayılar[6] = 500;

        for (int i=0; i<6; i++)
        {

            System.out.println(sayılar[i]);
        }



    }

}
