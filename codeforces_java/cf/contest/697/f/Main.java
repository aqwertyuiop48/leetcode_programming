import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Long.valueOf(sc.nextLong()) instanceof Long l
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new int[202 * 26] instanceof int[] g && new long[202] instanceof long[] val && new int[202] instanceof int[] fail && new int[202] instanceof int[] q && new int[]{0, 0, 1} instanceof int[] st
            && IntStream.range(0, n).filter(i -> (st[0] = 0) == 0 && sc.next().chars().filter(ch -> (g[st[0] * 26 + ch - 97] > 0 || (g[st[0] * 26 + ch - 97] = ++st[1]) > 0) && (st[0] = g[st[0] * 26 + ch - 97]) >= 0).count() >= 0
                && (val[st[0]] += a[i]) > 0).count() >= 0
            && Integer.valueOf(st[1] + 1) instanceof Integer S
            && IntStream.range(0, S).filter(i -> Integer.valueOf(q[i]) instanceof Integer v
                && IntStream.range(0, 26).filter(c -> g[v * 26 + c] > 0 ? (fail[g[v * 26 + c]] = v == 0 ? 0 : g[fail[v] * 26 + c]) >= 0 && (val[g[v * 26 + c]] += val[fail[g[v * 26 + c]]]) >= 0 && (q[st[2]++] = g[v * 26 + c]) > 0
                    : (g[v * 26 + c] = v == 0 ? 0 : g[fail[v] * 26 + c]) >= 0).count() >= 0).count() >= 0
            && new long[S * S] instanceof long[] m0 && Arrays.stream(new long[S * S]).map(x -> -2000000000000000000L).toArray() instanceof long[] m1
            && IntStream.range(0, S * 26).filter(c -> (m1[(c / 26) * S + g[c]] = Math.max(m1[(c / 26) * S + g[c]], val[g[c]])) >= 0).count() >= 0
            && new long[][]{m1, IntStream.range(0, S).mapToLong(i -> i == 0 ? 0 : -2000000000000000000L).toArray()} instanceof long[][] hold
            && (IntStream.range(0, 47).allMatch(b -> (((l >> b) & 1) == 0 || (hold[1] = IntStream.range(0, S).mapToLong(j -> IntStream.range(0, S).mapToLong(i -> Math.max(-2000000000000000000L, hold[1][i] + hold[0][i * S + j])).max().getAsLong()).toArray()) != null)
                && ((l >> (b + 1)) != 0 && Arrays.stream(new long[S * S]).map(x -> -2000000000000000000L).toArray() instanceof long[] C
                    && IntStream.range(0, S).parallel().filter(i -> IntStream.range(0, S).filter(k -> hold[0][i * S + k] > -1000000000000000000L
                        && IntStream.range(0, S).filter(j -> (C[i * S + j] = Math.max(C[i * S + j], hold[0][i * S + k] + hold[0][k * S + j])) > 0 || true).count() >= 0).count() >= 0).count() >= 0
                    && (hold[0] = C) != null))
            || true) ? Arrays.stream(hold[1]).max().getAsLong() : "");
    }
}
