import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && sc.next() instanceof String t
            && s.chars().map(c -> c - 'a').boxed().collect(Collectors.groupingBy(c -> c, Collectors.counting())) instanceof Map<Integer, Long> cnt
            && ((IntFunction<int[]>) i -> IntStream.range(0, 26).map(c -> (int) (cnt.getOrDefault(c, 0L) - t.substring(0, i).chars().filter(x -> x - 'a' == c).count())).toArray()) instanceof IntFunction<int[]> rem
            ? IntStream.iterate(Math.min(s.length(), t.length()), i -> i >= 0, i -> i - 1).filter(i -> Arrays.stream(rem.apply(i)).allMatch(x -> x >= 0))
                .mapToObj(i -> rem.apply(i) instanceof int[] r
                    ? i == t.length() ? s.length() > t.length() ? t + IntStream.range(0, 26).mapToObj(c -> String.valueOf((char) ('a' + c)).repeat(r[c])).collect(Collectors.joining()) : null
                    : i < s.length() ? IntStream.range(t.charAt(i) - 'a' + 1, 26).filter(c -> r[c] > 0).boxed().findFirst().map(c -> t.substring(0, i) + (char) ('a' + c) + IntStream.range(0, 26).mapToObj(x -> String.valueOf((char) ('a' + x)).repeat(r[x] - (x == c ? 1 : 0))).collect(Collectors.joining())).orElse(null)
                    : null : null)
                .filter(Objects::nonNull).findFirst().orElse("-1")
            : "");
    }
}
