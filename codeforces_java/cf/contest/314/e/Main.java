import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next().trim()) instanceof Integer n && it.next().trim() instanceof String s
            && Integer.valueOf(n / 2) instanceof Integer h && Long.valueOf(s.chars().filter(ch -> ch != '?').count()) instanceof Long f
            && new int[2][h + 2] instanceof int[][] bufs && (bufs[0][0] = 1) == 1
            ? n % 2 != 0 || f > h ? "0"
                : IntStream.rangeClosed(1, n).allMatch(i -> bufs[(i - 1) & 1] instanceof int[] x && bufs[i & 1] instanceof int[] y
                    && (s.charAt(i - 1) != '?' ? (Math.min(i, h) - (i + 1) / 2 > 20000 ? IntStream.rangeClosed((i + 1) / 2, Math.min(i, h)).parallel() : IntStream.rangeClosed((i + 1) / 2, Math.min(i, h))).allMatch(o -> (y[o] = x[o - 1]) * 0 == 0)
                        : (Math.min(i, h) - (i + 1) / 2 > 20000 ? IntStream.rangeClosed((i + 1) / 2, Math.min(i, h)).parallel() : IntStream.rangeClosed((i + 1) / 2, Math.min(i, h))).allMatch(o -> (y[o] = x[o] + x[o - 1]) * 0 == 0))
                    && (y[(i + 1) / 2 - 1] = 0) == 0)
                ? String.valueOf((bufs[n & 1][h] & 0xFFFFFFFFL) * IntStream.range(0, h - (int) (long) f).mapToLong(z -> 25L).reduce(1L, (p, q) -> p * q & 0xFFFFFFFFL) & 0xFFFFFFFFL) : "" : "");
    }
}
