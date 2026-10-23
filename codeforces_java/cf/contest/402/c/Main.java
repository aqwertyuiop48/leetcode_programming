import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer t
            ? IntStream.range(0, t).mapToObj(q -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer p
                ? IntStream.rangeClosed(1, n).boxed().flatMap(i -> IntStream.rangeClosed(i + 1, n).mapToObj(j -> i + " " + j)).limit(2 * n + p).collect(Collectors.joining("\n")) : "")
                .collect(Collectors.joining("\n")) : "");
    }
}
