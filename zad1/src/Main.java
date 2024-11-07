// Zaimplementuj program, który przyjmuje od użytkownika ciąg liczb i przechowuje je w zbiorze typu HashSet i TreeSet.
// Następnie wyświetl różnice między HashSet a TreeSet w kontekście kolejności elementów.
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet <Integer> treeSet = new TreeSet<>();

        System.out.println("Podaj liczby, oddzielone spacjami: ");
        String[] input = scanner.nextLine().split(" ");
        for(String number : input) {
            int value = Integer.parseInt(number);
            hashSet.add(value);
            treeSet.add(value);
        }

        System.out.println("HashSet - kolejność dowolna: " + hashSet);
        System.out.println("TreeSet - kolejność posortowana rosnąco: " + treeSet);
    }
}