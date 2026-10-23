import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next().toCharArray() instanceof char[] c && (Integer) c.length instanceof Integer n
            && new int[n] instanceof int[] pi
            && IntStream.range(1, n).allMatch(i -> IntStream.iterate(pi[i - 1], k -> k > 0 && c[i] != c[k], k -> pi[k - 1]).reduce((x, y) -> y) instanceof OptionalInt last
                && (Integer) (last.isPresent() ? pi[last.getAsInt() - 1] : pi[i - 1]) instanceof Integer ks && (pi[i] = ks + (c[i] == c[ks] ? 1 : 0)) >= 0)
            && new int[n + 1] instanceof int[] occ && IntStream.rangeClosed(1, n).allMatch(l -> (occ[l] = 1) > 0)
            && IntStream.rangeClosed(1, n).map(l -> n + 1 - l).allMatch(l -> (occ[pi[l - 1]] += occ[l]) > 0)
            && IntStream.iterate(n, l -> l > 0, l -> pi[l - 1]).boxed().sorted().toList() instanceof List<Integer> ls
            ? ls.size() + ls.stream().map(l -> "\n" + l + " " + occ[l]).collect(Collectors.joining()) : "");
    }
}
