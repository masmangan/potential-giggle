import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Examples {


    public static void main(String[] args) {
        System.out.println("Coleções!!");

        // LIST
        System.out.println("Lists!!");
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new LinkedList<>();

        lst1.add(10);
        lst1.add(20);
        lst1.add(10);

        System.out.println(lst1);

        lst2.add(10);
        lst2.add(20);
        System.out.println(lst2.add(10));

        System.out.println(lst2);

        lst1.addAll(lst2);

        System.out.println(lst1);
        System.out.println(lst2);

        // SET
        System.out.println("Sets!!");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Pessoa> set3 = new TreeSet<>();

        System.out.println(set1);
        set1.add(10);
        System.out.println(set1);
        set1.add(20);
        System.out.println(set1);
        System.out.println(set1.add(10));
        System.out.println(set1);

        System.out.println(set2);
        set2.add(10);
        System.out.println(set2);
        set2.add(20);
        System.out.println(set2);
        System.out.println(set2.add(10));
        System.out.println(set2);

        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);                
        // MAP
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(10, "Dez (Primeiro)");
        map1.put(20, "Vinte");
        map1.put(10, "Dez (Segundo)");
        System.out.println(map1);

        String value1 = map1.get(20);
        System.out.println(value1);
        String value2 = map1.get(30);
        System.out.println(value2);

        // SET!
        Pessoa joao = new Pessoa("João");
        set3.add(joao);
        set3.add(new Pessoa("Maria"));
        set3.add(new Pessoa("João"));

        System.out.println(set3);

    }
}