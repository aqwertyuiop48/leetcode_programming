import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer q
            && new int[q] instanceof int[] typ
            && new int[q] instanceof int[] pa
            && new int[q] instanceof int[] pb
            && new TreeSet<Long>() instanceof TreeSet<Long> gaps
            && gaps.add((long) n << 31)
            && new TreeSet<Integer>() instanceof TreeSet<Integer> occ
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> where
            && new int[]{2} instanceof int[] ptr
            && IntStream.range(0, q).allMatch(i ->
                g0[ptr[0]] == 0
                    ? (typ[i] = 0) == 0 && (pa[i] = g0[ptr[0] + 1]) >= 0 && (pb[i] = g0[ptr[0] + 2]) >= 0 && (ptr[0] += 3) > 0
                    : (Integer) g0[ptr[0]++] instanceof Integer id
                        && (where.containsKey(id)
                            ? (Integer) where.remove(id) instanceof Integer p
                                && (Integer) (occ.lower(p) == null ? 0 : occ.lower(p)) instanceof Integer lo
                                && (Integer) (occ.higher(p) == null ? n + 1 : occ.higher(p)) instanceof Integer hi
                                && occ.remove(p)
                                && (gaps.remove((long) (p - lo - 1) << 31 | lo) || true)
                                && (gaps.remove((long) (hi - p - 1) << 31 | p) || true)
                                && gaps.add((long) (hi - lo - 1) << 31 | lo)
                                && (typ[i] = 2) == 2
                                && (pa[i] = p) >= 0
                            : gaps.pollLast() instanceof Long g
                                && (Integer) (int) (g & 2147483647L) instanceof Integer st
                                && (Integer) (int) (g >>> 31) instanceof Integer len
                                && (Integer) (st + 1 + len / 2) instanceof Integer mid
                                && occ.add(mid)
                                && where.put(id, mid) == null
                                && (mid - st - 1 == 0 || gaps.add((long) (mid - st - 1) << 31 | st))
                                && (st + len - mid == 0 || gaps.add((long) (st + len - mid) << 31 | mid))
                                && (typ[i] = 1) == 1
                                && (pa[i] = mid) >= 0))
            && IntStream.range(0, q).filter(i -> typ[i] != 0).map(i -> pa[i]).sorted().distinct().toArray() instanceof int[] pos
            && Integer.valueOf(pos.length) instanceof Integer m
            && new int[m + 1] instanceof int[] bit
            && new int[3] instanceof int[] reg
            && ((IntUnaryOperator) x -> (Integer) Arrays.binarySearch(pos, x) instanceof Integer b ? (b >= 0 ? b + 1 : -b - 1) : 0) instanceof IntUnaryOperator le
            && ((IntUnaryOperator) x ->
                (reg[0] = x) >= 0 & (reg[1] = 0) == 0
                & IntStream.range(0, 20).allMatch(z -> reg[0] <= 0 || ((reg[1] += bit[reg[0]]) >= 0 && (reg[0] -= reg[0] & -reg[0]) >= 0))
                ? reg[1] : -1) instanceof IntUnaryOperator pre
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, q).allMatch(i ->
                typ[i] == 0
                    ? sb.append(pre.applyAsInt(le.applyAsInt(pb[i])) - pre.applyAsInt(le.applyAsInt(pa[i] - 1))).append('\n') != null
                    : (reg[2] = le.applyAsInt(pa[i])) > 0
                        && IntStream.range(0, 20).allMatch(z -> reg[2] > m || ((bit[reg[2]] += typ[i] == 1 ? 1 : -1) > Integer.MIN_VALUE && (reg[2] += reg[2] & -reg[2]) > 0)))
            ? sb.toString()
            : "");
    }
}

