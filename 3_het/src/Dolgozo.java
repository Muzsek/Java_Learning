public class Dolgozo
{
    String nev;
    int ledolgozottOrak;
    int oraber;

    public Dolgozo(String nev, int ledolgozottOrak, int oraber)
    {
        this.nev = nev;
        this.ledolgozottOrak = ledolgozottOrak;
        this.oraber = oraber;
    }

    int fizetettOrak()
    {
        return ledolgozottOrak*oraber;
    }
    String info()
    {
        return String.format(nev+" dolgozó "+fizetettOrak()+" bért kap");
    }
}
