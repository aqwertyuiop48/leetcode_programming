import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc
            && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer m && (Integer) (n * m) instanceof Integer nm
            && IntStream.range(0, n).mapToObj(i -> sc.nextToken()).toList() instanceof List<String> g
            && IntStream.range(0, 4).map(q -> IntStream.range(0, 16).filter(P -> (P >> q & 1) == 1).map(P -> 1 << P).sum()).toArray() instanceof int[] B
            && new int[2][nm] instanceof int[][] bufs
            && IntStream.range(0, nm).allMatch(t -> (Integer) (t / m) instanceof Integer i && (Integer) (t % m) instanceof Integer j
                && ((bufs[1][t] = i + 1 < n && j + 1 < m
                    ? 1 << ((g.get(i).charAt(j) == '*' ? 1 : 0) + 2 * (g.get(i).charAt(j + 1) == '*' ? 1 : 0) + 4 * (g.get(i + 1).charAt(j) == '*' ? 1 : 0) + 8 * (g.get(i + 1).charAt(j + 1) == '*' ? 1 : 0))
                        | (g.get(i).charAt(j) == '*' && g.get(i).charAt(j + 1) == '*' && g.get(i + 1).charAt(j) == '*' && g.get(i + 1).charAt(j + 1) == '*' ? 65536 : 0)
                    : 0) >= 0))
            ? IntStream.rangeClosed(2, 9).filter(k -> (1 << k) <= Math.min(n, m)).mapToLong(k -> (Integer) (1 << k) instanceof Integer s && (Integer) (s / 2) instanceof Integer h
                && bufs[k & 1] instanceof int[] cur && bufs[(k - 1) & 1] instanceof int[] prev
                && ((IntBinaryOperator) (q, t) -> prev[t + (q >> 1) * h * m + (q & 1) * h]) instanceof IntBinaryOperator pv
                ? IntStream.range(0, nm).filter(t -> ((cur[t] = t / m + s > n || t % m + s > m ? 0
                    : (((-(pv.applyAsInt(0, t) >>> 16) & B[0]) | (~B[0] & pv.applyAsInt(0, t))) & ((-(pv.applyAsInt(1, t) >>> 16) & B[1]) | (~B[1] & pv.applyAsInt(1, t)))
                        & ((-(pv.applyAsInt(2, t) >>> 16) & B[2]) | (~B[2] & pv.applyAsInt(2, t))) & ((-(pv.applyAsInt(3, t) >>> 16) & B[3]) | (~B[3] & pv.applyAsInt(3, t))) & 65535)
                        | (pv.applyAsInt(0, t) & pv.applyAsInt(1, t) & pv.applyAsInt(2, t) & pv.applyAsInt(3, t) & 65536)) & 65535) != 0).count() : 0L).sum() : 0);
    }
}
