//Stwórz aplikację, która umożliwia użytkownikowi przechowywanie par klucz-wartość w mapie typu HashMap i TreeMap.
// Po dodaniu kilku elementów, zwróć uwagę na różnice w kolejności kluczy w obu mapach.
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        hashMap.put("Amelia", 6);
        hashMap.put("Ala", 7);
        hashMap.put("Hania", 13);

        treeMap.put("Amelia", 6);
        treeMap.put("Ala", 7);
        treeMap.put("Hania", 13);

        System.out.println("HashMap - kolejność dowolna: " + hashMap);
        System.out.println("TreeMap - kolejność posortowana według kluczy: " + treeMap);
    }
}
