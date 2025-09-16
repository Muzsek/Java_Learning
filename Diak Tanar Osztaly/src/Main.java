public class Main {
    public static void main(String[] args) {
        Tanar tanar = new Tanar(
                /*nev*/ "Imre bá'",
                /*tantargy*/ "Történelem"
        );
        Diak diak1 = new Diak(
                /*nev*/ "Álmos",
                /*eletkor*/ 13,
                /*atlag*/ 3.5
        );
        Diak diak2 = new Diak(
                /*nev*/ "Teréz",
                /*eletkor*/ 9,
                /*atlag*/ 4.1
        );
        Osztaly osztaly = new Osztaly(
                /*osztalynev*/ "9.A",
                /*diakok*/ new Diak[]{diak1, diak2},
                /*tanar*/ tanar
        );
        osztaly.info();
    }
}