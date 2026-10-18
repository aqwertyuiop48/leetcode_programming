import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Stream.generate(sc::next).limit(n).toArray(String[]::new) instanceof String[] g
            && new byte[1 << 25] instanceof byte[] memo
            && ((LongBinaryOperator) (x, y) -> (x + 1 << 8) | (y + 1)) instanceof LongBinaryOperator pa
            && ((IntBinaryOperator) (u, v) -> (u + v - m + 1) / 2) instanceof IntBinaryOperator ci
            && ((IntBinaryOperator) (u, v) -> ((u + v - m + 1) & 1) == 0 && ci.applyAsInt(u, v) >= 0 && ci.applyAsInt(u, v) < n
                && u - ci.applyAsInt(u, v) >= 0 && u - ci.applyAsInt(u, v) < m ? g[ci.applyAsInt(u, v)].charAt(u - ci.applyAsInt(u, v)) : 0) instanceof IntBinaryOperator at
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> gr
            && gr.getAndSet((a, b) ->
                Integer.valueOf((int) ((a >> 8 & 255) - 1)) instanceof Integer u1
                && Integer.valueOf((int) ((a & 255) - 1)) instanceof Integer u2
                && Integer.valueOf((int) (a >> 16 & 1)) instanceof Integer p
                && Integer.valueOf((int) ((b >> 8 & 255) - 1)) instanceof Integer v1
                && Integer.valueOf((int) ((b & 255) - 1)) instanceof Integer v2
                && Integer.valueOf((u1 + 1) | (u2 + 1) << 6 | p << 12 | (v1 + 1) << 13 | (v2 + 1) << 19) instanceof Integer key
                && gr.get() instanceof LongBinaryOperator G
                && Long.valueOf((long) p << 16) instanceof Long pp
                    ? u1 > u2 || v1 > v2 ? 0L
                    : memo[key] != 0 ? (long) memo[key] - 1
                    : Long.valueOf(IntStream.rangeClosed(u1, u2).filter(u -> (u & 1) == p).mapToLong(u ->
                            IntStream.rangeClosed(v1, v2).filter(v -> at.applyAsInt(u, v) != 0).mapToLong(v -> 1L << (at.applyAsInt(u, v) == 'L'
                                ? G.applyAsLong(pa.applyAsLong(u1, u - 1) | pp, pa.applyAsLong(v1, v2))
                                    ^ G.applyAsLong(pa.applyAsLong(u + 1, u2) | pp, pa.applyAsLong(v1, v2))
                                : at.applyAsInt(u, v) == 'R'
                                    ? G.applyAsLong(pa.applyAsLong(u1, u2) | pp, pa.applyAsLong(v1, v - 1))
                                        ^ G.applyAsLong(pa.applyAsLong(u1, u2) | pp, pa.applyAsLong(v + 1, v2))
                                    : G.applyAsLong(pa.applyAsLong(u1, u - 1) | pp, pa.applyAsLong(v1, v - 1))
                                        ^ G.applyAsLong(pa.applyAsLong(u1, u - 1) | pp, pa.applyAsLong(v + 1, v2))
                                        ^ G.applyAsLong(pa.applyAsLong(u + 1, u2) | pp, pa.applyAsLong(v1, v - 1))
                                        ^ G.applyAsLong(pa.applyAsLong(u + 1, u2) | pp, pa.applyAsLong(v + 1, v2)))).reduce(0L, (x, y) -> x | y))
                        .reduce(0L, (x, y) -> x | y)) instanceof Long mask
                        && (memo[key] = (byte) (Long.numberOfTrailingZeros(~mask) + 1)) > 0
                        ? (long) Long.numberOfTrailingZeros(~mask)
                        : 0L
                    : 0L) == null
            && gr.get() instanceof LongBinaryOperator top
            ? (top.applyAsLong(pa.applyAsLong(0, n + m - 2), pa.applyAsLong(0, n + m - 2))
                ^ top.applyAsLong(pa.applyAsLong(0, n + m - 2) | 65536L, pa.applyAsLong(0, n + m - 2))) != 0 ? "WIN" : "LOSE"
            : "");
    }
}
