import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String t
            ? IntStream.rangeClosed(0, t.length()).boxed()
                .flatMap(p -> IntStream.rangeClosed('a', 'z').mapToObj(c -> t.substring(0, p) + (char) c + t.substring(p)))
                .filter(w -> new StringBuilder(w).reverse().toString().equals(w)).findFirst().orElse("NA")
            : "");
    }
}
