import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m && (Integer) v[2] instanceof Integer q
            && Integer.valueOf((n + 15) / 16 * 16) instanceof Integer W && IntStream.range(0, n).mapToObj(r0 -> IntStream.range(0, W).map(c0 -> r0 == c0 ? 0 : 1 << 29).toArray()).toArray(int[][]::new) instanceof int[][] dd && new int[m + 2] instanceof int[] head && new int[q] instanceof int[] nxt && new boolean[q] instanceof boolean[] res
            && IntStream.rangeClosed(0, m + 1).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, q).filter(j -> (nxt[j] = head[v[3 + 2 * m + 4 * j]]) + (head[v[3 + 2 * m + 4 * j]] = j) < -1).count() == 0
            && IntStream.range(0, m).map(k -> m - k).filter(i -> dd[v[1 + 2 * i] - 1] instanceof int[] ra && dd[v[2 + 2 * i] - 1] instanceof int[] rb
                && (Stream.of(0).peek(z -> IntStream.range(0, W / 16).forEach(cc -> Math.max(Math.max(Math.max(Math.max((ra[(cc << 4) + 0] = rb[(cc << 4) + 0] = Math.min(ra[(cc << 4) + 0], rb[(cc << 4) + 0])), (ra[(cc << 4) + 1] = rb[(cc << 4) + 1] = Math.min(ra[(cc << 4) + 1], rb[(cc << 4) + 1]))), Math.max((ra[(cc << 4) + 2] = rb[(cc << 4) + 2] = Math.min(ra[(cc << 4) + 2], rb[(cc << 4) + 2])), (ra[(cc << 4) + 3] = rb[(cc << 4) + 3] = Math.min(ra[(cc << 4) + 3], rb[(cc << 4) + 3])))), Math.max(Math.max((ra[(cc << 4) + 4] = rb[(cc << 4) + 4] = Math.min(ra[(cc << 4) + 4], rb[(cc << 4) + 4])), (ra[(cc << 4) + 5] = rb[(cc << 4) + 5] = Math.min(ra[(cc << 4) + 5], rb[(cc << 4) + 5]))), Math.max((ra[(cc << 4) + 6] = rb[(cc << 4) + 6] = Math.min(ra[(cc << 4) + 6], rb[(cc << 4) + 6])), (ra[(cc << 4) + 7] = rb[(cc << 4) + 7] = Math.min(ra[(cc << 4) + 7], rb[(cc << 4) + 7]))))), Math.max(Math.max(Math.max((ra[(cc << 4) + 8] = rb[(cc << 4) + 8] = Math.min(ra[(cc << 4) + 8], rb[(cc << 4) + 8])), (ra[(cc << 4) + 9] = rb[(cc << 4) + 9] = Math.min(ra[(cc << 4) + 9], rb[(cc << 4) + 9]))), Math.max((ra[(cc << 4) + 10] = rb[(cc << 4) + 10] = Math.min(ra[(cc << 4) + 10], rb[(cc << 4) + 10])), (ra[(cc << 4) + 11] = rb[(cc << 4) + 11] = Math.min(ra[(cc << 4) + 11], rb[(cc << 4) + 11])))), Math.max(Math.max((ra[(cc << 4) + 12] = rb[(cc << 4) + 12] = Math.min(ra[(cc << 4) + 12], rb[(cc << 4) + 12])), (ra[(cc << 4) + 13] = rb[(cc << 4) + 13] = Math.min(ra[(cc << 4) + 13], rb[(cc << 4) + 13]))), Math.max((ra[(cc << 4) + 14] = rb[(cc << 4) + 14] = Math.min(ra[(cc << 4) + 14], rb[(cc << 4) + 14])), (ra[(cc << 4) + 15] = rb[(cc << 4) + 15] = Math.min(ra[(cc << 4) + 15], rb[(cc << 4) + 15])))))))).findFirst().isPresent() ? 0 : 1)
                    + (ra[v[1 + 2 * i] - 1] = 0) + (rb[v[2 + 2 * i] - 1] = 0) + (ra[v[2 + 2 * i] - 1] = i) + (rb[v[1 + 2 * i] - 1] = i)
                    + IntStream.iterate(head[i], j -> j >= 0, j -> nxt[j]).filter(j -> res[j] = dd[v[5 + 2 * m + 4 * j] - 1][v[6 + 2 * m + 4 * j] - 1] <= v[4 + 2 * m + 4 * j]).count() < 0).count() == 0
            ? IntStream.range(0, q).mapToObj(j -> res[j] ? "Yes" : "No").collect(Collectors.joining("\n")) : "");
    }
}
