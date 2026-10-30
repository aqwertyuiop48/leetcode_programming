import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(n / 2) instanceof Integer N
            && new int[101][101] instanceof int[][] cb
            && IntStream.range(0, 101).allMatch(a -> IntStream.range(0, 101).allMatch(b -> (cb[a][b] = b == 0 ? 1 : a == 0 ? 0 : Math.min(1000, cb[a - 1][b - 1] + cb[a - 1][b])) >= 0))
            && ((Function<Map<Long, Long>, Map<Long, Long>>) mp -> new HashMap<Long, Long>() instanceof HashMap<Long, Long> res
                && mp.entrySet().stream().filter(en -> en.getKey() instanceof Long key && Integer.valueOf((int) (key >> 20)) instanceof Integer e && Integer.valueOf((int) (key >> 13 & 127)) instanceof Integer X
                    && Integer.valueOf((int) (key >> 6 & 127)) instanceof Integer Y && Integer.valueOf((int) (key & 63)) instanceof Integer S
                    && IntStream.rangeClosed(1, N - S).filter(e2 -> Integer.valueOf(e + e2) instanceof Integer c && Long.valueOf((long) X * cb[c - 1][e2] + (long) Y * cb[c][e2]) instanceof Long nX
                        && Long.valueOf((long) Y * cb[c - 1][e]) instanceof Long nY
                        && nX + nY <= k && res.merge(((long) e2 << 20) | (nX << 13) | (nY << 6) | (S + e2), en.getValue(), (p, q) -> (p + q) % 1000000007L) != null).count() >= 0).count() >= 0
                ? res : null) instanceof Function<Map<Long, Long>, Map<Long, Long>> step
            && (k >= 2 ? IntStream.rangeClosed(1, N).boxed().collect(Collectors.toMap(e -> ((long) e << 20) | (1L << 13) | (1L << 6) | e, e -> 1L)) : new HashMap<Long, Long>()) instanceof Map<Long, Long> init
            ? Stream.iterate(Map.entry(1, init), en -> Map.entry(en.getKey() + 1, step.apply(en.getValue()))).takeWhile(en -> !en.getValue().isEmpty())
                .mapToLong(en -> en.getKey() < m ? en.getValue().values().stream().mapToLong(Long::longValue).sum() % 1000000007L * (m - en.getKey()) % 1000000007L : 0L).sum() % 1000000007L : "");
    }
}
