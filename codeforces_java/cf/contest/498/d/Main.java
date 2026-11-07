import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).allMatch(i -> (raw[i] = (byte) (raw[i] == 'A' ? '0' : raw[i] == 'C' ? '1' : raw[i])) >= 0)
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(Integer.highestOneBit(Math.max(n, 2) - 1) * 2) instanceof Integer size
            && new int[2 * size * 60] instanceof int[] fa
            && new byte[2 * size * 60] instanceof byte[] nx
            && Integer.valueOf(Integer.numberOfTrailingZeros(size)) instanceof Integer lg
            && IntStream.range(0, size * 60).allMatch(x -> (fa[size * 60 + x] = x % 60 % (x / 60 < n ? g[1 + x / 60] : 2) == 0 ? 2 : 1) > 0 && (nx[size * 60 + x] = (byte) ((x % 60 + fa[size * 60 + x]) % 60)) >= 0)
            && IntStream.range(0, (size - 1) * 60).allMatch(x -> (fa[(size - 1 - x / 60) * 60 + (x % 60)] = fa[(2 * (size - 1 - x / 60)) * 60 + (x % 60)] + fa[(2 * (size - 1 - x / 60) + 1) * 60 + nx[(2 * (size - 1 - x / 60)) * 60 + (x % 60)]] ) > 0 && (nx[(size - 1 - x / 60) * 60 + (x % 60)] = nx[(2 * (size - 1 - x / 60) + 1) * 60 + nx[(2 * (size - 1 - x / 60)) * 60 + (x % 60)]]) >= 0)
            && Integer.valueOf(g[n + 1]) instanceof Integer q
            && new StringBuilder() instanceof StringBuilder sb
            && new int[40] instanceof int[] stk
            && IntStream.range(0, q).allMatch(k ->
                Integer.valueOf(n + 2 + 3 * k) instanceof Integer b
                && (g[b] == 1
                    ? Integer.valueOf(size + g[b + 1] - 1) instanceof Integer leaf
                        && IntStream.range(0, (lg + 1) * 60).allMatch(x -> x < 60
                                ? (fa[leaf * 60 + x] = x % g[b + 2] == 0 ? 2 : 1) > 0 && (nx[leaf * 60 + x] = (byte) ((x + fa[leaf * 60 + x]) % 60)) >= 0
                                : (fa[(leaf >> (x / 60)) * 60 + (x % 60)] = fa[(2 * (leaf >> (x / 60))) * 60 + (x % 60)] + fa[(2 * (leaf >> (x / 60)) + 1) * 60 + nx[(2 * (leaf >> (x / 60))) * 60 + (x % 60)]]) > 0 && (nx[(leaf >> (x / 60)) * 60 + (x % 60)] = nx[(2 * (leaf >> (x / 60)) + 1) * 60 + nx[(2 * (leaf >> (x / 60))) * 60 + (x % 60)]]) >= 0)
                    : new int[]{0, 0} instanceof int[] tt
                        && LongStream.iterate(((long) (size + g[b + 1] - 1) << 32) | (size + g[b + 2] - 1), st -> (int) (st >>> 32) < (int) st, st ->
                            Integer.valueOf((int) (st >>> 32)) instanceof Integer lo
                            && Integer.valueOf((int) st) instanceof Integer hi
                            && ((lo & 1) == 0 || (tt[0] += fa[lo * 60 + tt[0] % 60]) >= 0)
                            && ((hi & 1) == 0 || (stk[tt[1]++] = hi - 1) >= 0)
                                ? ((long) ((lo + (lo & 1)) >> 1) << 32) | (hi >> 1)
                                : 0L).count() >= 0
                        && IntStream.iterate(tt[1] - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (tt[0] += fa[stk[i] * 60 + tt[0] % 60]) >= 0)
                        && sb.append(tt[0]).append('\n') != null))
            ? sb
            : "");
    }
}
