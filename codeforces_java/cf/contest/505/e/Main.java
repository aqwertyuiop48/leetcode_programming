import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && (Integer) s.nextInt() instanceof Integer k && (Long) s.nextLong() instanceof Long p
            && new long[4 * n] instanceof long[] r
            && IntStream.range(0, n).allMatch(i -> (r[4 * i + 2] = s.nextLong()) >= 0 && (r[4 * i + 1] = s.nextLong()) >= 0 && (r[4 * i + 2] += r[4 * i + 1] * m) > 0)
            && new int[m + 1] instanceof int[] head
            && new int[4] instanceof int[] st
            && ((LongPredicate) x -> IntStream.rangeClosed(0, m).allMatch(i -> (head[i] = -1) < 0)
                && (st[0] = (int) IntStream.range(0, n).filter(i -> (r[4 * i] = x) >= 0 && x < r[4 * i + 2] && (st[3] = (int) Math.min(m, x / (double) r[4 * i + 1])) >= 0 && (r[4 * i + 3] = head[st[3]]) >= -1
                    && (head[st[3]] = i) >= 0).count()) >= 0
                && (st[1] = 0) == 0
                && IntStream.rangeClosed(1, m).allMatch(t -> IntStream.range(0, k).allMatch(z -> st[0] == 0
                    || (head[st[1]] >= 0 || (st[1] = IntStream.iterate(st[1], q -> head[q] < 0, q -> q + 1).reduce(st[1] - 1, (u, v) -> v) + 1) >= 0)
                    && st[1] >= t
                    && (st[2] = 4 * head[st[1]]) >= 0
                    && (head[st[1]] = (int) r[st[2] + 3]) >= -1 && (r[st[2]] += p) > 0
                    && (r[st[2]] >= r[st[2] + 2] ? --st[0] >= 0 : (st[3] = (int) Math.min(m, r[st[2]] / (double) r[st[2] + 1])) >= 0 && (r[st[2] + 3] = head[st[3]]) >= -1 && (head[st[3]] = st[2] / 4) >= 0)))
                && st[0] == 0) instanceof LongPredicate chk
            && new long[]{IntStream.range(0, n).mapToLong(i -> r[4 * i + 1]).max().getAsLong(), IntStream.range(0, n).mapToLong(i -> r[4 * i + 2]).max().getAsLong()} instanceof long[] bs
            && IntStream.range(0, 48).allMatch(z -> (Long) ((bs[0] + bs[1]) / 2) instanceof Long mid
                && (chk.test(mid) ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) >= 0))
            ? bs[0] : 0);
    }
}
