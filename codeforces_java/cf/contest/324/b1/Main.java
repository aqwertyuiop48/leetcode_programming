import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(n).toArray() instanceof int[] p
            && new int[n + 2] instanceof int[] pos && new int[n + 2] instanceof int[] bit && new int[n + 2] instanceof int[] d
            && IntStream.range(0, n).filter(i -> (pos[p[i]] = i) < 0).count() == 0
            && ((IntBinaryOperator) (v, delta) -> IntStream.iterate(v, x -> x <= n, x -> x + (x & -x)).map(x -> bit[x] += delta).max().orElse(0)) instanceof IntBinaryOperator upd
            && ((IntUnaryOperator) v -> IntStream.iterate(v, x -> x > 0, x -> x - (x & -x)).map(x -> bit[x]).sum()) instanceof IntUnaryOperator qry
            && ((IntUnaryOperator) v -> v >= 1 && v < n && pos[v] > pos[v + 1] ? 1 : 0) instanceof IntUnaryOperator isd
            && IntStream.rangeClosed(1, n - 1).filter(v -> isd.applyAsInt(v) == 1 && (d[v] = 1) > 0 && upd.applyAsInt(v, 1) < 0).count() == 0
            && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(3).toArray() instanceof int[] q
                ? q[0] == 1 ? "" + (1 + qry.applyAsInt(q[2] - 1) - qry.applyAsInt(q[1] - 1))
                : Integer.valueOf(p[q[1] - 1]) instanceof Integer a && Integer.valueOf(p[q[2] - 1]) instanceof Integer b
                    && IntStream.of(a - 1, a, b - 1, b).filter(v -> v >= 1 && v < n).distinct().toArray() instanceof int[] vs
                    && (p[q[1] - 1] = b) > 0 && (p[q[2] - 1] = a) > 0 && (pos[b] = q[1] - 1) >= 0 && (pos[a] = q[2] - 1) >= 0
                    && Arrays.stream(vs).filter(v -> upd.applyAsInt(v, isd.applyAsInt(v) - d[v]) < 0 || (d[v] = isd.applyAsInt(v)) < 0).count() == 0 ? "" : "" : "")
                .filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
