import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nums
            && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((nums[(int) st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Long.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf((int) nums[0]) instanceof Integer a
            && Integer.valueOf((int) nums[1]) instanceof Integer b
            && Integer.valueOf((int) nums[6]) instanceof Integer n
            && IntStream.range(0, n + 2).map(i -> i < n ? (int) Math.min(nums[7 + 4 * i], nums[9 + 4 * i]) : i == n ? (int) nums[2] : (int) nums[4]).toArray() instanceof int[] x1
            && IntStream.range(0, n + 2).map(i -> i < n ? (int) Math.max(nums[7 + 4 * i], nums[9 + 4 * i]) : i == n ? (int) nums[2] : (int) nums[4]).toArray() instanceof int[] x2
            && IntStream.range(0, n + 2).map(i -> i < n ? (int) Math.min(nums[8 + 4 * i], nums[10 + 4 * i]) : i == n ? (int) nums[3] : (int) nums[5]).toArray() instanceof int[] y1
            && IntStream.range(0, n + 2).map(i -> i < n ? (int) Math.max(nums[8 + 4 * i], nums[10 + 4 * i]) : i == n ? (int) nums[3] : (int) nums[5]).toArray() instanceof int[] y2
            && ((IntBinaryOperator) (i, j) ->
                (Integer) Math.max(0, Math.max(x1[i], x1[j]) - Math.min(x2[i], x2[j])) instanceof Integer dx
                && (Integer) Math.max(0, Math.max(y1[i], y1[j]) - Math.min(y2[i], y2[j])) instanceof Integer dy
                ? dx * dx + dy * dy : 0) instanceof IntBinaryOperator d2
            && IntStream.range(0, n + 2).map(i -> i == n ? 0 : -1).toArray() instanceof int[] dep
            && IntStream.range(0, n + 2).allMatch(d ->
                IntStream.range(0, n + 1).filter(u -> dep[u] == d).allMatch(u ->
                    IntStream.range(0, n).allMatch(v -> dep[v] != -1 || d2.applyAsInt(u, v) > a * a || (dep[v] = d + 1) >= 0)))
            ? d2.applyAsInt(n, n + 1) <= a * a
                ? String.format(Locale.ROOT, "%.10f", Math.sqrt(d2.applyAsInt(n, n + 1)))
                : IntStream.range(0, n).filter(v -> dep[v] > 0 && d2.applyAsInt(v, n + 1) <= a * a)
                    .mapToDouble(v -> (double) dep[v] * (a + b) + Math.sqrt(d2.applyAsInt(v, n + 1))).min() instanceof OptionalDouble res
                    && res.isPresent()
                    ? String.format(Locale.ROOT, "%.10f", res.getAsDouble())
                    : "-1"
            : "");
    }
}
