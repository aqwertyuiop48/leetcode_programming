import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] g
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((g[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Integer.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf(g[0]) instanceof Integer n && Integer.valueOf(g[1]) instanceof Integer vx && Integer.valueOf(g[2]) instanceof Integer vy
            && IntStream.rangeClosed(0, n).flatMap(cx -> IntStream.rangeClosed(0, n).map(cy -> cx * vy - cy * vx)).sorted().distinct().toArray() instanceof int[] ws
            && Integer.valueOf(Integer.highestOneBit(2 * Math.max(1, ws.length - 1) - 1)) instanceof Integer sz
            && new int[2 * sz] instanceof int[] mn && new int[2 * sz] instanceof int[] tg && new int[3] instanceof int[] q
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
            && fr.compareAndSet(null, node -> (node - (1 << (31 - Integer.numberOfLeadingZeros(node)))) * (sz >> (31 - Integer.numberOfLeadingZeros(node))) >= q[1] || (node - (1 << (31 - Integer.numberOfLeadingZeros(node)))) * (sz >> (31 - Integer.numberOfLeadingZeros(node))) + (sz >> (31 - Integer.numberOfLeadingZeros(node))) <= q[0] ? Integer.MAX_VALUE
                : q[0] <= (node - (1 << (31 - Integer.numberOfLeadingZeros(node)))) * (sz >> (31 - Integer.numberOfLeadingZeros(node))) && (node - (1 << (31 - Integer.numberOfLeadingZeros(node)))) * (sz >> (31 - Integer.numberOfLeadingZeros(node))) + (sz >> (31 - Integer.numberOfLeadingZeros(node))) <= q[1]
                    ? mn[node] + 0 * ((tg[node] = Math.max(tg[node], q[2])) + (mn[node] = Math.max(mn[node], q[2])))
                    : (tg[node] == 0 || ((mn[2 * node] = Math.max(mn[2 * node], tg[node])) >= 0 & (tg[2 * node] = Math.max(tg[2 * node], tg[node])) >= 0 & (mn[2 * node + 1] = Math.max(mn[2 * node + 1], tg[node])) >= 0 & (tg[2 * node + 1] = Math.max(tg[2 * node + 1], tg[node])) >= 0 & (tg[node] = 0) == 0))
                        ? Math.min(fr.get().applyAsInt(2 * node), fr.get().applyAsInt(2 * node + 1)) - 0 * (mn[node] = Math.min(mn[2 * node], mn[2 * node + 1])) : 0)
            && fr.get() instanceof IntUnaryOperator f
            && IntStream.range(0, n * n).mapToLong(i -> ((long) (1 * ((i / n) * vx + (i % n) * vy) + 30000000) << 20) | i).sorted().toArray() instanceof long[] ord
            && new long[1] instanceof long[] ans
            && Arrays.stream(ord).allMatch(o -> Integer.valueOf((int) (o & 1048575)) instanceof Integer i && Integer.valueOf(i / n) instanceof Integer x && Integer.valueOf(i % n) instanceof Integer y
                && Integer.valueOf(g[3 + i]) instanceof Integer a
                && (a == 0
                    || Integer.valueOf(Math.min(Math.min(x * vy - y * vx, (x + 1) * vy - (y + 1) * vx), Math.min((x + 1) * vy - y * vx, x * vy - (y + 1) * vx))) instanceof Integer lw
                    && Integer.valueOf(Math.max(Math.max(x * vy - y * vx, (x + 1) * vy - (y + 1) * vx), Math.max((x + 1) * vy - y * vx, x * vy - (y + 1) * vx))) instanceof Integer hw
                    && (q[0] = Arrays.binarySearch(ws, lw)) >= 0 && (q[1] = Arrays.binarySearch(ws, hw)) >= 0 && (q[2] = a) > 0
                    && (ans[0] += Math.max(0, a - f.applyAsInt(1))) >= 0))
            ? String.valueOf(ans[0])
            : "");
    }
}

