
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(k -> raw[k] == 10).boxed().findFirst().get() instanceof Integer nl
            && new String(raw, 0, nl).trim().split("\\s+") instanceof String[] hd
            && Integer.valueOf(hd[0]) instanceof Integer n && Integer.valueOf(hd[1]) instanceof Integer m && Integer.valueOf(n * m) instanceof Integer N
            && IntStream.range(nl + 1, raw.length).filter(k -> raw[k] == 68 || raw[k] == 73 || raw[k] == 77 || raw[k] == 65).map(k -> raw[k] == 68 ? 0 : raw[k] == 73 ? 1 : raw[k] == 77 ? 2 : 3).toArray() instanceof int[] c
            && new int[4 * N] instanceof int[] tg
            && IntStream.range(0, N).filter(v -> Integer.valueOf((c[v] + 1) & 3) instanceof Integer nc
                && (tg[4 * v] = v >= m && c[v - m] == nc ? v - m : -1) + (tg[4 * v + 1] = v < N - m && c[v + m] == nc ? v + m : -1)
                    + (tg[4 * v + 2] = v % m > 0 && c[v - 1] == nc ? v - 1 : -1) + (tg[4 * v + 3] = v % m < m - 1 && c[v + 1] == nc ? v + 1 : -1) < -99).count() == 0
            && new int[N] instanceof int[] deg
            && IntStream.range(0, 4 * N).map(e -> tg[e] >= 0 && ++deg[tg[e]] > 0 ? 0 : 0).sum() == 0
            && new int[N] instanceof int[] ord && new int[]{0} instanceof int[] tl
            && IntStream.range(0, N).map(v -> deg[v] == 0 ? (ord[tl[0]++] = v) * 0 : 0).sum() == 0
            && ((IntBinaryOperator) (v, d) -> tg[4 * v + d] >= 0 && --deg[tg[4 * v + d]] == 0 && (ord[tl[0]++] = tg[4 * v + d]) >= 0 ? 0 : 0) instanceof IntBinaryOperator rel
            && IntStream.range(0, N).map(i -> i < tl[0] ? rel.applyAsInt(ord[i], 0) + rel.applyAsInt(ord[i], 1) + rel.applyAsInt(ord[i], 2) + rel.applyAsInt(ord[i], 3) : 0).sum() == 0
            ? tl[0] < N ? "Poor Inna!"
                : (new int[N] instanceof int[] lp
                    && ((IntBinaryOperator) (v, d) -> tg[4 * v + d] >= 0 ? lp[tg[4 * v + d]] : 0) instanceof IntBinaryOperator g
                    && IntStream.range(0, N).map(k -> Integer.valueOf(ord[N - 1 - k]) instanceof Integer v && (lp[v] = 1 + Math.max(Math.max(g.applyAsInt(v, 0), g.applyAsInt(v, 1)), Math.max(g.applyAsInt(v, 2), g.applyAsInt(v, 3)))) > 0 ? 0 : 0).sum() == 0
                    && Integer.valueOf(IntStream.range(0, N).filter(v -> c[v] == 0).map(v -> lp[v] / 4).max().orElse(0)) instanceof Integer r && r > 0 ? String.valueOf(r) : "Poor Dima!")
            : "");
    }
}



