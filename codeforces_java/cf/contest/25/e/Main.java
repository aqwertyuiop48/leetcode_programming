import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Stream.of(s.next(), s.next(), s.next()).toList() instanceof List<String> t
            && ((BinaryOperator<String>) (a, b) -> a.contains(b) ? a : b.contains(a) ? b
                : a + b.substring(IntStream.rangeClosed(0, Math.min(a.length(), b.length()))
                    .filter(k -> a.regionMatches(a.length() - k, b, 0, k)).max().getAsInt())) instanceof BinaryOperator<String> m
            ? Stream.of(new int[]{0, 1, 2}, new int[]{0, 2, 1}, new int[]{1, 0, 2}, new int[]{1, 2, 0}, new int[]{2, 0, 1}, new int[]{2, 1, 0})
                .mapToInt(q -> m.apply(m.apply(t.get(q[0]), t.get(q[1])), t.get(q[2])).length()).min().getAsInt()
            : 0));
    }
}

