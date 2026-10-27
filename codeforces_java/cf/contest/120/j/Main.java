import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        (new java.io.File("input.txt").exists() ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true) : System.out).println(
            Arrays.stream(new String((new java.io.File("input.txt").exists() ? new java.io.FileInputStream("input.txt") : System.in).readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(4 * t[0]) instanceof Integer N
            && IntStream.range(0, N).map(p -> t[1 + 2 * (p / 4)] * (p % 2 == 1 ? -1 : 1)).toArray() instanceof int[] px
            && IntStream.range(0, N).map(p -> t[2 + 2 * (p / 4)] * (p % 4 >= 2 ? -1 : 1)).toArray() instanceof int[] py
            && LongStream.range(0, N).map(p -> ((long) (px[(int) p] + 20000) << 20) | p).sorted().toArray() instanceof long[] order
            && new TreeSet<Long>() instanceof TreeSet<Long> set
            && new long[]{Long.MAX_VALUE, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, N).allMatch(pos ->
                (Integer) (int) (order[pos] & 0xFFFFF) instanceof Integer p
                && (st[3] >= pos || (long) (px[p] - px[(int) (order[(int) st[3]] & 0xFFFFF)]) * (px[p] - px[(int) (order[(int) st[3]] & 0xFFFFF)]) < st[0]
                    || IntStream.iterate((int) st[3], j -> j < pos
                        && (long) (px[p] - px[(int) (order[j] & 0xFFFFF)]) * (px[p] - px[(int) (order[j] & 0xFFFFF)]) >= st[0], j -> j + 1)
                    .allMatch(j -> set.remove(((long) (py[(int) (order[j] & 0xFFFFF)] + 20000) << 20) | (order[j] & 0xFFFFF))
                        && (st[3] = j + 1) > 0))
                && (Long) (st[0] == Long.MAX_VALUE ? 40000L : (long) Math.ceil(Math.sqrt(st[0]))) instanceof Long dy
                && (set.subSet((long) (py[p] - dy + 20000) << 20, true, ((long) (py[p] + dy + 20000) << 20) | 0xFFFFF, true).isEmpty()
                    || set.subSet((long) (py[p] - dy + 20000) << 20, true, ((long) (py[p] + dy + 20000) << 20) | 0xFFFFF, true).stream().allMatch(k ->
                    (Integer) (int) (k & 0xFFFFF) instanceof Integer q
                    && (Long) ((long) (px[p] - px[q]) * (px[p] - px[q]) + (long) (py[p] - py[q]) * (py[p] - py[q])) instanceof Long d2
                    && (q / 4 == p / 4 || d2 >= st[0] || ((st[0] = d2) >= 0 && (st[1] = q) >= 0 && (st[2] = p) >= 0))))
                && set.add(((long) (py[p] + 20000) << 20) | p))
            ? (st[1] / 4 + 1) + " " + (st[1] % 4 + 1) + " " + (st[2] / 4 + 1) + " " + (3 - st[2] % 4 + 1)
            : "");
    }
}

