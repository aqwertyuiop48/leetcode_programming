import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a && (Integer) (2 * n) instanceof Integer N
            && IntStream.range(0, N).map(i -> Math.max(0, i - a[i % n])).toArray() instanceof int[] key && (Integer) (32 - Integer.numberOfLeadingZeros(N)) instanceof Integer K
            && new int[K][] instanceof int[][] sp && (sp[0] = IntStream.range(0, N).toArray()) != null
            && IntStream.range(1, K).allMatch(k -> (sp[k] = IntStream.range(0, N).map(i -> i + (1 << k) > N || key[sp[k - 1][i]] <= key[sp[k - 1][i + (1 << (k - 1))]] ? sp[k - 1][i] : sp[k - 1][i + (1 << (k - 1))]).toArray()) != null)
            && new int[K][] instanceof int[][] up
            && (up[0] = IntStream.range(0, N).map(i -> (Integer) (31 - Integer.numberOfLeadingZeros(i - key[i] + 1)) instanceof Integer g
                ? (key[sp[g][key[i]]] <= key[sp[g][i - (1 << g) + 1]] ? sp[g][key[i]] : sp[g][i - (1 << g) + 1]) : 0).toArray()) != null
            && IntStream.range(1, K).allMatch(j -> (up[j] = IntStream.range(0, N).map(i -> up[j - 1][up[j - 1][i]]).toArray()) != null)
            ? LongStream.range(n - 1, N - 1).map(e -> key[(int) e] <= e - n + 1 ? 1L
                : IntStream.iterate(K - 1, j -> j >= 0, j -> j - 1).boxed().reduce(new int[]{(int) e, 0}, (st, j) -> key[up[j][st[0]]] > e - n + 1 ? new int[]{up[j][st[0]], st[1] + (1 << j)} : st, (x, y) -> x)[1] + 2L).sum() : "");
    }
}
