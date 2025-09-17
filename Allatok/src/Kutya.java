public class Kutya extends Allat
{
    String fajta;
    public Kutya(String nev, int kor, String fajta)
    {
        super(nev,kor);
        this.fajta = fajta;
    }

    void hangotAd()
    {
        System.out.println(nev+" (a "+fajta+" fajtájú kutya) mondja: Vau Vau\nKora: "+kor);
    }
}
