import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && Integer.valueOf(s.length()) instanceof Integer n && new int[n] instanceof int[] pi && new long[n + 1] instanceof long[] cnt
            && IntStream.range(1, n).allMatch(i -> IntStream.iterate(pi[i - 1], k -> k > 0 && s.charAt(k) != s.charAt(i), k -> pi[k - 1]).reduce((x, y) -> y) instanceof OptionalInt la
                && Integer.valueOf(la.isPresent() ? pi[la.getAsInt() - 1] : pi[i - 1]) instanceof Integer kk
                && (pi[i] = kk + (s.charAt(kk) == s.charAt(i) ? 1 : 0)) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (cnt[i] = 1) > 0)
            && IntStream.iterate(n, i -> i > 0, i -> i - 1).allMatch(i -> pi[i - 1] == 0 || (cnt[pi[i - 1]] += cnt[i]) > 0)
            && IntStream.iterate(n, k -> k > 0, k -> pi[k - 1]).boxed().sorted().toList() instanceof List<Integer> lens
            ? lens.size() + "\n" + lens.stream().map(l -> l + " " + cnt[l]).collect(Collectors.joining("\n")) : "");
    }
}
