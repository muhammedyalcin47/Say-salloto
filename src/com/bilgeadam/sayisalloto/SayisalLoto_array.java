package com.bilgeadam.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_array {

    // static değişkene,obje oluşturmadan
    // Class_adı.değişken diye erişebiliyoruz.
    private static final int MAX_SAYI = 90;
    private static final int KAC_SAYI = 6;


    Random rnd = new Random();


    public int sayıGetir() {
        // nextInt(90) metodu 0-89 arası üretilir.
        // 1'den başlasın diye 1 ekliyoruz.
        return rnd.nextInt(MAX_SAYI) + 1;
    }

    public boolean arraydeVarmi(int[] sayilar, int sayi) {
        // binarySearch ile arayacağız.
        // binarySearch kullanmanın şartı, array'in sıralı olması.

        // gelen array'i sıralıyorum.
        Arrays.sort(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, sayi);
        if (sonuc >= 0)
            return true;
        else
            return false;


    }

    public void testArraydeVarmı()
    {
        int sayilar [] = {13, 45, 67, -4, 41, 70};

        int sayi = 67;

        boolean sonuc = arraydeVarmi(sayilar, sayi);

        if (sonuc== true)
            System.out.println("arrayde var");
        else
            System.out.println("arayde yok");
    }

    public static void main(String[] args) {
        // yeni çılgın sayısal loto'ya uygun,
        // 90 sayıdan 6 tane seçeceğiz.


        // sayıları tutacağımız bir array tanımlıyoruz.
        //int sayilar[] = new[KAC_SAYI];

        // Döngüyle array'a rastgele sayıları atalım.

//        for (int i = 0; i < sayilar.length; i++) {
//
//
//        }

        SayisalLoto_array loto = new SayisalLoto_array();

        loto.testArraydeVarmı();






    }



}
