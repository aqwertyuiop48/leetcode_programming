import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1 + 2 * n]) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> ((long) g[1 + 2 * i] << 20) | i).sorted().toArray() instanceof long[] pk
            && IntStream.range(0, m).mapToLong(j -> ((long) g[2 + 2 * n + 3 * j] << 20) | j).sorted().toArray() instanceof long[] ak
            && IntStream.range(0, m).map(j -> g[4 + 2 * n + 3 * j]).toArray() instanceof int[] rem
            && new int[n] instanceof int[] ans
            && new TreeSet<Long>() instanceof TreeSet<Long> avail
            && new int[1] instanceof int[] pj
            && Arrays.stream(pk).allMatch(key ->
                Integer.valueOf((int) (key >> 20)) instanceof Integer a
                && Integer.valueOf((int) (key & 0xFFFFF)) instanceof Integer idx
                && IntStream.iterate(pj[0], x -> x < m && (ak[x] >> 20) <= a, x -> x + 1)
                    .allMatch(x -> avail.add(((long) g[3 + 2 * n + 3 * (int) (ak[x] & 0xFFFFF)] << 20) | (ak[x] & 0xFFFFF)) && (pj[0] = x + 1) > 0)
                && avail.ceiling((long) g[2 + 2 * idx] << 20) instanceof Long best
                && Integer.valueOf((int) (best & 0xFFFFF)) instanceof Integer j
                && (ans[idx] = j + 1) > 0
                && (--rem[j] > 0 || avail.remove(best)))
            ? "YES\n" + Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "NO");
    }
}
