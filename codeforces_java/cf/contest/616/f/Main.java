import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).toArray(String[]::new) instanceof String[] s
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] c
            && Integer.valueOf(Arrays.stream(s).mapToInt(String::length).sum() * 2 + 4) instanceof Integer S
            && new int[26 * S] instanceof int[] nx && new int[S] instanceof int[] ln && new int[S] instanceof int[] lk && new long[S] instanceof long[] w
            && new int[]{1, 0} instanceof int[] sc && (lk[0] = -1) == -1
            && ((IntBinaryOperator) (q, len) -> Integer.valueOf(sc[0]++) instanceof Integer cl
                && IntStream.range(0, 26).allMatch(j -> (nx[cl * 26 + j] = nx[q * 26 + j]) >= 0) && (ln[cl] = len) > 0 && (lk[cl] = lk[q]) >= 0 ? cl : -1) instanceof IntBinaryOperator mk
            && ((ToLongFunction<int[]>) a -> IntStream.iterate(a[0], p -> p != -1 && nx[p * 26 + a[1]] == a[2], p -> lk[p]).filter(p -> (nx[p * 26 + a[1]] = a[3]) > 0).count()) instanceof ToLongFunction<int[]> rd
            && ((IntBinaryOperator) (last, ch) -> Integer.valueOf(nx[last * 26 + ch]) instanceof Integer q
                ? (q != 0
                    ? (ln[q] == ln[last] + 1 ? q
                        : Integer.valueOf(mk.applyAsInt(q, ln[last] + 1)) instanceof Integer cl && (lk[q] = cl) > 0 && rd.applyAsLong(new int[]{last, ch, q, cl}) >= 0 ? cl : -1)
                    : Integer.valueOf(sc[0]++) instanceof Integer cur && (ln[cur] = ln[last] + 1) > 0
                        && IntStream.iterate(last, p -> p != -1 && nx[p * 26 + ch] == 0, p -> lk[p]).peek(p -> nx[p * 26 + ch] = cur).reduce((a, b) -> b) instanceof OptionalInt lv
                        && Integer.valueOf(lv.isPresent() ? lk[lv.getAsInt()] : last) instanceof Integer pe
                        && (pe == -1 ? (lk[cur] = 0) == 0
                            : Integer.valueOf(nx[pe * 26 + ch]) instanceof Integer q2
                                && (ln[pe] + 1 == ln[q2] ? (lk[cur] = q2) > 0
                                    : Integer.valueOf(mk.applyAsInt(q2, ln[pe] + 1)) instanceof Integer cl2
                                        && (lk[q2] = cl2) > 0 && (lk[cur] = cl2) > 0 && rd.applyAsLong(new int[]{pe, ch, q2, cl2}) >= 0))
                        ? cur : -1)
                : -1) instanceof IntBinaryOperator ext
            && IntStream.range(0, n).allMatch(i -> (sc[1] = 0) == 0
                && IntStream.range(0, s[i].length()).allMatch(j -> (sc[1] = ext.applyAsInt(sc[1], s[i].charAt(j) - 97)) > 0 && (w[sc[1]] += c[i]) == w[sc[1]]))
            && IntStream.range(1, sc[0]).mapToLong(v -> ((long) ln[v] << 21) | v).sorted().toArray() instanceof long[] ord
            && new long[1] instanceof long[] best
            && IntStream.iterate(ord.length - 1, k -> k >= 0, k -> k - 1).allMatch(k -> Integer.valueOf((int) (ord[k] & 2097151L)) instanceof Integer v
                && (w[lk[v]] += w[v]) == w[lk[v]] && (best[0] = Math.max(best[0], ln[v] * w[v])) >= 0)
            ? best[0] : "");
    }
}
