package Task01;

public class Main {
    
    public static <T> void printElemant ( T value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Integer a1 = 5;
        String a2 = "Hello, World!";
        Double a3 = 3.14;

        printElemant(a1);
        printElemant(a2);
        printElemant(a3);
    }
}
