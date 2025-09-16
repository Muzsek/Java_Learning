public class Diak
{
    String nev;
    int eletkor;
    double atlag;
        public Diak(String nev, int eletkor, double atlag)
        {
            this.nev = nev;
            this.eletkor = eletkor;
            this.atlag = atlag;
        }
        void info()
        {
            System.out.printf("Nev: "+nev +" Eletkor: "+eletkor +" Atlag: %.2f\n", atlag);
        }
}