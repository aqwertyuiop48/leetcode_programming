import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).allMatch(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) == 1
                : st[1] == 0 || ((nums[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0))
            && (st[1] == 0 || (nums[st[2]++] = st[0]) >= 0)
            && Integer.valueOf(nums[0]) instanceof Integer n && Integer.valueOf(nums[1]) instanceof Integer e
            && new int[n + 2] instanceof int[] ds && new int[n + 2] instanceof int[] ws && new int[n + 2] instanceof int[] wl
            && IntStream.range(0, e).allMatch(i -> ++ds[nums[2 + 2 * i]] > 0 && ++ds[nums[3 + 2 * i]] > 0)
            && IntStream.rangeClosed(1, n).allMatch(v -> (ds[v + 1] += ds[v]) >= 0)
            && new int[2 * e + 1] instanceof int[] adj && new int[n + 2] instanceof int[] fill
            && IntStream.range(0, e).allMatch(i -> Integer.valueOf(nums[2 + 2 * i]) instanceof Integer a && Integer.valueOf(nums[3 + 2 * i]) instanceof Integer b
                && (adj[ds[a - 1] + fill[a]++] = b) > 0 && (adj[ds[b - 1] + fill[b]++] = a) > 0)
            && new int[]{2 + 2 * e, 0} instanceof int[] pp
            && IntStream.rangeClosed(1, n).allMatch(v -> (wl[v] = nums[pp[0]]) > 0 && (ws[v] = pp[0] + 1) > 0
                && (pp[1] = Math.max(pp[1], IntStream.range(ws[v], ws[v] + wl[v]).map(j -> nums[j]).max().getAsInt())) >= 0 && (pp[0] += wl[v] + 1) > 0)
            && Integer.valueOf(pp[1]) instanceof Integer tt
            && new String[1] instanceof String[] res
            && IntStream.range(0, 300).anyMatch(att -> new Random(att * 7919L + 12345) instanceof Random rnd
                && new byte[tt + 1] instanceof byte[] ally && new int[n + 1] instanceof int[] mask && new int[n + 1] instanceof int[] side
                && IntStream.rangeClosed(1, tt).allMatch(t -> (ally[t] = (byte) (1 + rnd.nextInt(2))) > 0)
                && IntStream.rangeClosed(1, n).allMatch(v -> (mask[v] = IntStream.range(ws[v], ws[v] + wl[v]).map(j -> 1 << (ally[nums[j]] - 1)).reduce(0, (x, y) -> x | y)) > 0)
                && IntStream.rangeClosed(1, n).allMatch(v -> Integer.valueOf((int) IntStream.range(ds[v - 1], ds[v]).filter(j -> side[adj[j]] == 1).count()) instanceof Integer c1
                    && Integer.valueOf((int) IntStream.range(ds[v - 1], ds[v]).filter(j -> side[adj[j]] == 2).count()) instanceof Integer c2
                    && Integer.valueOf(c1 > c2 ? 2 : 1) instanceof Integer pref
                    && (side[v] = (mask[v] & pref) != 0 ? pref : 3 - pref) > 0)
                && IntStream.range(0, 4).allMatch(rd -> IntStream.rangeClosed(1, n).filter(v -> mask[v] == 3).allMatch(v ->
                    Integer.valueOf((int) IntStream.range(ds[v - 1], ds[v]).filter(j -> side[adj[j]] == side[v]).count()) instanceof Integer same
                    && (2 * same <= ds[v] - ds[v - 1] || (side[v] = 3 - side[v]) > 0 || true)) || true)
                && 2L * IntStream.range(0, e).filter(i -> side[nums[2 + 2 * i]] != side[nums[3 + 2 * i]]).count() >= e
                && (res[0] = IntStream.rangeClosed(1, n).mapToObj(v -> String.valueOf(IntStream.range(ws[v], ws[v] + wl[v]).map(j -> nums[j]).filter(t -> ally[t] == side[v]).findFirst().getAsInt())).collect(Collectors.joining(" "))
                    + "\n" + IntStream.rangeClosed(1, tt).mapToObj(t -> String.valueOf((int) ally[t])).collect(Collectors.joining(" "))) != null)
            ? res[0] : "");
    }
}
