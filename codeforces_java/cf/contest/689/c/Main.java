import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long m
            && ((LongUnaryOperator) x -> LongStream.rangeClosed(2, (long) Math.cbrt(x) + 1).filter(k -> k * k * k <= x).map(k -> x / (k * k * k)).sum()) instanceof LongUnaryOperator f
            && new long[]{1, 6 * m + 100} instanceof long[] st
            && IntStream.range(0, 60).allMatch(i -> Long.valueOf((st[0] + st[1]) / 2) instanceof Long mid
                && Long.valueOf(f.applyAsLong(mid)) instanceof Long g
                && (st[g >= m ? 1 : 0] = g >= m ? mid : mid + 1) > 0)
            ? (f.applyAsLong(st[0]) == m ? st[0] : -1) : "");
    }
}
