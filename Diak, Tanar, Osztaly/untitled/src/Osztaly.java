import java.util.Arrays;

public class Osztaly
{
    String osztalyNev;
    Diak[] diakok;
    Tanar tanar;

    public Osztaly(String osztalyNev, Diak[] diakok, Tanar tanar)
    {
        this.osztalyNev = osztalyNev;
        this.diakok = diakok;
        this.tanar = tanar;
    }
    void info()
    {
        System.out.print("Osztálynév: "+osztalyNev);
        System.out.print("\nDiákok: \n");
        for(Diak d : diakok)
        {
            d.info();
        }
        System.out.println("Tanár: ");
        tanar.info();
    }
}
