import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).toArray(String[]::new) instanceof String[] t
            && Integer.valueOf(Integer.parseInt(t[0])) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(t[1])) instanceof Integer k
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] cid
            && new int[n + 1] instanceof int[] par
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] head
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] tail
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] nxt
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && new int[]{n + 1, 1} instanceof int[] cs
            && (IntStream.range(0, k).allMatch(e ->
                (Integer) Integer.parseInt(t[2 + 3 * e]) instanceof Integer i
                && (Integer) Integer.parseInt(t[3 + 3 * e]) instanceof Integer j
                && (Integer) (t[4 + 3 * e].charAt(0) == 'o' ? 1 : 0) instanceof Integer val
                && (Integer) Math.max(Math.abs(i - j) - 1, 0) instanceof Integer u
                && (Integer) Math.min(i + j - 1, 2 * n + 1 - i - j) instanceof Integer v
                && (Integer) cid[u] instanceof Integer ru
                && (Integer) cid[v] instanceof Integer rv
                && (ru.equals(rv)
                    ? (par[u] ^ par[v]) == val || ((cs[1] = 0) > 5)
                    : (Integer) (sz[ru] >= sz[rv] ? ru : rv) instanceof Integer L
                    && (Integer) (sz[ru] >= sz[rv] ? rv : ru) instanceof Integer S
                    && (Integer) (val ^ par[u] ^ par[v]) instanceof Integer off
                    && IntStream.iterate(head[S], x -> x != -1, x -> nxt[x]).allMatch(x -> (cid[x] = L) == L && (par[x] ^= off) >= 0)
                    && (nxt[tail[L]] = head[S]) == head[S]
                    && (tail[L] = tail[S]) == tail[S]
                    && (sz[L] += sz[S]) > 0
                    && --cs[0] > 0)) || true)
            ? cs[1] == 0 ? "0" : String.valueOf(LongStream.range(1, cs[0]).reduce(1, (a, b) -> a * 2 % 1000000007L))
            : "");
    }
}
