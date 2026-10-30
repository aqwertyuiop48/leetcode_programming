import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && (Function<String, Long>) (e -> Arrays.stream(e.split("[+]")).mapToLong(t -> Arrays.stream(t.split("[*]")).mapToLong(Long::parseLong).reduce(1L, (u, v) -> u * v)).sum()) instanceof Function<String, Long> ev
            ? IntStream.rangeClosed(0, s.length()).filter(l -> l == 0 || s.charAt(l - 1) == '*').boxed().flatMapToLong(l -> IntStream.rangeClosed(l + 1, s.length()).filter(r -> r == s.length() || s.charAt(r) == '*')
                .mapToLong(r -> ev.apply(s.substring(0, l) + ev.apply(s.substring(l, r)) + s.substring(r)))).max().getAsLong() : 0);
    }
}
