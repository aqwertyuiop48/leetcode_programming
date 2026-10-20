import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it
            && it.next() instanceof String s && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> new String[]{it.next(), it.next(), it.next()}).toArray(String[][]::new) instanceof String[][] rules
            && Integer.valueOf(s.length() + Arrays.stream(rules).mapToInt(r -> r[0].length()).sum()) instanceof Integer total && Integer.valueOf(2 * total + 5) instanceof Integer MS
            && new int[26 * MS] instanceof int[] nxt && new int[MS] instanceof int[] len && new int[MS] instanceof int[] link && new int[]{1} instanceof int[] sz && (link[0] = -1) == -1
            && ((IntBinaryOperator) (q, l) -> Integer.valueOf(sz[0]++) instanceof Integer c && (len[c] = l) >= 0 && (link[c] = link[q]) >= -1 && IntStream.range(0, 26).allMatch(i -> (nxt[c * 26 + i] = nxt[q * 26 + i]) >= 0) ? c : -1) instanceof IntBinaryOperator cloneSt
            && ((IntBinaryOperator) (last, ch) -> nxt[last * 26 + ch] != 0
                ? Integer.valueOf(nxt[last * 26 + ch]) instanceof Integer q
                    ? len[q] == len[last] + 1 ? q
                        : Integer.valueOf(cloneSt.applyAsInt(q, len[last] + 1)) instanceof Integer cl && (link[q] = cl) >= 0 && IntStream.iterate(last, p -> p != -1 && nxt[p * 26 + ch] == q, p -> link[p]).allMatch(p -> (nxt[p * 26 + ch] = cl) > 0) ? cl : -1
                    : -1
                : Integer.valueOf(sz[0]++) instanceof Integer cur && (len[cur] = len[last] + 1) > 0
                    && IntStream.iterate(last, p -> p != -1 && nxt[p * 26 + ch] == 0, p -> link[p]).allMatch(p -> (nxt[p * 26 + ch] = cur) > 0)
                    && Integer.valueOf(link[IntStream.iterate(last, p -> p != -1 && nxt[p * 26 + ch] == cur, p -> link[p]).reduce(last, (x, y) -> y)]) instanceof Integer p0
                    ? p0 == -1 ? (link[cur] = 0) >= 0 ? cur : -1
                        : Integer.valueOf(nxt[p0 * 26 + ch]) instanceof Integer q
                            ? len[q] == len[p0] + 1 ? (link[cur] = q) >= 0 ? cur : -1
                                : Integer.valueOf(cloneSt.applyAsInt(q, len[p0] + 1)) instanceof Integer cl && (link[q] = cl) >= 0 && (link[cur] = cl) >= 0
                                    && IntStream.iterate(p0, p -> p != -1 && nxt[p * 26 + ch] == q, p -> link[p]).allMatch(p -> (nxt[p * 26 + ch] = cl) > 0) ? cur : -1
                            : -1
                    : -1) instanceof IntBinaryOperator extend
            && s.chars().map(ch -> ch - 'a').reduce(0, (last, ch) -> extend.applyAsInt(last, ch)) >= 0
            && Arrays.stream(rules).allMatch(r -> r[0].chars().map(ch -> ch - 'a').reduce(0, (last, ch) -> extend.applyAsInt(last, ch)) >= 0)
            && Integer.valueOf(sz[0]) instanceof Integer cntS
            && IntStream.range(0, cntS).boxed().sorted((x, y) -> len[y] - len[x]).mapToInt(Integer::intValue).toArray() instanceof int[] order
            && new boolean[cntS] instanceof boolean[] ok && IntStream.range(1, cntS).allMatch(v -> (ok[v] = true))
            && new int[cntS] instanceof int[] cnt
            && ((BiPredicate<String, int[]>) (str, lr) -> IntStream.range(0, cntS).allMatch(v -> (cnt[v] = 0) == 0)
                && str.chars().map(ch -> ch - 'a').reduce(0, (v, ch) -> Integer.valueOf(nxt[v * 26 + ch]) instanceof Integer w && ++cnt[w] > 0 ? w : 0) >= 0
                && Arrays.stream(order).allMatch(v -> v == 0 || (cnt[link[v]] += cnt[v]) >= 0)
                && IntStream.range(1, cntS).allMatch(v -> (ok[v] &= cnt[v] >= lr[0] && cnt[v] <= lr[1]) || true)) instanceof BiPredicate<String, int[]> apply
            && apply.test(s, new int[]{1, Integer.MAX_VALUE})
            && Arrays.stream(rules).allMatch(r -> apply.test(r[0], new int[]{Integer.parseInt(r[1]), Integer.parseInt(r[2])}))
            ? String.valueOf(IntStream.range(1, cntS).filter(v -> ok[v]).mapToLong(v -> len[v] - len[link[v]]).sum()) : "");
    }
}
