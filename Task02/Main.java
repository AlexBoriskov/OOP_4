package Task02;

import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static <T> void printElemant (List <T> list){
        for (T t : list) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        List <Integer> intList = new ArrayList <>();
        intList.add(5);
        intList.add(15);
        intList.add(25);

        List <String> strList = new ArrayList<>();
        strList.add("Sasha");
        strList.add("Dima");
        strList.add("Jenya");

        printElemant(intList);
        printElemant(strList);

    }

}
