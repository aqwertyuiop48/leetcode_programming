import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer r && Integer.valueOf(tok[1]) instanceof Integer c && Integer.valueOf(tok[2]) instanceof Integer n && Integer.valueOf(tok[3] - 1) instanceof Integer K1 && Integer.valueOf(c + 1) instanceof Integer C1
            && IntStream.range(0, n).map(i -> tok[4 + 2 * i]).toArray() instanceof int[] rowOf && IntStream.range(0, n).map(i -> tok[5 + 2 * i]).toArray() instanceof int[] colOf
            && IntStream.range(0, n).mapToLong(i -> ((long) colOf[i] << 24) | ((long) rowOf[i] << 12) | i).sorted().mapToInt(v -> (int) (v & 4095)).toArray() instanceof int[] ordC
            && IntStream.range(0, n).mapToLong(i -> ((long) rowOf[i] << 12) | i).sorted().toArray() instanceof long[] srt
            && IntStream.range(0, n).map(e -> (int) (srt[n - 1 - e] & 4095)).toArray() instanceof int[] byRow
            && IntStream.range(0, n).mapToLong(e -> e > 0 && rowOf[byRow[e]] == rowOf[byRow[e - 1]] ? 0L : (e == 0 ? r + 1 : rowOf[byRow[e - 1]]) - rowOf[byRow[e]]).toArray() instanceof long[] wb
            && IntStream.range(0, n).map(e -> rowOf[byRow[n - 1 - e]]).distinct().toArray() instanceof int[] drows
            && Integer.valueOf(n + 1) instanceof Integer T
            && new int[n + 2] instanceof int[] colv && new int[n + 2] instanceof int[] prv && new int[n + 2] instanceof int[] nxt && new int[n + 2] instanceof int[] kth && new int[n + 2] instanceof int[] val && new int[n + 2] instanceof int[] posNode
            && new long[]{0, 0} instanceof long[] ta && new int[]{0} instanceof int[] mm && (nxt[T] = T) > 0
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] rec
            && (rec[0] = (p, i) -> p < 1 || i >= K1 ? 0
                : (kth[p] = nxt[kth[p]]) >= 0 & (ta[0] += -val[p] + (val[p] = (colv[p] - colv[prv[p]]) * (kth[p] == T ? 0 : C1 - colv[kth[p]]))) > Long.MIN_VALUE ? rec[0].applyAsInt(prv[p], i + 1) : 0) != null
            && ((IntUnaryOperator) x -> rec[0].applyAsInt(prv[x], 0) >= 0 && Integer.valueOf(nxt[x]) instanceof Integer s && Integer.valueOf(prv[x]) instanceof Integer q
                && (s - T == 0 || (ta[0] += -val[s] + (val[s] = (colv[s] - colv[q]) * (kth[s] == T ? 0 : C1 - colv[kth[s]]))) > Long.MIN_VALUE) && (ta[0] -= val[x]) > Long.MIN_VALUE
                && (nxt[q] = s) >= 0 && (prv[s] = q) >= 0 ? 0 : 1) instanceof IntUnaryOperator rm
            ? IntStream.range(0, drows.length).mapToLong(j -> Integer.valueOf(drows[j]) instanceof Integer Rj && Integer.valueOf((int) IntStream.range(0, n).filter(i -> rowOf[i] >= Rj).count()) instanceof Integer m && (mm[0] = 0) == 0
                && IntStream.range(0, n).filter(z -> rowOf[ordC[z]] >= Rj && (colv[++mm[0]] = colOf[ordC[z]]) >= 0 & (posNode[ordC[z]] = mm[0]) > 0).count() >= 0
                && IntStream.rangeClosed(1, m).filter(i -> (prv[i] = i - 1) >= 0 & (nxt[i] = i == m ? T : i + 1) > 0 & (kth[i] = i + K1 <= m ? i + K1 : T) > 0 & (val[i] = (colv[i] - colv[i - 1]) * (kth[i] == T ? 0 : C1 - colv[kth[i]])) >= 0).count() >= 0
                && (ta[1] = 0) == 0 && (ta[0] = IntStream.rangeClosed(1, m).mapToLong(i -> val[i]).sum()) >= 0
                && IntStream.range(0, m).filter(e -> (ta[1] += wb[e] * ta[0]) >= 0 & rm.applyAsInt(posNode[byRow[e]]) >= 0).count() >= 0
                ? (long) (Rj - (j == 0 ? 0 : drows[j - 1])) * ta[1] : 0L).sum() : -1L);
    }
}
