public class Furdoszoba
{
    float furdoHossz;
    float furdoSzelesseg;
    float furdoMagassag;

    public Furdoszoba(float furdoHossz, float furdoSzelesseg, float furdoMagassag)
    {
        this.furdoHossz = furdoHossz;
        this.furdoSzelesseg = furdoSzelesseg;
        this.furdoMagassag = furdoMagassag;
    }
    float mennyitkellCsempezni()
    {
        return (furdoSzelesseg*furdoHossz)+(((furdoSzelesseg*furdoMagassag)+(furdoHossz*furdoMagassag))*2);
    }

    float valasz(float terulet)
    {
        return mennyitkellCsempezni()/terulet;
    }
}
