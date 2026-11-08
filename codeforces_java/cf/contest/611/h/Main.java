import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(String.valueOf(n).length()) instanceof Integer k
            && IntStream.range(0, 8).map(d -> (int) Math.round(Math.pow(10, d))).toArray() instanceof int[] pw
            && IntStream.range(0, k).map(d -> Math.min(n, pw[d + 1] - 1) - pw[d]).toArray() instanceof int[] q
            && new int[36] instanceof int[] mc
            && IntStream.range(0, n - 1).filter(e -> ++mc[Math.min(t[1 + 2 * e].length(), t[2 + 2 * e].length()) * 6 - 6 + Math.max(t[1 + 2 * e].length(), t[2 + 2 * e].length()) - 1] > 0).count() >= 0
            && IntStream.range(0, 36).filter(x -> x / 6 < x % 6).toArray() instanceof int[] offs
            && Integer.valueOf(IntStream.range(0, 1 << 15).filter(mask -> Integer.bitCount(mask) == k - 1
                && IntStream.range(0, 15).allMatch(p -> (mask >> p & 1) == 0 || (offs[p] % 6 < k && mc[offs[p]] > 0))
                && new int[]{1} instanceof int[] rc
                && IntStream.range(0, 6).filter(it -> IntStream.range(0, 15).filter(p -> (mask >> p & 1) == 1 && (rc[0] >> offs[p] / 6 & 1) != (rc[0] >> offs[p] % 6 & 1))
                    .filter(p -> (rc[0] |= 1 << offs[p] / 6 | 1 << offs[p] % 6) > 0).count() >= 0).count() >= 0
                && rc[0] == (1 << k) - 1
                && IntStream.range(1, 1 << k).allMatch(Q -> IntStream.range(0, 36).filter(ty -> ty / 6 <= ty % 6 && ty % 6 < k && (Q >> ty / 6 & 1) == 1 && (Q >> ty % 6 & 1) == 1)
                    .map(ty -> mc[ty] - (ty / 6 < ty % 6 && (mask >> Arrays.binarySearch(offs, ty) & 1) == 1 ? 1 : 0)).sum()
                    <= IntStream.range(0, k).filter(d -> (Q >> d & 1) == 1).map(d -> q[d]).sum())).findFirst().orElse(-1)) instanceof Integer mk
            && mk >= 0
            && new int[44][44] instanceof int[][] cap
            && IntStream.range(0, 36).filter(ty -> ty / 6 <= ty % 6 && ty % 6 < k).filter(ty -> (cap[0][1 + ty] = mc[ty] - (ty / 6 < ty % 6 && (mk >> Arrays.binarySearch(offs, ty) & 1) == 1 ? 1 : 0)) >= 0
                && (cap[1 + ty][37 + ty / 6] = 1000000000) > 0 && (cap[1 + ty][37 + ty % 6] = 1000000000) > 0).count() >= 0
            && IntStream.range(0, k).filter(d -> (cap[37 + d][43] = q[d]) >= 0).count() >= 0
            && new int[44] instanceof int[] prev && new int[44] instanceof int[] qu && new int[]{0} instanceof int[] tl
            && IntStream.range(0, 20000).takeWhile(it -> IntStream.range(0, 44).filter(x -> (prev[x] = -1) < 0).count() >= 0 && (prev[0] = 0) == 0 && (qu[0] = 0) == 0 && (tl[0] = 1) == 1
                && IntStream.range(0, 44).takeWhile(h -> h < tl[0]).filter(h -> IntStream.range(0, 44).filter(v -> cap[qu[h]][v] > 0 && prev[v] < 0 && (prev[v] = qu[h]) >= 0 && (qu[tl[0]++] = v) >= 0).count() >= 0).count() >= 0
                && prev[43] >= 0
                && Integer.valueOf(IntStream.iterate(43, x -> x != 0, x -> prev[x]).map(x -> cap[prev[x]][x]).min().getAsInt()) instanceof Integer bn
                && IntStream.iterate(43, x -> x != 0, x -> prev[x]).filter(x -> (cap[prev[x]][x] -= bn) >= -1000000000 && (cap[x][prev[x]] += bn) > -1).count() >= 0).count() >= 0
            ? Stream.concat(IntStream.range(0, 15).filter(p -> (mk >> p & 1) == 1).mapToObj(p -> pw[offs[p] / 6] + " " + pw[offs[p] % 6]),
                IntStream.range(0, k).boxed().flatMap(d -> IntStream.range(0, 36).filter(ty -> ty / 6 <= ty % 6 && ty % 6 < k && (ty / 6 == d || ty % 6 == d))
                    .flatMap(ty -> IntStream.range(0, cap[37 + d][1 + ty]).map(z -> pw[ty / 6 == d ? ty % 6 : ty / 6])).toArray() instanceof int[] tg
                    ? IntStream.range(0, tg.length).mapToObj(j -> (pw[d] + 1 + j) + " " + tg[j]) : Stream.<String>empty())).collect(Collectors.joining("\n")) : "-1");
    }
}
