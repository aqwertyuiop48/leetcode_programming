import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && new boolean[n] instanceof boolean[] v && new int[n] instanceof int[] st && new int[n] instanceof int[] en && new int[n + 2] instanceof int[] g
            && IntStream.range(1, n - 1).allMatch(i -> (v[i] = s.charAt(i - 1) == s.charAt(i + 1)) || true)
            && IntStream.range(0, n).allMatch(i -> (st[i] = !v[i] ? -1 : i > 0 && v[i - 1] ? st[i - 1] : i) > -2)
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (en[i] = !v[i] ? -1 : i < n - 1 && v[i + 1] ? en[i + 1] : i) > -2)
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(1, len).map(j -> g[Math.max(0, j - 2)] ^ g[Math.max(0, len - j - 1)]).boxed().collect(Collectors.toSet()) instanceof Set<Integer> seen
                && (g[len] = IntStream.iterate(0, x -> x + 1).filter(x -> !seen.contains(x)).findFirst().getAsInt()) >= 0)
            && Integer.valueOf(IntStream.range(0, n).filter(i -> v[i] && st[i] == i).map(i -> g[en[i] - i + 1]).reduce(0, (a, b) -> a ^ b)) instanceof Integer X
            ? IntStream.range(0, n).filter(i -> v[i] && (X ^ g[en[i] - st[i] + 1] ^ g[Math.max(0, i - st[i] - 1)] ^ g[Math.max(0, en[i] - i - 1)]) == 0)
                .mapToObj(i -> "First\n" + (i + 1)).findFirst().orElse("Second") : "");
    }
}
