package Gun29_PublicKonusu.Banka;

public class MusteriHesap {

    // burdaki değişkenleri kullanırken her zaman THISkullanıcaz
    int gelenParaToplam=0; // toplama yapıcam onun ıcın başlangıc
                          // olarak 0 verdim.
    int cekilenParaToplam=0;

    private int bakiye=0;

    void paraYatir(int gelenPara)  // yukardaki değişkenler ile burdaki
                                   // karışmasın diye.
    {
        // THIS koyduk değişkenler karışmasın diye
        this.gelenParaToplam=this.gelenParaToplam+gelenPara;
        this.bakiye=this.bakiye+gelenPara;
    }

    void paraCek(int cekilenPara)
    {
        this.cekilenParaToplam=this.cekilenParaToplam+cekilenPara;
        this.bakiye=this.bakiye-cekilenPara;
    }

    @Override
    public String toString() {
        return "MusteriHesap{" +
                "gelenParaToplam=" + gelenParaToplam +
                ", cekilenParaToplam=" + cekilenParaToplam +
                ", bakiye=" + bakiye +
                '}';
    }
}
