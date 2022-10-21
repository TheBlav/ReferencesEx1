
import java.util.Collections;

import java.util.List;

public class References {
    public static void main(String[] args) {
        String[] names = {"Zofia", "Mateusz", "Agnieszka", "Gerard", "Katarzyna"};
        List<String> list = new java.util.ArrayList<>(List.of(names));

        System.out.println("List of names: \n" + list);
        System.out.println("\n List of sorted names: ");
        Collections.sort(list, String::compareToIgnoreCase);
        System.out.println(list);

    }
}
