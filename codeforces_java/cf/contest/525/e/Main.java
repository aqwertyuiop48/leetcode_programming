import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer k && (Long) sc.nextLong() instanceof Long s
            && IntStream.range(0, n).mapToLong(i -> sc.nextLong()).toArray() instanceof long[] a
            && (Long) (s + 1) instanceof Long cap
            && new long[19] instanceof long[] fact && (fact[0] = 1) > 0 && IntStream.rangeClosed(1, 18).allMatch(i -> (fact[i] = fact[i - 1] * i) > 0)
            && ((BiFunction<Integer, Integer, long[]>) (from, to) -> IntStream.range(from, to).boxed().reduce(new long[]{0}, (cur, i) -> new int[3] instanceof int[] p ?
                    IntStream.range(0, cur.length * 3).mapToLong(t -> (Long) (p[0] < cur.length ? cur[p[0]] : Long.MAX_VALUE) instanceof Long v0
                        && (Long) (p[1] < cur.length ? (Math.min((cur[p[1]] >> 6) + a[i], cap) << 6) | (cur[p[1]] & 62) : Long.MAX_VALUE) instanceof Long v1
                        && (Long) (p[2] < cur.length ? (Math.min((cur[p[2]] >> 6) + (a[i] <= 18 ? fact[(int) a[i]] : cap), cap) << 6) | ((cur[p[2]] & 62) + 2) : Long.MAX_VALUE) instanceof Long v2
                        ? (v0 <= v1 && v0 <= v2 ? (p[0]++ >= 0 ? v0 : 0L) : v1 <= v2 ? (p[1]++ >= 0 ? v1 : 0L) : (p[2]++ >= 0 ? v2 : 0L)) : 0L).toArray() : cur, (x, y) -> x)) instanceof BiFunction<Integer, Integer, long[]> enumerate
            && enumerate.apply(0, n / 2) instanceof long[] L && enumerate.apply(n / 2, n) instanceof long[] right
            ? Arrays.stream(right).map(key -> (Long) (s - (key >> 6)) instanceof Long rem && (Integer) (k - (int) ((key >> 1) & 31)) instanceof Integer left2 && rem >= 0 && left2 >= 0
                ? (long) (Arrays.binarySearch(L, (rem << 6) - 1) - Arrays.binarySearch(L, (rem << 6) + (left2 << 1) + 1)) : 0).sum() : 0);
    }
}
