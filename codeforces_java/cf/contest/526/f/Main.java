import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n + 2] instanceof int[] a && IntStream.range(0, n).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (a[x] = Integer.parseInt(tk.nextToken())) > 0)
            && (Integer) Integer.highestOneBit(Math.max(1, 2 * n - 1)) instanceof Integer sz && (Integer) (sz < n ? sz * 2 : sz) instanceof Integer big
            && new int[2 * big] instanceof int[] mn && new int[2 * big] instanceof int[] cnt && new int[2 * big] instanceof int[] tag
            && IntStream.range(0, big).allMatch(i -> (mn[big + i] = i < n ? i + 1 : 1000000000) > 0 && (cnt[big + i] = i < n ? 1 : 0) >= 0)
            && ((IntUnaryOperator) p -> (Integer) Math.min(mn[2 * p], mn[2 * p + 1]) instanceof Integer m && (cnt[p] = (mn[2 * p] == m ? cnt[2 * p] : 0) + (mn[2 * p + 1] == m ? cnt[2 * p + 1] : 0)) >= 0 && (mn[p] = m + tag[p]) != Integer.MIN_VALUE ? 0 : 0) instanceof IntUnaryOperator pull
            && IntStream.iterate(big - 1, p -> p >= 1, p -> p - 1).allMatch(p -> pull.applyAsInt(p) == 0)
            && ((IntBinaryOperator) (lr, v) -> new int[]{(lr >> 20) - 1 + big, (lr & 1048575) + big} instanceof int[] st
                && (Integer) st[0] instanceof Integer l0 && (Integer) (st[1] - 1) instanceof Integer r0
                && Stream.generate(() -> 0).takeWhile(z -> st[0] < st[1]).allMatch(z ->
                    ((st[0] & 1) == 0 || (mn[st[0]] += v) != Integer.MIN_VALUE && (st[0] >= big || (tag[st[0]] += v) != Integer.MIN_VALUE) && ++st[0] > 0)
                    && ((st[1] & 1) == 0 || (mn[--st[1]] += v) != Integer.MIN_VALUE && (st[1] >= big || (tag[st[1]] += v) != Integer.MIN_VALUE))
                    && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0)
                && IntStream.iterate(l0 >> 1, p -> p >= 1, p -> p >> 1).allMatch(p -> pull.applyAsInt(p) == 0)
                && IntStream.iterate(r0 >> 1, p -> p >= 1, p -> p >> 1).allMatch(p -> pull.applyAsInt(p) == 0) ? 0 : 1) instanceof IntBinaryOperator add
            && new int[2][n + 2] instanceof int[][] stk && new int[]{0, 0} instanceof int[] sp
            ? IntStream.rangeClosed(1, n).mapToLong(r ->
                (Integer) Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0 && a[stk[0][sp[0] - 1]] < a[r]).mapToInt(z -> add.applyAsInt((((sp[0] > 1 ? stk[0][sp[0] - 2] : 0) + 1) << 20) | stk[0][sp[0] - 1], a[r] - a[stk[0][--sp[0]]])).sum() instanceof Integer u1
                && (stk[0][sp[0]++] = r) > 0
                && (Integer) Stream.generate(() -> 0).takeWhile(z -> sp[1] > 0 && a[stk[1][sp[1] - 1]] > a[r]).mapToInt(z -> add.applyAsInt((((sp[1] > 1 ? stk[1][sp[1] - 2] : 0) + 1) << 20) | stk[1][sp[1] - 1], a[stk[1][--sp[1]]] - a[r])).sum() instanceof Integer u2
                && (stk[1][sp[1]++] = r) > 0 ? (long) cnt[1] : 0).sum() : 0);
    }
}
