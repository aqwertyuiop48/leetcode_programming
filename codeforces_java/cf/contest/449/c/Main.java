import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new boolean[n + 2] instanceof boolean[] used
            && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt
            && ((java.util.function.Predicate<List<Integer>>) l -> IntStream.range(0, l.size() / 2).allMatch(i -> (used[l.get(2 * i)] = used[l.get(2 * i + 1)] = true) && sb.append(l.get(2 * i)).append(' ').append(l.get(2 * i + 1)).append('\n') != null && ++cnt[0] > 0)) instanceof java.util.function.Predicate<List<Integer>> pairUp
            && IntStream.iterate(n / 2, p -> p >= 3, p -> p - 1).filter(p -> IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(d -> p % d == 0))
                .allMatch(p -> IntStream.iterate(p, x -> x <= n, x -> x + p).filter(x -> !used[x]).boxed().collect(Collectors.toList()) instanceof List<Integer> l
                    && (l.size() % 2 == 0 || l.remove(Integer.valueOf(2 * p))) && pairUp.test(l))
            && pairUp.test(IntStream.iterate(2, x -> x <= n, x -> x + 2).filter(x -> !used[x]).boxed().toList())
            ? cnt[0] + "\n" + sb.toString().trim() : "");
    }
}
