import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Stream.iterate(new long[]{1, 2}, p -> new long[]{p[1], p[0] + p[1]}).limit(88).mapToLong(p -> p[0]).toArray() instanceof long[] F
            ? IntStream.rangeClosed(1, Integer.parseInt(t[0])).mapToObj(q ->
                new long[]{Long.parseLong(t[q])} instanceof long[] rem
                && IntStream.iterate(87, i -> i >= 0, i -> i - 1).filter(i -> F[i] <= rem[0] && (rem[0] -= F[i]) >= 0).toArray() instanceof int[] pos
                && new long[]{1, pos[pos.length - 1] / 2, pos[pos.length - 1]} instanceof long[] st
                && IntStream.iterate(pos.length - 2, i -> i >= 0, i -> i - 1).allMatch(i ->
                    (Long) (st[0] * ((pos[i] - st[2] - 1) / 2) + st[1] * ((pos[i] - st[2]) / 2)) instanceof Long nd1
                    && (st[0] += st[1]) > 0
                    && (st[1] = nd1) >= 0
                    && (st[2] = pos[i]) > 0)
                ? String.valueOf(st[0] + st[1]) : "").collect(Collectors.joining("\n"))
            : "");
    }
}
