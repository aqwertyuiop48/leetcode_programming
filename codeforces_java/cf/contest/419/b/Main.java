import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.next().equals("+") ? 1 : 0, s.nextInt()}).toArray(int[][]::new) instanceof int[][] ev
            && new int[n + 1] instanceof int[] seen && new int[n + 1] instanceof int[] start && new long[n + 1] instanceof long[] p && new boolean[n + 1] instanceof boolean[] on
            && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, m).allMatch(i -> ev[i][0] == 1 ? (seen[ev[i][1]] = 1) > 0 : seen[ev[i][1]] != 0 || ((seen[ev[i][1]] = 1) > 0 && (on[ev[i][1]] = true) && ++st[0] > 0))
            && (st[1] = st[0] > 0 ? 1 : 0) >= 0
            && IntStream.rangeClosed(1, m).allMatch(i -> (ev[i - 1][0] == 1 ? (on[ev[i - 1][1]] = true) && (start[ev[i - 1][1]] = i) > 0 && ++st[0] > 0 : (p[ev[i - 1][1]] += i - start[ev[i - 1][1]]) >= 0 && !(on[ev[i - 1][1]] = false) && --st[0] >= 0) && (st[1] += st[0] > 0 ? 1 : 0) > 0)
            && IntStream.rangeClosed(1, n).allMatch(x -> !on[x] || (p[x] += m + 1 - start[x]) >= 0)
            && IntStream.rangeClosed(1, n).filter(x -> true).boxed().toList() instanceof List<Integer> all
            ? all.stream().filter(x -> seen[x] == 0 || p[x] == st[1]).toList() instanceof List<Integer> r
                ? r.size() + (r.isEmpty() ? "" : "\n" + r.stream().map(String::valueOf).collect(Collectors.joining(" "))) : "" : "");
    }
}
