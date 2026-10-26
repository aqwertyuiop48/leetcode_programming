import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n + 1] instanceof int[] par && new long[n + 1] instanceof long[] a && new long[n + 1] instanceof long[] g0 && new long[n + 1] instanceof long[] g1
            && IntStream.rangeClosed(1, n).allMatch(i -> (par[i] = Integer.parseInt(tk.nextToken())) != 0 && (a[i] = Long.parseLong(tk.nextToken())) != Long.MIN_VALUE && (g1[i] = -1000000000000000000L) < 0)
            ? LongStream.rangeClosed(1, n).map(z -> (Integer) (int) (n + 1 - z) instanceof Integer v
                ? (Long) g0[v] instanceof Long d0 && (Long) Math.max(g1[v], g0[v] + a[v]) instanceof Long d1
                    && (par[v] < 0 || (Long) Math.max(g0[par[v]] + d0, g1[par[v]] + d1) instanceof Long n0 && (Long) Math.max(g0[par[v]] + d1, g1[par[v]] + d0) instanceof Long n1
                        && (g0[par[v]] = Math.max(n0, -1000000000000000000L)) > Long.MIN_VALUE && (g1[par[v]] = Math.max(n1, -1000000000000000000L)) > Long.MIN_VALUE)
                    ? par[v] < 0 ? Math.max(d0, d1) : 0 : 0 : 0).max().getAsLong() : 0);
    }
}
