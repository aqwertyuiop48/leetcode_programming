import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) Long.parseLong(tk.nextToken()) instanceof Long c && (Long) Long.parseLong(tk.nextToken()) instanceof Long d
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()) - c, Long.parseLong(tk.nextToken()) - d}).toArray(long[][]::new) instanceof long[][] pts
            && ((ToIntFunction<long[]>) a -> a[1] > 0 || (a[1] == 0 && a[0] > 0) ? 0 : 1) instanceof ToIntFunction<long[]> half
            && ((Comparator<long[]>) (a, b) -> half.applyAsInt(a) != half.applyAsInt(b) ? half.applyAsInt(a) - half.applyAsInt(b) : Long.compare(0, a[0] * b[1] - a[1] * b[0])) instanceof Comparator<long[]> cmp
            && Arrays.stream(pts).sorted(cmp).toArray(long[][]::new) instanceof long[][] s
            && IntStream.range(0, n).filter(i -> i == 0 || cmp.compare(s[i - 1], s[i]) != 0).toArray() instanceof int[] st
            && (Integer) st.length instanceof Integer D
            && IntStream.range(0, D).mapToLong(g -> (g + 1 < D ? st[g + 1] : n) - st[g]).toArray() instanceof long[] cn
            && new long[2 * D + 1] instanceof long[] P && new long[2 * D + 1] instanceof long[] Q
            && IntStream.range(0, 2 * D).allMatch(k -> (P[k + 1] = P[k] + cn[k % D]) >= 0 && (Q[k + 1] = Q[k] + cn[k % D] * (cn[k % D] - 1) / 2) >= 0)
            && ((BiPredicate<Integer, Integer>) (i, j) -> (Long) (s[st[i]][0] * s[st[j]][1] - s[st[i]][1] * s[st[j]][0]) instanceof Long cr
                && (cr > 0 || (cr == 0 && s[st[i]][0] * s[st[j]][0] + s[st[i]][1] * s[st[j]][1] < 0))) instanceof BiPredicate<Integer, Integer> inR
            && new int[]{0} instanceof int[] ptr
            && (Long) Arrays.stream(cn).map(x -> x * x).sum() instanceof Long s2 && (Long) Arrays.stream(cn).map(x -> x * x * x).sum() instanceof Long s3
            ? (Long) (((long) n * n * n - 3L * n * s2 + 2 * s3) / 6) - IntStream.range(0, D).mapToLong(i -> (Integer) Math.max(ptr[0], i + 1) instanceof Integer j0
                && (Integer) (int) (j0 + IntStream.iterate(j0, jj -> jj < i + D && inR.test(i, jj % D), jj -> jj + 1).count()) instanceof Integer je && (ptr[0] = je) >= 0
                && (Long) (P[je] - P[i + 1]) instanceof Long m && (Long) (Q[je] - Q[i + 1]) instanceof Long q2
                ? cn[i] * (m * (m - 1) / 2 - q2) : 0).sum() : 0);
    }
}
