import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long s
            ? IntStream.rangeClosed(1, 50).filter(h -> (1L << h) - 1 <= s)
                .mapToLong(h -> IntStream.range(0, h).filter(c -> ((s % ((1L << h) - 1) + c) & 1) == 0 && Long.bitCount(s % ((1L << h) - 1) + c) == c && ((s % ((1L << h) - 1) + c) >> h) == 0).count()).sum()
                + IntStream.range(0, 2500).parallel().mapToLong(p -> Integer.valueOf(p / 50 + 1) instanceof Integer a && Integer.valueOf(p % 50 + 1) instanceof Integer b
                    && Long.valueOf((1L << (a + 1)) + (1L << (b + 1)) - 3) instanceof Long cf && Long.valueOf((1L << b) - 1) instanceof Long base
                    && s >= cf + base && Long.valueOf((s - base) % cf) instanceof Long r && r <= (1L << a) - a - 1 + (1L << b) - b - 1
                    ? IntStream.rangeClosed(0, a + b - 2).filter(c -> ((r + c) & 1) == 0 && Long.bitCount(r + c) <= c && ((r + c) >> Math.max(a, b)) <= 1)
                        .mapToLong(c -> Integer.valueOf(Math.max(a, b) - 1) instanceof Integer M && Integer.valueOf(Math.min(a, b) - 1) instanceof Integer mn && Long.valueOf(r + c) instanceof Long N
                            && new long[2][2 * (c + 1)] instanceof long[][] D && (D[1][0] = 1) == 1
                            && IntStream.rangeClosed(1, M).allMatch(m -> D[m & 1] instanceof long[] cur && D[(m + 1) & 1] instanceof long[] nx
                                && Integer.valueOf((int) ((N >> m) & 1)) instanceof Integer bm && Integer.valueOf(m <= mn ? 2 : 1) instanceof Integer mult
                                && IntStream.range(0, 2).allMatch(cr -> IntStream.rangeClosed(0, c).allMatch(j -> cur[cr * (c + 1) + j] == 0
                                    || (((bm ^ cr) == 1 ? (j + 1 > c || (nx[cr * (c + 1) + j + 1] += cur[cr * (c + 1) + j] * mult) >= 0)
                                        : ((nx[j] += cur[cr * (c + 1) + j]) >= 0 && (mult == 1 || j + 2 > c || (nx[c + 1 + j + 2] += cur[cr * (c + 1) + j]) >= 0)))
                                        && (cur[cr * (c + 1) + j] = 0) == 0))))
                            ? D[(M + 1) & 1][(int) (N >> (M + 1)) * (c + 1) + c] : 0L).sum()
                    : 0L).sum()
            : "");
    }
}
