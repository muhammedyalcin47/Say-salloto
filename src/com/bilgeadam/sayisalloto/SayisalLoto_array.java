package com.bilgeadam.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_array {

    // static değişkene,obje oluşturmadan
    // Class_adı.değişken diye erişebiliyoruz.
    private static final int MAX_SAYI = 100;
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

        if (sonuc>= 0)
            return true;
        else
            return false;


    }

    public void testArraydeVarmı()
    {
        int sayilar [] = {13 ,45 ,67 ,-4 ,41 ,70};

        int sayi = 68;

        boolean sonuc = arraydeVarmi(sayilar, sayi);

        if (sonuc== true)
            System.out.println("arrayde var");
        else
            System.out.println("arayde yok");
    }

    public static void main(String[] args) {
        // yeni çılgın sayısal loto'ya uygun,
        // 90 sayıdan 6 tane seçeceğiz.

        SayisalLoto_array loto = new SayisalLoto_array();

        // sayıları tutacağımız bir array tanımlıyoruz.
        int sayilar[] = new int[KAC_SAYI];

        // Döngüyle array'a rastgele sayıları atalım.

        for (int i = 0; i < sayilar.length; i++) {

            int rastgelesayi = loto.sayıGetir();

            // ratgele sayı arrayde varsa döngüyle tekrar sayı alınacak.
            // arrayde olmayan sayı bulana kadar döngüden çıkamaz.
            boolean sonuc = loto.arraydeVarmi(sayilar, rastgelesayi);
            while (sonuc == true)
            {
                rastgelesayi = loto.sayıGetir();
                sonuc = loto.arraydeVarmi(sayilar, rastgelesayi);
            }

            // hep arrayin ilk elemanına yazalım rastgele sayıyı
            // çünkü sıralanınca sayı sonrala gidiyor.
            sayilar[0] = rastgelesayi;

            // 6. sayıyı sıfır indekse yazınca, tekrar sıralanması için bunu ekledik.
            Arrays.sort(sayilar);

        }

        // arrayı yazdır
        for (int i = 0; i < sayilar.length; i++) {

            if (i == sayilar.length-1)
                System.out.println(sayilar[i]);
            else
            System.out.print(sayilar[i]+"- ");
        }



        //loto.testArraydeVarmı();






    }



}
