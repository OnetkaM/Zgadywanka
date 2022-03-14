public class Zgadywanka {
    Gracz p1;
    Gracz p2;
    Gracz p3;

    public void rozpocznijGre() {
        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();

        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;

        boolean p1odgad1 = false;
        boolean p2odgad1 = false;
        boolean p3odgad1 = false;

        int liczbaOdgadywana = (int) (Math.random() * 10);
        System.out.println("Myślę o liczbie z zakresu od 0 do 9...");

        while (true) {
            System.out.println("Należy wytypować liczbę: " + liczbaOdgadywana);

            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            typp1 = p1.liczba;
            System.out.println("Gracz pierwszy wytypował liczbę: " + typp1);

            typp2 = p2.liczba;
            System.out.println("Gracz pierwszy wytypował liczbę: " + typp2);

            typp3 = p3.liczba;
            System.out.println("Gracz pierwszy wytypował liczbę: " + typp3);

            if (typp1 == liczbaOdgadywana) {
                p1odgad1 = true;
            }
            if (typp2 == liczbaOdgadywana) {
                p2odgad1 = true;
            }
            if (typp3 == liczbaOdgadywana) {
                p3odgad1 = true;
            }

            if (p1odgad1 || p2odgad1 || p3odgad1) {

                System.out.println("Mamy zwycięzcę!");
                System.out.println("Czy gracz pierwszy wytypował poprawnie? " + p1odgad1);
                System.out.println("Czy gracz drugi wytypował poprawnie? " + p2odgad1);
                System.out.println("Koniec gry.");
                break;

            } else {
                System.out.println("Gracze będą musieli spróbować jeszcze raz.");
            }
        }
    }
}
class Gracz {
    int liczba = 0;

    public void zgaduj() {
        liczba = (int) (Math.random() * 10);
        System.out.println("Typuję liczbę: " + liczba);
    }
}

class StarterGry {
    public static void main(String[] args) {
        Zgadywanka gra = new Zgadywanka();
        gra.rozpocznijGre();
    }
}
