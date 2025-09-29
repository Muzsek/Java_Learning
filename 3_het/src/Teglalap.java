public class Teglalap
{
    float teglalapHossz;
    float teglalapSzelesseg;

    public Teglalap(float teglalapHossz, float teglalapSzelesseg)
    {
        this.teglalapHossz = teglalapHossz;
        this.teglalapSzelesseg = teglalapSzelesseg;
    }

    float terulet()
    {
        return teglalapHossz*teglalapSzelesseg;
    }

    String valasz()
    {
        return String.format("Szélesség: "+teglalapSzelesseg+ " Hossz: "+teglalapHossz+" Terület: "+terulet());
    }
}
