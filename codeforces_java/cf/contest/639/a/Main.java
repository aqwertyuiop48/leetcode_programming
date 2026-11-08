import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer k && Integer.valueOf(v[2]) instanceof Integer q
            && new int[k] instanceof int[] ids && new boolean[n + 1] instanceof boolean[] shown && new int[]{0} instanceof int[] cnt
            ? IntStream.range(0, q).mapToObj(i -> v[3 + n + 2 * i] == 1
                ? (cnt[0] < k
                    ? (ids[cnt[0]++] = v[4 + n + 2 * i]) > 0 && (shown[v[4 + n + 2 * i]] = true)
                    : IntStream.range(0, k).boxed().min(Comparator.comparingInt(j -> v[2 + ids[j]])).get() instanceof Integer mi
                        && v[2 + v[4 + n + 2 * i]] > v[2 + ids[mi]] && !(shown[ids[mi]] = false) && (shown[ids[mi] = v[4 + n + 2 * i]] = true)) ? (String) null : (String) null
                : shown[v[4 + n + 2 * i]] ? "YES" : "NO").filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}
