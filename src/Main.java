import java.util.Scanner;

class Pearson{
    public static String imie;
    public static String nazwisko;
    public static int wiek;
    public static String plec;

    public Pearson(String imie, String nazwisko, int wiek, String plec){
        this.imie = "bob";
        this.nazwisko = "megaglupi";
        this.wiek = 19;
        this.plec = "chlop";

    }

     static void przedstawienie(){
        System.out.println(imie + " " + nazwisko + " " + wiek + " " + plec);
    }

    static void zmianawieku(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        wiek = sc.nextInt();
        sc.close();
    }

    public static String getImie() {return imie;}
    public static String getNazwisko() {return nazwisko;}
    public static String getPlec() {return plec;}
    public static int getWiek() {return wiek;}

}

class Employee extends Pearson{
    public static String stanowisko;
    public static int wynagrodzenie;
    public static int id;
    public static boolean statuspracy;
    public Employee(String imie, String nazwisko, int wiek, String plec){
        super(imie, nazwisko, wiek, plec);
    }
}

class Manager extends Employee{
    public static int ilosc_podwladnych;
    public static String dzial;

    public void dane(){
        System.out.println(ilosc_podwladnych + " " + dzial);
    }

    public Manager() {
        super(imie, nazwisko, wiek, plec);
    }
}


public class Main {
    public static void main(String[] args) {
    Manager mrg = new Manager();
    mrg.dane();
    Pearson prs = new Pearson("bob", "megaglupi", 19, "chlop");
    prs.przedstawienie();
    prs.zmianawieku();
    prs.przedstawienie();

        }
    }
