import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] g0
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0).count() >= 0
            && Integer.valueOf((int) g0[0]) instanceof Integer n
            && Integer.valueOf((int) g0[1]) instanceof Integer m
            && Long.valueOf(g0[2]) instanceof Long gold
            && Long.valueOf(g0[3]) instanceof Long silver
            && IntStream.range(0, m).map(i -> (int) g0[4 + 4 * i] - 1).toArray() instanceof int[] eu
            && IntStream.range(0, m).map(i -> (int) g0[5 + 4 * i] - 1).toArray() instanceof int[] ev
            && IntStream.range(0, m).mapToLong(i -> g0[6 + 4 * i]).toArray() instanceof long[] eg
            && IntStream.range(0, m).mapToLong(i -> g0[7 + 4 * i]).toArray() instanceof long[] es
            && IntStream.range(0, m).mapToLong(i -> eg[i] * 65536L + i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] par
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] pe
            && new int[n] instanceof int[] mk
            && new int[16] instanceof int[] t
            && new long[]{0, 0, Long.MAX_VALUE, 0, 0} instanceof long[] reg
            && ((IntUnaryOperator) x ->
                (t[0] = x) >= 0 && (IntStream.range(0, n).allMatch(z -> par[t[0]] >= 0 && (t[0] = par[t[0]]) >= 0) || true)
                    ? t[0]
                    : -1) instanceof IntUnaryOperator root
            && ((IntUnaryOperator) x ->
                (t[1] = -1) < 0 & (t[2] = -1) < 0 & (t[3] = x) >= 0
                & (IntStream.range(0, n).allMatch(z ->
                    t[3] >= 0
                    && (t[4] = par[t[3]]) >= -1
                    && (t[5] = pe[t[3]]) >= -1
                    && (par[t[3]] = t[1]) >= -1
                    && (pe[t[3]] = t[2]) >= -1
                    && (t[1] = t[3]) >= 0
                    && (t[2] = t[5]) >= -1
                    && (t[3] = t[4]) >= -1) || true)
                    ? 0
                    : 1) instanceof IntUnaryOperator reroot
            && IntStream.range(0, m).filter(ii ->
                (t[6] = (int) (keys[ii] & 65535L)) >= 0
                && (reg[3] = 0) == 0
                && eu[t[6]] != ev[t[6]]
                && !(reg[0] == n - 1 && es[t[6]] >= reg[1])
                && (root.applyAsInt(eu[t[6]]) - root.applyAsInt(ev[t[6]]) != 0
                    ? reroot.applyAsInt(eu[t[6]]) == 0
                        && (par[eu[t[6]]] = ev[t[6]]) >= 0
                        && (pe[eu[t[6]]] = t[6]) >= 0
                        && (reg[0] += 1) > 0
                        && (reg[3] = 1) == 1
                    : (t[7] = eu[t[6]]) >= 0
                        && (mk[t[7]] = ii + 1) > 0
                        && (IntStream.range(0, n).allMatch(z -> par[t[7]] >= 0 && (t[7] = par[t[7]]) >= 0 && (mk[t[7]] = ii + 1) > 0) || true)
                        && (t[7] = ev[t[6]]) >= 0
                        && (reg[4] = 0) == 0
                        && (t[8] = -1) < 0
                        && (t[9] = 1) == 1
                        && (IntStream.range(0, n).allMatch(z ->
                            mk[t[7]] != ii + 1
                            && (es[pe[t[7]]] <= reg[4] || ((reg[4] = es[pe[t[7]]]) > 0 && (t[8] = t[7]) >= 0))
                            && (t[7] = par[t[7]]) >= 0) || true)
                        && (t[10] = t[7]) >= 0
                        && (t[7] = eu[t[6]]) >= 0
                        && (IntStream.range(0, n).allMatch(z ->
                            t[7] != t[10]
                            && (es[pe[t[7]]] <= reg[4] || ((reg[4] = es[pe[t[7]]]) > 0 && (t[8] = t[7]) >= 0 && (t[9] = 0) == 0))
                            && (t[7] = par[t[7]]) >= 0) || true)
                        && (reg[4] <= es[t[6]]
                            || ((par[t[8]] = -1) == -1
                                && (t[11] = t[9] == 1 ? ev[t[6]] : eu[t[6]]) >= 0
                                && (t[12] = t[9] == 1 ? eu[t[6]] : ev[t[6]]) >= 0
                                && reroot.applyAsInt(t[11]) == 0
                                && (par[t[11]] = t[12]) >= 0
                                && (pe[t[11]] = t[6]) >= 0
                                && (reg[3] = 2) == 2)))
                && (reg[3] == 0 || reg[0] != n - 1
                    || ((reg[3] == 2 && reg[4] != reg[1] || (reg[1] = IntStream.range(0, n).filter(v -> par[v] >= 0).mapToLong(v -> es[pe[v]]).max().getAsLong()) > 0)
                        && (reg[2] = Math.min(reg[2], gold * eg[t[6]] + silver * reg[1])) > 0))).count() >= 0
            ? (reg[2] == Long.MAX_VALUE ? -1L : reg[2])
            : 0L);
    }
}
