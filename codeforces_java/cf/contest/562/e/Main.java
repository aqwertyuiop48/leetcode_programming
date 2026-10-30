import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[r0.length / 2 + 4] instanceof long[] v && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] == 1 && (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && (Integer) (int) v[0] instanceof Integer n && (Integer) (int) v[1] instanceof Integer m
            && IntStream.range(0, m).mapToLong(j -> v[4 + 2 * n + 2 * j] << 31 | v[5 + 2 * n + 2 * j]).sorted().toArray() instanceof long[] pts
            && new long[m + 1] instanceof long[] hx && new long[m + 1] instanceof long[] hy && new int[1] instanceof int[] top
            && Arrays.stream(pts).filter(k -> (Long) (k >> 31) instanceof Long px && (Long) (k & 2147483647L) instanceof Long py
                && Stream.generate(() -> 0).takeWhile(z -> top[0] >= 2 && (hx[top[0] - 1] - hx[top[0] - 2]) * (py - hy[top[0] - 2]) - (hy[top[0] - 1] - hy[top[0] - 2]) * (px - hx[top[0] - 2]) >= 0 && --top[0] >= 0).count() >= 0
                && (hx[top[0]] = px) >= 0 && (hy[top[0]++] = py) >= 0).count() >= 0
            && (Long) Arrays.stream(hy, 0, top[0]).max().getAsLong() instanceof Long my && (Integer) IntStream.range(0, top[0]).filter(i -> hy[i] == my).max().getAsInt() instanceof Integer t
            ? IntStream.range(0, n).allMatch(i -> (Long) v[4 + 2 * i] instanceof Long ax && (Long) v[5 + 2 * i] instanceof Long ay && (Integer) Arrays.binarySearch(hx, t, top[0], ax) instanceof Integer r && (Integer) (r >= 0 ? r : -r - 2) instanceof Integer k
                && (k < t ? ay < hy[t] : k < top[0] - 1 && (hx[k + 1] - hx[k]) * (ay - hy[k]) - (hy[k + 1] - hy[k]) * (ax - hx[k]) < 0)) ? "Min" : "Max" : "");
    }
}
