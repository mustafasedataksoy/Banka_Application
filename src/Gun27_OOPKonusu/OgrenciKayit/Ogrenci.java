package Gun27_OOPKonusu.OgrenciKayit;

import java.util.ArrayList;

public class Ogrenci {
    String ad;
    int maxSaat;

    ArrayList<Ders> dersleri = new ArrayList<>();

    void dersEkle(Ders yeniDers)
    {
        // şu ana kadar kaç saat dersi var
        // geleni ekliyip max saati geçip geçmediği
        // kontrol etmem gerekiyor
        int aldigiToplamSaat=0;
        for (Ders d: dersleri)
            aldigiToplamSaat=aldigiToplamSaat+d.saat;

        if (aldigiToplamSaat+yeniDers.saat > maxSaat)
            System.out.println("Max Ders saati aşıldı.Ders Eklenemedi");
        else
        dersleri.add(yeniDers);

    }

    void dersleriYazdir()
    {
        System.out.println("\n**** Transkript ****");
        System.out.println("Sayın " + ad);
        System.out.println("Aldığınız dersler aşşağıdadır");
        for (Ders d: dersleri)
            System.out.println(d.name+" "+d.saat);
    }
    static void universiteKurallari ()
    {
        System.out.println("kural1 : Kahvaltı yapmadan derse gelme");
        System.out.println("kural2 : Uykunu mutlaka al");
        System.out.println("kural3 : Herzaman dinç dinamik ol");
        System.out.println("kural4 : Başta verdiğin kararı UNUTMA!");
        System.out.println("kural5 : Biz imkansızlıkları, inş aşacağız ");
    }

}
