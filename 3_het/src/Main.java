import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        elsoFeladat();

        //Második feladat

        Teglalap[] teglalaps = new Teglalap[25];
        var i=0;
        while(i<25)
        {
            System.out.println("Kérem adja meg a(z) "+(i+1)+". téglalap hosszát: ");
            float hossz = sc.nextFloat();
            System.out.println("Kérem adja meg a(z) "+(i+1)+". téglalap szélességét: ");
            float szelesseg = sc.nextFloat();

            teglalaps[i] = new Teglalap(hossz,szelesseg);

            System.out.println("Szeretne még téglalapot hozzáadni (i/n)\n" +
                    "jelenleg "+(i+1)+" téglalap van elmentve");
            char valasz = sc.next().charAt(0);
            if(valasz == 'n')
            {
                break;
            }
            i++;
        }
        for(int j = 0;j< teglalaps.length;j++)
        {
            if(teglalaps[j]!=null)
            {
                System.out.println((j+1)+". "+teglalaps[j].valasz());
            }
        }


        //Harmadik feladat

        System.out.println("Kérem adja meg, hogy hány fürdőszobát szeretne csempézni: ");
        int hanyFurdo = sc.nextInt();
        Furdoszoba[] furdok = new Furdoszoba[hanyFurdo];

        for(int k =0;k<furdok.length;k++)
        {
            System.out.println("Kérem adja meg a(z) "+(k+1)+". fürdőszoba hosszát: ");
            float hossz = sc.nextFloat();
            System.out.println("Kérem adja meg a(z) "+(k+1)+". fürdőszoba szélességét: ");
            float szelesseg = sc.nextFloat();
            System.out.println("Kérem adja meg a(z) "+(k+1)+". fürdőszoba magasságát: ");
            float magassag = sc.nextFloat();
            System.out.println("Kérem adja meg a(z) "+(k+1)+". fürdőszobához használt csempe hosszát: ");
            float csempeHossz = sc.nextFloat();
            System.out.println("Kérem adja meg a(z) "+(k+1)+". fürdőszobához használt csempe szélességét: ");
            float csempeSzelesseg = sc.nextFloat();

            furdok[k] = new Furdoszoba(hossz,szelesseg,magassag);
            System.out.println((k+1)+". fürdőszoba\nHossz: "+hossz+"\nSzélesség: "+szelesseg+"\nMagasság: "+magassag+"\nCsempe: h: "+csempeHossz+" sz: "+csempeSzelesseg);
            System.out.println("Összesen: \nTerület: "+furdok[k].mennyitkellCsempezni()+"\n"+furdok[k].valasz(csempeHossz*csempeSzelesseg)+" csempe kell");
        }


        //Negyedik feladat

        Dolgozo[] dolgozok = new Dolgozo[15];
        int osszKifizetes = 0;
        int j =0;
        while(j<25)
        {
            System.out.println("Kérem adja meg a(z) "+(j+1)+". dolgozó nevét: ");
            String nev = sc.next();
            System.out.println("Kérem adja meg a(z) "+(j+1)+". dolgozó ledolgozott óráinak számát: ");
            int ledolgozottOra = sc.nextInt();
            System.out.println("Kérem adja meg a(z) "+(j+1)+". dolgozó órabérét: ");
            int oraber = sc.nextInt();

            dolgozok[j] = new Dolgozo(nev,ledolgozottOra,oraber);

            System.out.println("Szeretne még dolgozót hozzáadni (i/n)\nJelenleg "+(j+1)+" dolgozó van");
            char harmadikValasz = sc.next().charAt(0);
            if (harmadikValasz == 'n')
            {
                break;
            }
            j++;
        }
        for (int e =0;e<dolgozok.length;e++)
        {
            if(dolgozok[e] != null)
            {
                System.out.println((e+1)+" dolgozó---\n"+dolgozok[e].nev+", "+dolgozok[e].fizetettOrak());
                osszKifizetes+=dolgozok[e].fizetettOrak();
            }
        }
        System.out.println("Összesen "+osszKifizetes+" Forintot kell kifizetni");
    }

    public static void elsoFeladat()
    {
        System.out.println("Kérem adja meg, hogy mekkora elemű tömböt szeretne: ");
        int tombHossz = sc.nextInt();
        int[] tomb = new int[tombHossz];

        for(int i =0;i<tomb.length;i++)
        {
            System.out.println("Kérem adja meg a tömb "+(i+1)+". elemét");
            int ertek = sc.nextInt();
            tomb[i]=ertek;
        }
        System.out.println("Eredeti tömb\n"+Arrays.toString(tomb));
        elsoFeladatSzortiroz(tomb);
    }
    public static void elsoFeladatSzortiroz(int[] n)
    {
        int temp;
        for(int i =0;i<n.length-1;i++)
        {
            for(int j =0;j<n.length-i-1;j++)
            {
                if(n[j]<n[j+1])
                {
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(n));
    }


}