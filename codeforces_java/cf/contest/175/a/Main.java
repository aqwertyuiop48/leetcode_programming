import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && ((Predicate<String>) p -> p.length() == 1 || (p.length() <= 7 && p.charAt(0) != '0' && Long.parseLong(p) <= 1_000_000)) instanceof Predicate<String> ok
            ? IntStream.range(1, s.length()).boxed().flatMap(i -> IntStream.range(i + 1, s.length()).mapToObj(j -> new int[]{i, j}))
                .filter(c -> ok.test(s.substring(0, c[0])) && ok.test(s.substring(c[0], c[1])) && ok.test(s.substring(c[1])))
                .mapToLong(c -> Long.parseLong(s.substring(0, c[0])) + Long.parseLong(s.substring(c[0], c[1])) + Long.parseLong(s.substring(c[1]))).max().orElse(-1)
            : 0);
    }
}
