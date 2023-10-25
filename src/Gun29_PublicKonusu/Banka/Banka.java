package Gun29_PublicKonusu.Banka;

public class Banka {
    public static void main(String[] args) {

         // Hesap Yatan(int), çekilen (int), bakiye(int)(direk erişim olmamalı)
        // Müşteri hesapID(int), ad , soyad, MüşteriHesap(Hesap tipinde)
        // bir banka uygulaması için 1 müşteri tanımlayınız
        // müşterinin hesabına sırasıyla 100 tl , 200 tl, yatırınız, sonra 50 tel cekiniz
        // Müşterinin toplam yatanı, toplam çekileni ve kalan bakiyesini yazdırınız.
        // Bakiyeye direk  para atanamadığı kontrol ediniz.


        Musteri mus1=new Musteri();
        mus1.hesapID=1;
        mus1.ad="Sedat";
        mus1.soyAd="aksoy";
        
        mus1.hesap.paraYatir(100);
        mus1.hesap.paraYatir(200);
        mus1.hesap.paraCek(50);

        System.out.println("mus1.hesap = " + mus1.hesap);
       










    }
}
