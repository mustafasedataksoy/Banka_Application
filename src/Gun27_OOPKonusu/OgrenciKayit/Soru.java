package Gun27_OOPKonusu.OgrenciKayit;

public class Soru {

    // Bir üniversite öğrencilere ders kaydı yapılacaktır.
    // 1-Lesson : fields : name, credit (1-10 arasında değer alıyor)
    // 2-Student : fields : name, maxSaat, dersleri listesini tutacak bir liste
    // 3-3adet ders oluşturunuz
    // 4-1 adet öğrenci tanımlayınız alabileceği maxSaat i 10 olsun
    // 5-Bu öğrencinin ders listesinde açılmış dersleri ekleyiniz. -> Nesne ait
    //   ders eklerken max alabileceği Saati geçmemeli, geçerse
    //  uyarı versi, alabileceği max saati doldu şeklinde.
    // 6-Universite kurallarını  2 maddelik bir not yazdıran metod ekleyiniz.
    //   en başta yazdırınız -> tipe ait

    public static void main(String[] args) {
        Ogrenci.universiteKurallari();

        Ders ders1 = new Ders();
        ders1.name="Tarih101";
        ders1.saat=4;

        Ders ders2 = new Ders();
        ders2.name="Java101";
        ders2.saat=3;

        Ders ders3 = new Ders();
        ders3.name="Alg101";
        ders3.saat=6;



        Ogrenci ogr1=new Ogrenci();
        ogr1.ad="Sedat";
        ogr1.maxSaat=10;


        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);
        ogr1.dersleriYazdir();







    }
}
