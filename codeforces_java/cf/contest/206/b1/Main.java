import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> Math.min(sc.nextInt(), n)).toArray() instanceof int[] a
            && Integer.valueOf(2 * n) instanceof Integer N && IntStream.range(0, N).map(i -> Math.min(i + a[i % n], N - 1)).toArray() instanceof int[] rc
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(N)) instanceof Integer K && new int[K][] instanceof int[][] sp && (sp[0] = IntStream.range(0, N).toArray()) != null
            && IntStream.range(1, K).allMatch(k -> (sp[k] = IntStream.range(0, N).map(i -> i + (1 << k) > N || rc[sp[k - 1][i]] >= rc[sp[k - 1][i + (1 << (k - 1))]] ? sp[k - 1][i] : sp[k - 1][i + (1 << (k - 1))]).toArray()) != null)
            && new int[K][] instanceof int[][] up
            && (up[0] = IntStream.range(0, N).map(i -> Integer.valueOf(31 - Integer.numberOfLeadingZeros(rc[i] - i + 1)) instanceof Integer g
                ? (rc[sp[g][i]] >= rc[sp[g][rc[i] - (1 << g) + 1]] ? sp[g][i] : sp[g][rc[i] - (1 << g) + 1]) : 0).toArray()) != null
            && IntStream.range(1, K).allMatch(j -> (up[j] = IntStream.range(0, N).map(i -> up[j - 1][up[j - 1][i]]).toArray()) != null)
            ? n == 1 ? 0 : LongStream.range(0, n).map(s -> rc[(int) s] >= s + n - 1 ? 1
                : IntStream.iterate(K - 1, j -> j >= 0, j -> j - 1).boxed().reduce(new int[]{(int) s, 0}, (st, j) -> rc[up[j][st[0]]] < s + n - 1 ? new int[]{up[j][st[0]], st[1] + (1 << j)} : st, (x, y) -> x)[1] + 2).sum() : "");
    }
}
