public class Macska extends Allat
{
    String szin;
    public Macska(String nev, int kor, String szin)
    {
        super(nev,kor);
        this.szin = szin;
    }

    void hangotAd()
    {
        System.out.println(nev + " (a " + szin + " macska) azt mondja: Miau miau!\nKora: "+kor);
    }
}
