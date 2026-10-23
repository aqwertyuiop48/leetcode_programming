import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[n + 1] instanceof int[] t1 && IntStream.rangeClosed(1, n).allMatch(i -> (t1[i] = i & -i) > 0)
            && new int[m + 1] instanceof int[] t2 && new int[n + 1] instanceof int[] last && new int[n + 1] instanceof int[] perm && new int[]{0, 1, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(1, m).allMatch(t -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer y
                && (last[x] == 0
                    ? y > st[0] && y <= n && (st[2] = 0) == 0 && (st[3] = y - st[0]) > 0
                        && IntStream.iterate(20, q -> q >= 0, q -> q - 1).allMatch(q -> st[2] + (1 << q) > n || t1[st[2] + (1 << q)] >= st[3] || ((st[2] += 1 << q) > 0 && (st[3] -= t1[st[2]]) >= 0))
                        && (perm[st[2] + 1] = x) > 0
                        && IntStream.iterate(st[2] + 1, q -> q <= n, q -> q + (q & -q)).allMatch(q -> --t1[q] >= 0)
                        && IntStream.iterate(t, q -> q <= m, q -> q + (q & -q)).allMatch(q -> ++t2[q] > 0) && (last[x] = t) > 0 && ++st[0] > 0
                    : (Integer) IntStream.iterate(last[x], q -> q > 0, q -> q - (q & -q)).map(q -> t2[q]).sum() instanceof Integer pr && 1 + st[0] - pr == y
                        && IntStream.iterate(last[x], q -> q <= m, q -> q + (q & -q)).allMatch(q -> --t2[q] >= 0)
                        && IntStream.iterate(t, q -> q <= m, q -> q + (q & -q)).allMatch(q -> ++t2[q] > 0) && (last[x] = t) > 0)
                || (st[1] = 0) < 0)
            && IntStream.rangeClosed(1, n).filter(x -> last[x] == 0).iterator() instanceof PrimitiveIterator.OfInt it
            && IntStream.rangeClosed(1, n).allMatch(s -> perm[s] != 0 || (perm[s] = it.nextInt()) > 0)
            ? IntStream.rangeClosed(1, n).mapToObj(s -> String.valueOf(perm[s])).collect(Collectors.joining(" ")) : "-1");
    }
}
