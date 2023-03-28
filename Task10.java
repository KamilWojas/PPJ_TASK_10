package com.company;

public class s23878 {

   public void zad01(){
       Kwadrat kwadrat1 = new Kwadrat(),

               kwadrat2 = new Kwadrat(2);
       Kwadrat kwadrat3 = new Kwadrat(8);

       kwadrat1.show();
       kwadrat2.show();
       kwadrat3.show();

   }

   public void zad02(){
       Walec walec1 = new Walec(),
               walec2 = new Walec(2,2),
               walec3 = new Walec(10,10);

       walec1.show();
       walec2.show();
       walec3.show();

   }

   public void zad04(){

           System.out.println((new Drzewo(false, 5, "ładny")).toString());
       }


   public void zad5(){
           System.out.println((new DrzewoIglaste(true, 5, "ładny", 10, 20)).toString());
           System.out.println((new DrzewoOwocowe(false, 1, "średni na jeża", "pomidor")).toString());
       }

       public static void main(String[] args) {

       }

    public static class Kwadrat {
        private double bok;

        Kwadrat() {
            this.bok = 0;
        }

        Kwadrat(double bok) {
            this.bok = bok;
        }

        void show() {
            double pole = bok * bok;
            double objetosc = pole * bok;

            System.out.println(this + ":\nPole kwadratu wynosi \t\t" + pole + " (j²)\nObjetosc szescianu wynosi \t"
                    + objetosc + " (j³)");
        }
    }

    public static class Walec {
        private double promień, wysokość;

        Walec() {
            this.promień = 0;
            this.wysokość = 0;
        }

        Walec(double promień, double wysokość) {
            this.promień = promień;
            this.wysokość = wysokość;
        }

        void show() {
            double pole = (Math.PI * promień * promień);
            double objetosc = pole * wysokość;
            System.out.println(this + ":\nPole podstawy wynosi \t\t" + pole + " (j²)\nObjetosc walca wynosi \t\t" + objetosc
                    + " (j³)");
        }
    }

    public static class Drzewo {
        private boolean wiecznieZielone;
        private int wysokosc;
        private String przekrojDrzewa;

        Drzewo() {
            this.wiecznieZielone = false;
            this.wysokosc = 0;
            this.przekrojDrzewa = "brzydki";
        }

        Drzewo(boolean wz, int h, String pd) {
            this.wiecznieZielone = wz;
            this.wysokosc = h;
            this.przekrojDrzewa = pd;
        }

        public String toString() {
            return "Drzewo " + ((wiecznieZielone) ? "wiecznie zielone" : "sezonowo zielone") + " wysokie na " + wysokosc
                    + " m, przekroj - " + przekrojDrzewa;
        }

    }

    static class DrzewoIglaste extends Drzewo {
        private int iloscIgiel;
        private double dlugoscSzyszki;

        DrzewoIglaste() {
            super();
            this.iloscIgiel = 0;
            this.dlugoscSzyszki = 0;
        }

        DrzewoIglaste(boolean wz, int h, String pd, int ii, double ds) {
            super(wz, h, pd);
            this.iloscIgiel = ii;
            this.dlugoscSzyszki = ds;
        }

        public String toString() {
            return super.toString() + ", ilosc igieł " + this.iloscIgiel + ", dlugosc szyszki " + dlugoscSzyszki;
        }
    }

    static class DrzewoOwocowe extends Drzewo {
        private String nazwaOwoca;

        DrzewoOwocowe() {
            super();
            this.nazwaOwoca = "";
        }

        DrzewoOwocowe(boolean wz, int h, String pd, String no) {
            super(wz, h, pd);
            this.nazwaOwoca = no;
        }

        public String toString() {
            return super.toString() + ", nazwaOwoca " + this.nazwaOwoca;
        }
    }

    static class DrzewoLisciaste extends Drzewo {
        private int ksztaltLiscia;

        DrzewoLisciaste() {
            super();
            this.ksztaltLiscia = 0;
        }

        DrzewoLisciaste(boolean wz, int h, String pd, int kl) {
            super(wz, h, pd);
            this.ksztaltLiscia = kl;
        }

        public String toString() {
            return super.toString() + ", ksztalt liscia " + this.ksztaltLiscia;
        }
    }
}


