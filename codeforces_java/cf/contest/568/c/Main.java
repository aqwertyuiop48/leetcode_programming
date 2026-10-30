import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 4) instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).toArray() instanceof int[] st
            && ((IntUnaryOperator) k -> IntStream.iterate(st[k], i -> raw[i] > 32, i -> i + 1).reduce(0, (x, i) -> x * 10 + raw[i] - 48)) instanceof IntUnaryOperator num
            && (Integer) (int) IntStream.iterate(st[0], i -> raw[i] > 32, i -> i + 1).count() instanceof Integer l
            && (Integer) num.applyAsInt(1) instanceof Integer n
            && (Integer) num.applyAsInt(2) instanceof Integer m
            && ((IntUnaryOperator) a -> raw[a + 1] <= 32 ? raw[a] - 48 : raw[a + 2] <= 32 ? (raw[a] - 48) * 10 + raw[a + 1] - 48 : (raw[a] - 48) * 100 + (raw[a + 1] - 48) * 10 + raw[a + 2] - 48) instanceof IntUnaryOperator sm
            && IntStream.range(0, l).map(c -> raw[st[0] + c] == 67 ? 1 : 0).toArray() instanceof int[] tv
            && (Boolean) IntStream.range(0, l).anyMatch(c -> tv[c] == 0) instanceof Boolean hasV
            && (Boolean) IntStream.range(0, l).anyMatch(c -> tv[c] == 1) instanceof Boolean hasC
            && new long[2 * n][(2 * n + 63) / 64] instanceof long[][] reach
            && ((IntBinaryOperator) (u, v) -> (int) ((reach[u][v >> 6] >>> (v & 63)) & 1L)) instanceof IntBinaryOperator get
            && IntStream.range(0, m).filter(q -> (Integer) (2 * (sm.applyAsInt(st[3 + 4 * q]) - 1) + (raw[st[4 + 4 * q]] == 67 ? 1 : 0)) instanceof Integer u
                && (Integer) (2 * (sm.applyAsInt(st[5 + 4 * q]) - 1) + (raw[st[6 + 4 * q]] == 67 ? 1 : 0)) instanceof Integer v
                && (reach[u][v >> 6] |= 1L << (v & 63)) != 5 && (reach[v ^ 1][(u ^ 1) >> 6] |= 1L << ((u ^ 1) & 63)) != 5 || true).count() >= 0
            && IntStream.range(0, 2 * n).filter(u -> (reach[u][u >> 6] |= 1L << (u & 63)) != 5 && ((u % 2 == 0 ? !hasV : !hasC) ? (reach[u][(u ^ 1) >> 6] |= 1L << ((u ^ 1) & 63)) != 5 : true) || true).count() >= 0
            && IntStream.range(0, 2 * n).filter(k -> IntStream.range(0, 2 * n).filter(i -> get.applyAsInt(i, k) == 1
                && IntStream.range(0, reach[i].length).filter(j -> (reach[i][j] |= reach[k][j]) != 5 || true).count() >= 0 || true).count() >= 0 || true).count() >= 0
            && IntStream.range(0, n).map(i -> raw[st[3 + 4 * m] + i] - 97).toArray() instanceof int[] s
            && s.clone() instanceof int[] res
            && IntStream.range(0, n).map(i -> 2 * i + tv[s[i]]).toArray() instanceof int[] lit
            && ((IntBinaryOperator) (k, c) -> IntStream.range(0, k).allMatch(j -> get.applyAsInt(lit[j], (2 * k + tv[c]) ^ 1) == 0)
                && get.applyAsInt(2 * k + tv[c], (2 * k + tv[c]) ^ 1) == 0 ? 1 : 0) instanceof IntBinaryOperator ok
            && IntStream.range(0, n).noneMatch(i -> get.applyAsInt(2 * i, 2 * i + 1) == 1 && get.applyAsInt(2 * i + 1, 2 * i) == 1)
            ? ((Integer) IntStream.range(0, n).filter(j -> ok.applyAsInt(j, s[j]) == 0).findFirst().orElse(n) instanceof Integer fb
                ? (fb == n ? IntStream.of(s).mapToObj(x -> String.valueOf((char) (97 + x))).collect(Collectors.joining())
                    : ((Integer) IntStream.rangeClosed(0, fb).map(x -> fb - x).filter(p -> IntStream.range(s[p] + 1, l).anyMatch(c -> ok.applyAsInt(p, c) == 1)).findFirst().orElse(-1) instanceof Integer pp
                        && pp >= 0
                        && (Integer) IntStream.range(s[pp] + 1, l).filter(c -> ok.applyAsInt(pp, c) == 1).findFirst().getAsInt() instanceof Integer cc
                        && (res[pp] = cc) >= 0
                        && (lit[pp] = 2 * pp + tv[cc]) >= 0
                        && IntStream.range(pp + 1, n).filter(q -> (Integer) IntStream.range(0, l).filter(c -> ok.applyAsInt(q, c) == 1).findFirst().getAsInt() instanceof Integer c2
                            && (res[q] = c2) >= 0 && (lit[q] = 2 * q + tv[c2]) >= 0 || true).count() >= 0
                        ? IntStream.of(res).mapToObj(x -> String.valueOf((char) (97 + x))).collect(Collectors.joining()) : "-1"))
                : "-1")
            : "-1");
    }
}
