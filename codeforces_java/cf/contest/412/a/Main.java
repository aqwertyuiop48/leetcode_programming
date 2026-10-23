import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && s.next() instanceof String t
            ? k - 1 <= n - k
                ? Stream.concat(Collections.nCopies(k - 1, "LEFT").stream(), IntStream.range(0, n).boxed().flatMap(i -> i < n - 1 ? Stream.of("PRINT " + t.charAt(i), "RIGHT") : Stream.of("PRINT " + t.charAt(i)))).collect(Collectors.joining("\n"))
                : Stream.concat(Collections.nCopies(n - k, "RIGHT").stream(), IntStream.range(0, n).boxed().flatMap(i -> i < n - 1 ? Stream.of("PRINT " + t.charAt(n - 1 - i), "LEFT") : Stream.of("PRINT " + t.charAt(0)))).collect(Collectors.joining("\n")) : "");
    }
}
