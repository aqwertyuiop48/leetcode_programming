import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                IntStream.range(0, nm[0]).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] rows
                && IntStream.range(0, nm[0]).allMatch(r -> rows[r].chars().distinct().count() == 1)
                && IntStream.range(1, nm[0]).allMatch(r -> rows[r].charAt(0) != rows[r - 1].charAt(0))
                ? "YES"
                : "NO")));
    }
}



