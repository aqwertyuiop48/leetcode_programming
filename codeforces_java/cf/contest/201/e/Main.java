import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(q -> Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long m
                && ((java.util.function.LongPredicate) k -> new long[]{n, 0, 1, 0} instanceof long[] st
                    && Stream.iterate(0L, i -> i + 1).takeWhile(i -> st[0] > 0 && i <= k).allMatch(i -> Long.valueOf(Math.min(st[2], st[0])) instanceof Long take
                        && (st[1] += take * i) >= 0 && (st[0] -= take) >= 0 && (st[2] = st[2] * (k - i) / (i + 1)) >= 0)
                    && st[0] == 0 && st[1] <= k * m) instanceof java.util.function.LongPredicate ok
                ? String.valueOf(Stream.iterate(new long[]{0, n}, r -> ok.test((r[0] + r[1]) / 2) ? new long[]{r[0], (r[0] + r[1]) / 2} : new long[]{(r[0] + r[1]) / 2 + 1, r[1]}).filter(r -> r[0] >= r[1]).findFirst().get()[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}
