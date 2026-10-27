import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(
            new java.io.FileInputStream("input.txt").readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i < raw.length ? (int) raw[i] : 32) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((t[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Integer.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(0, 2 * n).mapToLong(j -> ((long) t[2 + 3 * (j >> 1) + (j & 1)] + 1000000000L) << 20 | j).sorted().toArray() instanceof long[] keys
            && new TreeMap<Integer, Integer>() instanceof TreeMap<Integer, Integer> ms
            && new int[1] instanceof int[] cur
            && IntStream.range(0, 2 * n).mapToObj(j ->
                (Integer) (int) (keys[j] & 1048575) instanceof Integer ev
                && (ms.merge(t[1 + 3 * (ev >> 1)], (ev & 1) == 0 ? 1 : -1, (a, b) -> a + b == 0 ? null : a + b) == null || true)
                && (j + 1 < 2 * n && keys[j + 1] >> 20 == keys[j] >> 20 ? false : true)
                && (Integer) (ms.isEmpty() ? 0 : ms.lastKey()) instanceof Integer q
                && q != cur[0]
                && (Integer) cur[0] instanceof Integer p
                && (cur[0] = q) >= 0
                    ? ((keys[j] >> 20) - 1000000000L) + " " + p + "\n" + ((keys[j] >> 20) - 1000000000L) + " " + q
                    : "").filter(z -> !z.isEmpty()).toList() instanceof List<String> pts
            ? 2 * pts.size() + "\n" + String.join("\n", pts)
            : "");
    }
}


