import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && (Integer) 500000 instanceof Integer big && new int[big + 1] instanceof int[] spf
            && IntStream.rangeClosed(2, 707).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p, m -> m <= big, m -> m + p).peek(m -> spf[m] = spf[m] == 0 ? p : spf[m]).count() >= 0)
            && IntStream.rangeClosed(2, big).allMatch(i -> (spf[i] = spf[i] == 0 ? i : spf[i]) > 0)
            && new int[big + 1] instanceof int[] cnt && new boolean[n] instanceof boolean[] on && new long[]{0} instanceof long[] ans
            ? IntStream.range(0, q).mapToObj(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer id
                && Stream.iterate(a[id], x -> x > 1, x -> IntStream.iterate(x, y -> y % spf[x] == 0, y -> y / spf[x]).reduce(x, (u, v) -> v / spf[x])).map(x -> spf[x]).distinct().toList() instanceof List<Integer> ps
                && ps.stream().reduce(List.of(new int[]{1, 1}), (ds, p) -> Stream.concat(ds.stream(), ds.stream().map(d -> new int[]{d[0] * p, -d[1]})).toList(), (x, y) -> x) instanceof List<int[]> divs
                && (on[id] ? divs.stream().allMatch(d -> --cnt[d[0]] >= 0 && (ans[0] -= (long) d[1] * cnt[d[0]]) > Long.MIN_VALUE)
                    : divs.stream().allMatch(d -> (ans[0] += (long) d[1] * cnt[d[0]]++) > Long.MIN_VALUE))
                && (on[id] = !on[id]) | true ? String.valueOf(ans[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}
