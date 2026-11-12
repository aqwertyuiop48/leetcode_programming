import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[(int) IntStream.range(0, raw.length).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).count()] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (ps[1] = raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) : (i > 0 && raw[i - 1] > 47 ? 0 * (t[ps[2]++] = ps[0]) + (ps[0] = 0) : 0)) < 0).count() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n + 1] instanceof int[] pos && new int[n + 1] instanceof int[] lim
            && IntStream.rangeClosed(1, n).filter(i -> (pos[t[1 + i]] = i) < 0).count() == 0
            && IntStream.range(0, m).filter(i -> Integer.valueOf(pos[t[n + 2 + 2 * i]]) instanceof Integer x && Integer.valueOf(pos[t[n + 3 + 2 * i]]) instanceof Integer y
                && (lim[Math.max(x, y)] = Math.max(lim[Math.max(x, y)], Math.min(x, y))) < 0).count() == 0
            && new long[]{0, 0} instanceof long[] q
            && IntStream.rangeClosed(1, n).filter(r -> (q[1] += r - (q[0] = Math.max(q[0], lim[r]))) < 0).count() == 0
            ? q[1] : "");
    }
}
