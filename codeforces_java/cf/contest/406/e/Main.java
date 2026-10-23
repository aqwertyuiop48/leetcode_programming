import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Long) Long.parseLong(tk.nextToken()) instanceof Long n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> (Long.parseLong(tk.nextToken()) * n + Long.parseLong(tk.nextToken())) % (2 * n)).sorted().toArray() instanceof long[] p
            && new int[]{0} instanceof int[] r && new int[m] instanceof int[] cnt
            && IntStream.range(0, m).allMatch(i -> (r[0] = Math.max(r[0], i + 1)) >= 0
                && (r[0] >= i + m || (r[0] < m ? p[r[0]] : p[r[0] - m] + 2 * n) - p[i] >= n || IntStream.range(0, 2 * m).anyMatch(z -> !(r[0] < i + m && (r[0] < m ? p[r[0]] : p[r[0] - m] + 2 * n) - p[i] < n && ++r[0] > 0)) || true)
                && (cnt[i] = r[0] - i - 1) >= 0)
            && (Long) (IntStream.of(cnt).mapToLong(c -> (long) c * (c - 1) / 2).sum()) instanceof Long unb && (Long) ((long) m * (m - 1) * (m - 2) / 6 - unb) instanceof Long bal
            ? "" + (bal > 0 ? bal
                : (Integer) IntStream.range(0, m).filter(i -> cnt[i] == m - 1).findFirst().getAsInt() instanceof Integer st && LongStream.of(p).map(v -> Math.floorMod(v - p[st], 2 * n)).toArray() instanceof long[] rr
                    && (Long) LongStream.of(rr).max().getAsLong() instanceof Long D && (Long) LongStream.of(rr).filter(v -> v == 0).count() instanceof Long a && (Long) LongStream.of(rr).filter(v -> v == D).count() instanceof Long b
                    ? D == 0 ? (long) m * (m - 1) * (m - 2) / 6 : a * b * (m - a - b) + a * (a - 1) / 2 * b + a * (b * (b - 1) / 2) : 0L) : "");
    }
}
