import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new int[n] instanceof int[] a && new long[n] instanceof long[] key && new int[n] instanceof int[] xs
            && IntStream.range(0, n).filter(i -> (a[i] = Integer.parseInt(tk.nextToken())) > 0 & (key[i] = Long.parseLong(tk.nextToken())) > 0 & (xs[i] = Integer.parseInt(tk.nextToken())) > 0 & (key[i] += (long) xs[i] << 30) > 0).count() >= 0
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> key[i])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && new int[n] instanceof int[] pos && new int[n] instanceof int[] gs && new int[]{0, -1} instanceof int[] cur
            && IntStream.range(0, n).filter(r -> (pos[ord[r]] = r) >= 0 & (xs[ord[r]] == cur[1] || ((cur[0] = r) >= 0 & (cur[1] = xs[ord[r]]) > 0)) & (gs[ord[r]] = cur[0]) >= 0).count() >= 0
            && new int[n + 2] instanceof int[] bit
            ? IntStream.range(0, n).mapToObj(i -> a[i] == 3
                ? String.valueOf(IntStream.iterate(pos[i] + 1, k -> k > 0, k -> k - (k & -k)).map(k -> bit[k]).sum() - IntStream.iterate(gs[i], k -> k > 0, k -> k - (k & -k)).map(k -> bit[k]).sum())
                : IntStream.iterate(pos[i] + 1, k -> k <= n, k -> k + (k & -k)).filter(k -> (bit[k] += a[i] == 1 ? 1 : -1) != Integer.MIN_VALUE).count() < 0 ? "" : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
