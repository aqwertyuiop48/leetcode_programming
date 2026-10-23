import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long m && (Integer) s.nextInt() instanceof Integer k
            && new long[65][65] instanceof long[][] c && IntStream.range(0, 65).allMatch(i -> (c[i][0] = 1) > 0 && IntStream.rangeClosed(1, i).allMatch(j -> (c[i][j] = c[i - 1][j - 1] + (j < i ? c[i - 1][j] : 0)) > 0))
            && ((LongUnaryOperator) x -> new int[]{0} instanceof int[] on ? LongStream.range(0, 62).map(t -> 61 - t).filter(b -> (x >> b & 1) == 1)
                .map(b -> (k - on[0] >= 0 && k - on[0] <= b ? c[(int) b][k - on[0]] : 0) + 0 * on[0]++).sum() + (on[0] == k ? 1 : 0) : 0) instanceof LongUnaryOperator cnt
            && new long[]{1, 1000000000000000000L} instanceof long[] st
            && IntStream.range(0, 64).allMatch(i -> (Long) ((st[0] + st[1]) / 2) instanceof Long mid && (cnt.applyAsLong(2 * mid) - cnt.applyAsLong(mid) >= m ? (st[1] = mid) > 0 : (st[0] = mid + 1) > 0))
            ? st[0] : 0);
    }
}
