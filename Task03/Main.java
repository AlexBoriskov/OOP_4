package Task03;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    
    public static <T> void sortList (List <T> list, Comparator <? super T> comparator){
        Collections.sort(list, Collections.reverseOrder(comparator));
    }

    public static <T> void printList (List <T> list){
        for (T t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        List <Integer> intList = new ArrayList<>();
        intList.add(8);
        intList.add(10);
        intList.add(3);
        intList.add(2);
        intList.add(-1);

        List <String> strList = new ArrayList<>();
        strList.add("Sasha");
        strList.add("Dima");
        strList.add ("Artem");
        strList.add("Leonid");

        printList(intList);
        sortList(intList, (a, b) -> b.compareTo(a));
        printList(intList);

        printList(strList);
        sortList(strList, (a, b) -> b.compareTo(a));
        printList(strList);
    }
}
