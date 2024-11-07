// Stwórz program, który dodaje, usuwa i modyfikuje elementy w dwóch listach typu ArrayList i LinkedList.
// Następnie zmierz czas wykonywania tych operacji i porównaj wyniki.
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start, end;

        //Dodawanie elementów do ArrayList
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Czas dodawania do ArrayList = " + (end-start) + " nanosekund");

        //Dodawanie elementów do LinkedList
        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("Czas dodawania do LinkedList = " + (end-start) + " nanosekund");

        //Usuwanie elementów z ArrayList
        start = System.nanoTime();
        arrayList.remove(50000);
        end = System.nanoTime();
        System.out.println("Czas usuwania z ArrayList = " + (end-start) + " nanosekund");

        //Usuwanie elementów z LinkedList
        start = System.nanoTime();
        linkedList.remove(50000);
        end = System.nanoTime();
        System.out.println("Czas usuwania z LinkedList = " + (end-start) + " nanosekund");
    }
}
