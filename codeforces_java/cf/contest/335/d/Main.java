import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((t[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(3002) instanceof Integer M
            && new int[M * M] instanceof int[] pf && new int[M * M] instanceof int[] tl && new int[M * M] instanceof int[] br
            && IntStream.range(0, n).allMatch(r -> (pf[(t[1 + 4 * r] + 1) * M + t[2 + 4 * r] + 1] += 1) > Integer.MIN_VALUE
                && (pf[(t[3 + 4 * r] + 1) * M + t[2 + 4 * r] + 1] -= 1) > Integer.MIN_VALUE
                && (pf[(t[1 + 4 * r] + 1) * M + t[4 + 4 * r] + 1] -= 1) > Integer.MIN_VALUE
                && (pf[(t[3 + 4 * r] + 1) * M + t[4 + 4 * r] + 1] += 1) > Integer.MIN_VALUE
                && (tl[t[1 + 4 * r] * M + t[2 + 4 * r]] = r + 1) > 0 && (br[t[3 + 4 * r] * M + t[4 + 4 * r]] = r + 1) > 0)
            && IntStream.range(1, M).allMatch(i -> IntStream.range(1, M).allMatch(j -> (pf[i * M + j] += pf[(i - 1) * M + j] + pf[i * M + j - 1] - pf[(i - 1) * M + j - 1]) > Integer.MIN_VALUE))
            && IntStream.range(1, M).allMatch(i -> IntStream.range(1, M).allMatch(j -> (pf[i * M + j] += pf[(i - 1) * M + j] + pf[i * M + j - 1] - pf[(i - 1) * M + j - 1]) > Integer.MIN_VALUE))
            && new int[n] instanceof int[] bR && new int[n] instanceof int[] lU && new int[n] instanceof int[] up && new int[n] instanceof int[] lf
            && IntStream.range(0, n).mapToLong(r -> (long) t[1 + 4 * r] << 20 | r).sorted().toArray() instanceof long[] ox1
            && IntStream.range(0, n).mapToLong(r -> (long) t[2 + 4 * r] << 20 | r).sorted().toArray() instanceof long[] oy1
            && IntStream.range(0, n).mapToLong(r -> (long) t[3 + 4 * r] << 20 | r).sorted().toArray() instanceof long[] ox2
            && IntStream.range(0, n).mapToLong(r -> (long) t[4 + 4 * r] << 20 | r).sorted().toArray() instanceof long[] oy2
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf((int) (ox1[i] & 1048575)) instanceof Integer r
                && (bR[r] = t[3 + 4 * r] - t[1 + 4 * r] + (tl[t[3 + 4 * r] * M + t[2 + 4 * r]] > 0 ? bR[tl[t[3 + 4 * r] * M + t[2 + 4 * r]] - 1] : 0)) > 0)
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf((int) (oy1[i] & 1048575)) instanceof Integer r
                && (lU[r] = t[4 + 4 * r] - t[2 + 4 * r] + (tl[t[1 + 4 * r] * M + t[4 + 4 * r]] > 0 ? lU[tl[t[1 + 4 * r] * M + t[4 + 4 * r]] - 1] : 0)) > 0)
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf((int) (ox2[i] & 1048575)) instanceof Integer r
                && (up[r] = t[3 + 4 * r] - t[1 + 4 * r] + (br[t[1 + 4 * r] * M + t[4 + 4 * r]] > 0 ? up[br[t[1 + 4 * r] * M + t[4 + 4 * r]] - 1] : 0)) > 0)
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf((int) (oy2[i] & 1048575)) instanceof Integer r
                && (lf[r] = t[4 + 4 * r] - t[2 + 4 * r] + (br[t[3 + 4 * r] * M + t[2 + 4 * r]] > 0 ? lf[br[t[3 + 4 * r] * M + t[2 + 4 * r]] - 1] : 0)) > 0)
            && IntStream.range(0, n).mapToObj(r -> Integer.valueOf(t[1 + 4 * r]) instanceof Integer x && Integer.valueOf(t[2 + 4 * r]) instanceof Integer y
                && IntStream.rangeClosed(1, Math.min(bR[r], lU[r])).filter(s -> br[(x + s) * M + y + s] > 0 && up[br[(x + s) * M + y + s] - 1] >= s && lf[br[(x + s) * M + y + s] - 1] >= s
                    && pf[(x + s) * M + y + s] - pf[x * M + y + s] - pf[(x + s) * M + y] + pf[x * M + y] == s * s).findFirst() instanceof OptionalInt os && os.isPresent()
                ? new int[]{x, y, os.getAsInt()} : null).filter(Objects::nonNull).findFirst() instanceof Optional<int[]> res
            ? res.isPresent() ? IntStream.range(0, n).filter(r -> t[1 + 4 * r] >= res.get()[0] && t[2 + 4 * r] >= res.get()[1] && t[3 + 4 * r] <= res.get()[0] + res.get()[2] && t[4 + 4 * r] <= res.get()[1] + res.get()[2])
                .mapToObj(r -> String.valueOf(r + 1)).collect(Collectors.toList()) instanceof List<String> ids ? "YES " + ids.size() + "\n" + String.join(" ", ids) : "" : "NO" : "");
    }
}
