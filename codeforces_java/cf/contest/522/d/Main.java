import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Arrays.copyOf(raw, raw.length + 1) instanceof byte[] by && (by[raw.length] = ' ') == ' '
            && new int[raw.length / 2 + 2] instanceof int[] vals && new int[4] instanceof int[] st
            && IntStream.range(0, by.length).allMatch(i -> (Integer) (int) by[i] instanceof Integer c
                && (c >= 48 ? (st[0] = st[0] * 10 + c - 48) >= 0 && (st[2] = 1) > 0
                    : c == 45 ? (st[1] = 1) > 0
                    : st[2] == 0 || (vals[st[3]++] = st[1] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0))
            && (Integer) vals[0] instanceof Integer n && (Integer) vals[1] instanceof Integer m
            && new int[m] instanceof int[] qn && new int[n + 1] instanceof int[] qh && IntStream.rangeClosed(0, n).allMatch(i -> (qh[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (Integer) vals[3 + n + 2 * i] instanceof Integer r && (qn[i] = qh[r]) >= -1 && (qh[r] = i) >= 0)
            && new int[n + 2] instanceof int[] bit && IntStream.range(0, n + 2).allMatch(i -> (bit[i] = Integer.MAX_VALUE) > 0)
            && IntStream.range(0, n).mapToLong(i -> ((long) vals[2 + i] << 20) | i).sorted().toArray() instanceof long[] sk
            && new int[n] instanceof int[] prev
            && IntStream.range(1, n).allMatch(k -> (sk[k] >> 20) != (sk[k - 1] >> 20) || (prev[(int) (sk[k] & 1048575)] = (int) (sk[k - 1] & 1048575) + 1) > 0)
            && new int[m] instanceof int[] ans && new Object[2] instanceof Object[] fs
            && (fs[0] = (IntBinaryOperator) (j, val) -> j > n ? 0 : (bit[j] = Math.min(bit[j], val)) * 0 + ((IntBinaryOperator) fs[0]).applyAsInt(j + (j & -j), val)) != null
            && (fs[1] = (IntUnaryOperator) j -> j <= 0 ? Integer.MAX_VALUE : Math.min(bit[j], ((IntUnaryOperator) fs[1]).applyAsInt(j - (j & -j)))) != null
            && IntStream.rangeClosed(1, n).allMatch(i -> (Integer) prev[i - 1] instanceof Integer p
                && (p == 0 || ((IntBinaryOperator) fs[0]).applyAsInt(n + 1 - p, i - p) == 0)
                && (qh[i] < 0 || IntStream.iterate(qh[i], q -> q >= 0, q -> qn[q]).allMatch(q -> (ans[q] = ((IntUnaryOperator) fs[1]).applyAsInt(n + 1 - vals[2 + n + 2 * q])) != 0)))
            ? Arrays.stream(ans).mapToObj(x -> x == Integer.MAX_VALUE ? "-1" : String.valueOf(x)).collect(Collectors.joining("\n")) : "");
    }
}
