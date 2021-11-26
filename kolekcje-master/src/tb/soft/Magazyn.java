package tb.soft;
//package pl.javastart.exception.classcastexception;

import java.util.HashSet;
//import java.util.TreeSet;
import java.util.Set;
import java.util.*;

public class Magazyn {

    Set<Person> OsobyHashset = new HashSet<>();
    Set<Person>  OsobyTreeset = new TreeSet<>();
    List<Person> OsobyArray = new ArrayList<>();
    List<Person> OsobyLinked = new LinkedList<>();
    Map<String,String> OsobyHashMap = new HashMap<>();
    Map<String,String> OsobyTreeMap = new TreeMap<>();

    private static final String WYBOR =
            "    W Y B O R   K O L E K C J I  \n" +
                    "1 - Hashset    \n" +
                    "2 - Treeset    \n" +
                    "3 - ArrayList  \n" +
                    "4 - LinkedList \n" +
                    "5 - HashMap    \n" +
                    "6 - TreeMap    \n" ;

    private static final ConsoleUserDialog UI = new ConsoleUserDialog();

    public void dodajHashset(Person osoba) {
        OsobyHashset.add(osoba);
        System.out.println("Dodano osobe do kolekcji Hashset");
    }

    public void dodajTreeset(Person osoba) {
        OsobyTreeset.add(osoba);
        System.out.println("Dodano osobe do kolekcji Treeset");
    }

    public void dodajArray(Person osoba) {
        OsobyArray.add(osoba);
        System.out.println("Dodano osobe do kolekcji ArrayList");
    }

    public void dodajLinked(Person osoba) {
        OsobyLinked.add(osoba);
        System.out.println("Dodano osobe do kolekcji LinkedList");
    }

    public void dodajHashMap(Person osoba) {
        OsobyHashMap.put(osoba.getLastName(),osoba.getJob().jobName);
        System.out.println("Dodano osobe do kolekcji HashMap");
    }

    public void dodajTreeMap(Person osoba) {
        OsobyTreeMap.put(osoba.getLastName(),osoba.getJob().jobName);
        System.out.println("Dodano osobe do kolekcji TreeMap");
    }

    public void usunHashset(Person osoba) {
        OsobyHashset.remove(osoba);
        System.out.println("Usunieto osobe z kolekcji Hashset");
    }

    public void usunTreeset(Person osoba) {
        OsobyTreeset.remove(osoba);
        System.out.println("Usunieto osobe z kolekcji Treeset");
    }

    public void usunArray(Person osoba) {
        OsobyArray.remove(osoba);
        System.out.println("Usunieto osobe z kolekcji ArrayList");
    }

    public void usunLinked(Person osoba) {
        OsobyLinked.remove(osoba);
        System.out.println("Usunieto osobe z kolekcji LinkedList");
    }

    public void usunHashMap(Person osoba) {
        OsobyHashMap.remove(osoba.getLastName(),osoba.getJob().jobName);
        System.out.println("Usunieto osobe z kolekcji HashMap");
    }

    public void usunTreeMap(Person osoba) {
        OsobyTreeMap.remove(osoba.getLastName(),osoba.getJob().jobName);
        System.out.println("Usunieto osobe z kolekcji HashMap");
    }

    public void WypiszOsobyWKolekcji() {

        switch (UI.enterInt(WYBOR + "==>> ")){
            case 1:
                for(Person osobnik: OsobyHashset)
                {
                    System.out.println(osobnik.getFirstName());
                    System.out.println(osobnik.getLastName());
                    System.out.println(osobnik.getBirthYear());
                    System.out.println(osobnik.getJob() + "\n");
                }
                break;
            case 2:
                for(Person osobnik: OsobyTreeset)
                {
                    System.out.println(osobnik.getFirstName());
                    System.out.println(osobnik.getLastName());
                    System.out.println(osobnik.getBirthYear());
                    System.out.println(osobnik.getJob() + "\n");
                }
                break;

            case 3:
                for(Person osobnik: OsobyArray)
                {
                    System.out.println(osobnik.getFirstName());
                    System.out.println(osobnik.getLastName());
                    System.out.println(osobnik.getBirthYear());
                    System.out.println(osobnik.getJob() + "\n");
                }
                break;
            case 4:
                for(Person osobnik: OsobyLinked)
                {
                    System.out.println(osobnik.getFirstName());
                    System.out.println(osobnik.getLastName());
                    System.out.println(osobnik.getBirthYear());
                    System.out.println(osobnik.getJob() + "\n");
                }

            case 5:
                Set<Map.Entry<String,String>> entrySet = OsobyHashMap.entrySet();
                for(Map.Entry<String,String> entry: entrySet)
                {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
                break;

            case 6:
                Set<Map.Entry<String,String>> entrySet2 = OsobyTreeMap.entrySet();
                for(Map.Entry<String,String> entry: entrySet2)
                {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
                break;
        }


    }
}
