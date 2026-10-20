import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n && Integer.valueOf((int) Math.sqrt(n)) instanceof Integer s
            && new int[]{1, 2, 1, 4, 3, 2, 1, 5, 6, 2, 1, 8, 7, 5, 9, 8, 7, 3, 4, 7, 4, 2, 1, 10, 9, 3, 6, 11, 12} instanceof int[] g && new boolean[s + 2] instanceof boolean[] mark && new long[2] instanceof long[] st
            && IntStream.rangeClosed(2, s).allMatch(x -> mark[x] || (Integer.valueOf((int) LongStream.iterate(x, p -> p <= n, p -> p * x).count()) instanceof Integer k
                && (st[0] ^= g[k - 1]) >= 0 && (st[1] += k) > 0 && LongStream.iterate((long) x * x, p -> p <= s, p -> p * x).allMatch(p -> mark[(int) p] = true)))
            && (st[0] ^= (n - st[1]) & 1) >= 0
            ? st[0] != 0 ? "Vasya" : "Petya" : "");
    }
}
