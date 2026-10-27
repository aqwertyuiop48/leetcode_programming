import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && IntStream.range(0, n).mapToObj(i -> new StringBuilder(new String(g[n - 1 - i])).reverse().toString().toCharArray()).toArray(char[][]::new) instanceof char[][] rot
            && ((Function<char[][], int[]>) h ->
                new int[n] instanceof int[] rp
                && new int[n] instanceof int[] cp
                && new int[1] instanceof int[] cnt
                && IntStream.range(0, n).allMatch(i ->
                    IntStream.iterate(n - 1, j -> j > i, j -> j - 1).allMatch(j ->
                        ((h[i][j] - '0') ^ rp[i] ^ cp[j]) == 0
                        || ((rp[i] ^= 1) >= 0 && (cp[j] ^= 1) >= 0 && ++cnt[0] > 0)))
                ? IntStream.rangeClosed(0, n).map(i -> i == n ? cnt[0] : rp[i] ^ cp[i]).toArray()
                : null) instanceof Function<char[][], int[]> solve
            && solve.apply(g) instanceof int[] a
            && solve.apply(rot) instanceof int[] b
            ? a[n] + b[n] + IntStream.range(0, n).filter(i -> ((g[i][i] - '0') ^ a[i] ^ b[n - 1 - i]) == 1).count()
            : 0L);
    }
}

