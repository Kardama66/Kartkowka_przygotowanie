import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Piękna notateczka do kartkóweczki

        //TODO rzutowanie i typy danych, losowanie liczb z zakresu <100,150>

        //sout - wypisywanie
        int losowanaLiczba = (int)(Math.random()*51)+100;
        while(losowanaLiczba != 100) {
            losowanaLiczba = (int)(Math.random()*51)+100;
        }
        System.out.println(losowanaLiczba);
        //int w nawiasie to rzutowanie zeby byla taka zmienna
        /* typy proste
        char - znakowy
        rzutowanie rozszerzające (double) - jest domyślne
        rzutowanie zawężające (int) - ucina po przecinku
         */

        //TODO Odczytuwanie z klawiatury

        //Scanner z intem
//        Scanner klawiatura = new Scanner(System.in);
//        int wpisanaLiczba = klawiatura.nextInt();
//        System.out.println("wpisano liczbę: "+wpisanaLiczba);
//
//        //Scanner z stringiem
//        Scanner klawiatura2 = new Scanner(System.in);
//        String wpisanyciag = klawiatura2.next();
//        System.out.println("wpisano ciag: "+wpisanyciag);

        //TODO if i ten dziwny if

        //if() else if() else() to zwraca true false, jak w jsie

        // warunek ? jeśli sie spełni : jeśli sie nie spełni -- zwraca wartosc z warunku, a nie true/false  (operator warunkowy)


        //TODO Switch

        /*
        *  switch (wartosc){
                case cus:
                    akcja
                    break;
                case cus:
                    akcja
                    break;
                case cus:
                    akcja
                    break;
                default:
                    System.out.println("unlucky");
                    break;
            }


 Tutaj wyrażenie switch, od razu wypisane

       System.out.println(switch (roznica){
                        case 0 -> "Było dosyć blisko";
                        case 1 -> "Było mniej bliżej";
                        case 2 ->  "Było troche mniej bliżej";
                        default -> "nie pykło";
                    }
                    );
         */

        //TODO Losowa liczba + przyklad rzutowania

        //int losowanaLiczba = (int) (Math.random() * 100 + 1);


        }

        //TODO for, foreach i skróty
    /* for - wiadomo jak działa z i

    jak wpiszesz fori to od razu ładna składnia jest

Foreach:
 for (int iterator, cos jak i:tablica po której przechodzisz) {
            System.out.println(tu iterator);
        }

//TODO tablice, Arraylisty itd.
 int wylosowaneLiczby[] = new int[6]; - od razu zadeklarowana wielkosc tablicy

  tablica musi miec zdefiniowany rozmiar, nie mozna zmieniac w trakcie dzialania programu
        moze przechowac typy proste i złozone
        elementy indeksowane mogą się powtarzac
        kolekcje
        nie deklarujemy rozmiaru, rozmiar moze sie zmieniac w trakcie dzialania programu
        listy - list   ArrayList, LinkedList
        elementy indeksowane, każdy element ma swoje miejsce, mogą sie powtarzac
        zbiory - set  HashSet
        zazwyczaj elementy nie są indeksowane, elementy nie powtarzają się
        słowniki - map para klucz wartos

//listy złożone bardziej
        ArrayList<Integer> nazwa = new ArrayList<>();   -W srodku te duze, Integer, String itd., wszystko wedlug tej składni, Hashsety itd.


        jak cos chce sie dodac do listy, to sie robi nazwalisty.add(Math.random());

        a jak chce sie sprawdzic, czy cos juz jest to contains()




       //TODO funkcje
    Pamiętać że jak funkcje są wewnątrz maina to muszą być static

    public static int nazwa(int argument_numeryczny, String argument_tekstowy){}

    jesli funkcja nic nie zwraca to void



//TODO NWD i NWW



      // Metoda do obliczania NWD za pomocą algorytmu Euklidesa
    public static int obliczNWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Metoda do obliczania NWW na podstawie NWD
    public static int obliczNWW(int a, int b) {
        int nwd = obliczNWD(a, b);
        return (a * b) / nwd;
    }

    //TODO przeliczanie z dziesietnego na binarny i na opak
    public class DecimalToBinary {

    public static void main(String[] args) {
        int liczbaDziesietna = 25;
        String liczbaBinarna = decimalToBinary(liczbaDziesietna);
        System.out.println("Liczba " + liczbaDziesietna + " w systemie binarnym: " + liczbaBinarna);
    }

    public static String decimalToBinary(int liczba) {
        if (liczba == 0) {
            return "0"; // Obsługuje przypadek, gdy liczba dziesiętna wynosi 0.
        }

        StringBuilder wynik = new StringBuilder();
        while (liczba > 0) {
            int reszta = liczba % 2; // Oblicza resztę z dzielenia przez 2.
            wynik.insert(0, reszta); // Dodaje resztę na początek wyniku.
            liczba /= 2; // Dzieli liczbę przez 2, aby kontynuować konwersję.
        }
        return wynik.toString();
    }
}

public class BinaryToDecimal {

    public static void main(String[] args) {
        String liczbaBinarna = "1101";
        int liczbaDziesietna = binaryToDecimal(liczbaBinarna);
        System.out.println("Liczba binarna " + liczbaBinarna + " w systemie dziesiętnym: " + liczbaDziesietna);
    }

    public static int binaryToDecimal(String liczbaBinarna) {
        int wynik = 0;
        int potega = 0;

        for (int i = liczbaBinarna.length() - 1; i >= 0; i--) {
            char znak = liczbaBinarna.charAt(i);
            if (znak == '1') {
                wynik += Math.pow(2, potega);
            }
            potega++;
        }

        return wynik;
    }
}

//TODO Mediana i Dominanta

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StatystykiDanych {

    public static void main(String[] args) {
        // Przykładowy zestaw danych
        List<Integer> dane = new ArrayList<>();
        dane.add(2);
        dane.add(4);
        dane.add(6);
        dane.add(6);
        dane.add(7);
        dane.add(8);
        dane.add(8);
        dane.add(8);
        dane.add(9);
        dane.add(10);

        // Obliczanie mediany
        double mediana = obliczMediane(dane);
        System.out.println("Mediana: " + mediana);

        // Obliczanie dominanty
        int dominanta = obliczDominante(dane);
        System.out.println("Dominanta: " + dominanta);
    }

    public static double obliczMediane(List<Integer> dane) {
        Collections.sort(dane); // Sortowanie danych w porządku rosnącym

        int rozmiar = dane.size();
        if (rozmiar % 2 == 1) {
            // Liczba danych jest nieparzysta
            return dane.get(rozmiar / 2);
        } else {
            // Liczba danych jest parzysta
            int srodkowa1 = dane.get(rozmiar / 2 - 1);
            int srodkowa2 = dane.get(rozmiar / 2);
            return (double) (srodkowa1 + srodkowa2) / 2;
        }
    }

    public static int obliczDominante(List<Integer> dane) {
        Map<Integer, Integer> liczniki = new HashMap<>();

        for (int liczba : dane) {
            if (liczniki.containsKey(liczba)) {
                liczniki.put(liczba, liczniki.get(liczba) + 1);
            } else {
                liczniki.put(liczba, 1);
            }
        }

        int dominanta = -1;
        int maksymalnaLiczbaWystapien = 0;

        for (Entry<Integer, Integer> wpis : liczniki.entrySet()) {
            if (wpis.getValue() > maksymalnaLiczbaWystapien) {
                maksymalnaLiczbaWystapien = wpis.getValue();
                dominanta = wpis.getKey();
            }
        }

        return dominanta;
    }
}

//TODO liczby pierwsze i sito erastotenesa

public class LiczbyPierwsze {
    // Metoda do sprawdzania, czy liczba jest liczbą pierwszą
    static boolean czyPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tablica = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Liczby pierwsze w tablicy:");

        for (int liczba : tablica) {
            if (czyPierwsza(liczba)) {
                System.out.println(liczba);
            }
        }
    }
}

//TODO czy slowo jest palindromem

public class SprawdzPalindrom {

    public static void main(String[] args) {
        String slowo = "kajak";

        if (czyPalindrom(slowo)) {
            System.out.println(slowo + " jest palindromem.");
        } else {
            System.out.println(slowo + " nie jest palindromem.");
        }
    }

    public static boolean czyPalindrom(String slowo) {
        slowo = slowo.toLowerCase(); // Zamiana na małe litery dla wersji niezależnej od wielkości liter
        int dlugosc = slowo.length();

        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - i - 1)) {
                return false;
            }
        }
        return true;
    }
}




    //TODO ciąg fibonacciego

    public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Liczba elementów ciągu do wygenerowania

        System.out.println("Ciąg Fibonacciego dla " + n + " elementów:");

        int[] fibonacci = new int[n];

        // Pierwsze dwa elementy ciągu Fibonacciego
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generowanie kolejnych elementów ciągu
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Wyświetlanie ciągu
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}

//TODO ile razy sie powtarza liczba
import java.util.HashMap;

public class LiczbaNajczesciejWystepujaca {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 2, 2, 3, 4, 5, 5, 5};

        // Tworzenie mapy do zliczania wystąpień liczb
        HashMap<Integer, Integer> mapa = new HashMap<>();

        // Iterowanie po tablicy i zliczanie wystąpień
        for (int liczba : tablica) {
            if (mapa.containsKey(liczba)) {
                mapa.put(liczba, mapa.get(liczba) + 1);
            } else {
                mapa.put(liczba, 1);
            }
        }

        // Znajdowanie liczby najczęściej występującej
        int najczestszaLiczba = -1;
        int najwiecejWystapien = 0;

        for (int liczba : mapa.keySet()) {
            int wystapienia = mapa.get(liczba);
            if (wystapienia > najwiecejWystapien) {
                najczestszaLiczba = liczba;
                najwiecejWystapien = wystapienia;
            }
        }

        // Wyświetlanie wyniku
        System.out.println("Liczba najczęściej występująca to: " + najczestszaLiczba);
        System.out.println("Liczba wystąpień: " + najwiecejWystapien);
    }
}
//TODO liczenie znaków w tekscie
public class LiczenieZnakow {
    public static void main(String[] args) {
        String tekst = "To jest przykładowy tekst, w którym chcemy policzyć wystąpienia litery 'a'.";

        char znakDoSprawdzenia = 'a';
        int licznik = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znakDoSprawdzenia) {
                licznik++;
            }
        }

        System.out.println("Liczba wystąpień znaku '" + znakDoSprawdzenia + "' w tekście: " + licznik);
    }
}



    */
    }
