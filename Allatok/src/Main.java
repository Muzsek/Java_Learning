public class Main {
    public static void main(String[] args)
    {
        Kutya kutya = new Kutya("Buksi",3,"Doberman");
        Macska macska = new Macska("Cirmos",2,"fekete");

        //kutya.hangotAd();
        //macska.hangotAd();

        Allat[] allatkert = {kutya,macska};
        for(Allat allat : allatkert)
        {
            allat.hangotAd();
        }
    }
}
