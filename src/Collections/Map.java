package Collections;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
