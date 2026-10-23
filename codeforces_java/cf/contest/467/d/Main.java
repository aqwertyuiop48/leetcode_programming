import java.util.Arrays;
import java.util.HashMap;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer m
            && Integer.valueOf(t[m + 1]) instanceof Integer n
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> map
            && new int[1] instanceof int[] cnt
            && new int[m + 2 * n + 2] instanceof int[] rr
            && new int[m + 2 * n + 2] instanceof int[] ln
            && ((ToIntFunction<String>) w ->
                map.computeIfAbsent(w.toLowerCase(), k -> cnt[0]++) instanceof Integer id
                && (rr[id] = (int) w.chars().filter(c -> c == 'r' || c == 'R').count()) >= 0
                && (ln[id] = w.length()) > 0
                ? id : -1) instanceof ToIntFunction<String> idOf
            && IntStream.range(0, m).map(i -> idOf.applyAsInt(t[1 + i])).toArray() instanceof int[] ew
            && IntStream.range(0, 2 * n).map(i -> idOf.applyAsInt(t[m + 2 + i])).toArray() instanceof int[] ed
            && new int[cnt[0] + 1] instanceof int[] rh
            && new int[n + 1] instanceof int[] nx
            && IntStream.range(0, n).allMatch(i ->
                (nx[i + 1] = rh[ed[2 * i + 1]]) >= 0 && (rh[ed[2 * i + 1]] = i + 1) > 0)
            && IntStream.range(0, cnt[0]).mapToLong(i -> ((long) rr[i] << 19 | ln[i]) << 19 | i).sorted().toArray() instanceof long[] keys
            && new long[cnt[0]] instanceof long[] best
            && IntStream.range(0, cnt[0]).allMatch(i -> (best[i] = -1) < 0)
            && new int[cnt[0] + 1] instanceof int[] stk
            && new int[1] instanceof int[] sp
            && Arrays.stream(keys).allMatch(key ->
                (Integer) (int) (key & 524287) instanceof Integer id
                && (best[id] >= 0
                    || ((best[id] = key >>> 19) >= 0
                        && (stk[0] = id) >= 0
                        && (sp[0] = 1) == 1
                        && IntStream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z ->
                            (Integer) stk[--sp[0]] instanceof Integer u
                            && IntStream.iterate(rh[u], e -> e != 0, e -> nx[e]).allMatch(e ->
                                best[ed[2 * (e - 1)]] >= 0
                                || ((best[ed[2 * (e - 1)]] = key >>> 19) >= 0
                                    && (stk[sp[0]++] = ed[2 * (e - 1)]) >= 0))))))
            ? IntStream.range(0, m).mapToLong(i -> best[ew[i]] >>> 19).sum() + " " + IntStream.range(0, m).mapToLong(i -> best[ew[i]] & 524287).sum()
            : "");
    }
}
