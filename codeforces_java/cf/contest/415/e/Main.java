import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1 << 16).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(1 << n) instanceof Integer len
            && IntStream.range(0, len).mapToLong(i -> 2L * it.nextInt()).toArray() instanceof long[] b
            && new long[n + 1] instanceof long[] inv && new long[n + 1] instanceof long[] rev && new boolean[n + 1] instanceof boolean[] flip
            && IntStream.rangeClosed(1, n).allMatch(k -> Integer.valueOf(1 << (k - 1)) instanceof Integer half
                && (inv[k] = IntStream.range(0, len).parallel().filter(j -> (j & half) != 0).mapToLong(j -> half - (-Arrays.binarySearch(b, j & -(half << 1), (j & -(half << 1)) + half, b[j] + 1) - 1 - (j & -(half << 1)))).sum()) >= 0
                && (rev[k] = IntStream.range(0, len).parallel().filter(j -> (j & half) != 0).mapToLong(j -> -Arrays.binarySearch(b, j & -(half << 1), (j & -(half << 1)) + half, b[j] - 1) - 1 - (j & -(half << 1))).sum()) >= 0
                && IntStream.range(0, len >> k).parallel().peek(blk -> Arrays.sort(b, blk << k, (blk + 1) << k)).asLongStream().sum() >= 0)
            && Integer.valueOf(it.nextInt()) instanceof Integer m
            ? IntStream.range(0, m).map(i -> it.nextInt()).mapToObj(q -> IntStream.rangeClosed(1, n).allMatch(k -> k > q || (flip[k] = !flip[k]) || true) ? String.valueOf(LongStream.rangeClosed(1, n).map(k -> flip[(int) k] ? rev[(int) k] : inv[(int) k]).sum()) : "").collect(Collectors.joining("\n")) : "");
    }
}
