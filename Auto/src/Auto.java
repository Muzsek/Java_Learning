public class Auto
{
    String marka;
    String tipus;
    Integer evjarat;
    int kmAllas;

    public Auto(String marka, String tipus, Integer evjarat, int kmAllas)
    {
        this.marka = marka;
        this.tipus = tipus;
        this.evjarat = evjarat;
        this.kmAllas = kmAllas;
    }
    void megtettUt(int km)
    {
        kmAllas += km;
    }
    void autoInfo()
    {
        System.out.println("Autó: "+marka+" "+tipus+", Évjárat: "+evjarat+", Kilóméter: "+kmAllas);
    }
}
