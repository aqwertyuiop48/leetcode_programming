import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && (Integer) s.nextInt() instanceof Integer x
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] g
            && IntStream.range(0, n * m).filter(p -> g[p / m].charAt(p % m) == 'S').toArray() instanceof int[] sp
            && IntStream.generate(() -> Integer.MAX_VALUE).limit(26).toArray() instanceof int[] best
            && new boolean[26] instanceof boolean[] ex
            && IntStream.range(0, n * m).filter(p -> g[p / m].charAt(p % m) != 'S').allMatch(p ->
                (ex[g[p / m].charAt(p % m) - 'a'] = true)
                && (best[g[p / m].charAt(p % m) - 'a'] = Math.min(best[g[p / m].charAt(p % m) - 'a'],
                    Arrays.stream(sp).map(q -> (p / m - q / m) * (p / m - q / m) + (p % m - q % m) * (p % m - q % m)).min().orElse(Integer.MAX_VALUE))) > 0)
            && (Integer) s.nextInt() instanceof Integer len
            && s.next() instanceof String text
            ? text.chars().anyMatch(ch -> Character.isUpperCase(ch) ? best[ch - 'A'] == Integer.MAX_VALUE : !ex[ch - 'a'])
                ? "-1"
                : String.valueOf(text.chars().filter(ch -> Character.isUpperCase(ch) && best[ch - 'A'] > x * x).count())
            : ""));
    }
}



