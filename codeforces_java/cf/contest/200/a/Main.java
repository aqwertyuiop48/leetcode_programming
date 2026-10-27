import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(new String(System.in.readAllBytes())).ifPresent(data -> new Thread(null, () -> System.out.println(new StringTokenizer(data) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && (Boolean) (n0 > m0) instanceof Boolean swap && (Integer) (swap ? m0 : n0) instanceof Integer n && (Integer) (swap ? n0 : m0) instanceof Integer m
            && new int[(n + 2) * (m + 2)] instanceof int[] nr && new int[(n + 2) * (m + 2)] instanceof int[] nl
            && IntStream.range(0, (n + 2) * (m + 2)).allMatch(i -> (nr[i] = i % (m + 2)) >= 0 && (nl[i] = i % (m + 2)) >= 0)
            && new IntBinaryOperator[2] instanceof IntBinaryOperator[] fn
            && (fn[0] = (base, c) -> nr[base + c] == c ? c : (nr[base + c] = fn[0].applyAsInt(base, nr[base + c]))) != null
            && (fn[1] = (base, c) -> nl[base + c] == c ? c : (nl[base + c] = fn[1].applyAsInt(base, nl[base + c]))) != null
            && new long[1] instanceof long[] best && new int[2] instanceof int[] q
            && ((IntBinaryOperator) (row, c) -> c >= 1 && c <= m && (best[0] = Math.min(best[0], (Math.abs(row - q[0]) + Math.abs(c - q[1])) * 100000000000L + (swap ? c : row) * 200000L + (swap ? row : c))) > 0 ? 1 : 0) instanceof IntBinaryOperator cand
            && ((IntBinaryOperator) (row, z) -> row < 1 || row > n || cand.applyAsInt(row, fn[0].applyAsInt(row * (m + 2), q[1])) + cand.applyAsInt(row, fn[1].applyAsInt(row * (m + 2), q[1])) >= 0 ? 0 : 1) instanceof IntBinaryOperator doRow
            ? IntStream.range(0, k).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (q[0] = swap ? b : a) > 0 && (q[1] = swap ? a : b) > 0 && (best[0] = Long.MAX_VALUE) > 0
                && IntStream.iterate(0, dx -> dx + 1).takeWhile(dx -> (q[0] - dx >= 1 || q[0] + dx <= n) && dx <= best[0] / 100000000000L)
                    .allMatch(dx -> doRow.applyAsInt(q[0] - dx, 0) + (dx == 0 ? 0 : doRow.applyAsInt(q[0] + dx, 0)) == 0)
                && (Long) (best[0] % 100000000000L / 200000L) instanceof Long oR && (Long) (best[0] % 200000L) instanceof Long oC
                && (Integer) (int) (long) (swap ? oC : oR) instanceof Integer rr && (Integer) (int) (long) (swap ? oR : oC) instanceof Integer cc
                && (nr[rr * (m + 2) + cc] = cc + 1) > 0 && (nl[rr * (m + 2) + cc] = cc - 1) >= 0
                ? oR + " " + oC : "").collect(Collectors.joining("\n")) : ""), "", 1 << 28).start());
    }
}

