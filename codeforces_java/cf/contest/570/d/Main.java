import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && (Integer) nums[1] instanceof Integer m
            && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] > 57).findFirst().getAsInt() instanceof Integer ls
            && new int[n + 1] instanceof int[] dep
            && new int[n + 1] instanceof int[] sz
            && new int[n + 1] instanceof int[] tin
            && new int[n + 1] instanceof int[] nxt
            && new int[n] instanceof int[] byTin
            && new int[n + 3] instanceof int[] sd
            && new int[n + 3] instanceof int[] pos
            && new int[n] instanceof int[] stin
            && new int[n + 1] instanceof int[] pre
            && new int[n] instanceof int[] mk
            && (dep[1] = 1) + (nxt[1] = 1) > 0
            && IntStream.rangeClosed(2, n).filter(i -> (dep[i] = dep[nums[i]] + 1) > 0 || true).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> (sz[i] = 1) > 0 || true).count() >= 0
            && IntStream.range(0, n - 1).filter(j -> (sz[nums[n - j]] += sz[n - j]) > 0 || true).count() >= 0
            && IntStream.rangeClosed(2, n).filter(i -> (tin[i] = nxt[nums[i]]) + (nxt[nums[i]] += sz[i]) + (nxt[i] = tin[i] + 1) > 0 || true).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> (byTin[tin[i]] = i) > 0 && (sd[dep[i] + 1]++) >= 0 || true).count() >= 0
            && IntStream.rangeClosed(1, n + 2).filter(d -> (sd[d] += sd[d - 1]) >= 0 || true).count() >= 0
            && IntStream.rangeClosed(0, n + 2).filter(d -> (pos[d] = sd[d]) >= 0 || true).count() >= 0
            && IntStream.range(0, n).filter(t -> (Integer) byTin[t] instanceof Integer nd
                && (Integer) pos[dep[nd]]++ instanceof Integer ps
                && (stin[ps] = t) + (mk[ps] = 1 << (raw[ls + nd - 1] - 97)) >= 0 || true).count() >= 0
            && IntStream.range(0, n).filter(i -> (pre[i + 1] = pre[i] ^ mk[i]) >= 0 || true).count() >= 0
            ? IntStream.range(0, m).mapToObj(q -> (Integer) nums[n + 1 + 2 * q] instanceof Integer v
                && (Integer) nums[n + 2 + 2 * q] instanceof Integer h
                && (h < dep[v] ? "Yes" : ((Integer) Arrays.binarySearch(stin, sd[h], sd[h + 1], tin[v]) instanceof Integer a
                    && (Integer) Arrays.binarySearch(stin, sd[h], sd[h + 1], tin[v] + sz[v]) instanceof Integer b
                    && (Integer) (pre[a >= 0 ? a : -a - 1] ^ pre[b >= 0 ? b : -b - 1]) instanceof Integer mask
                    ? ((mask & (mask - 1)) == 0 ? "Yes" : "No") : "?")) instanceof String res ? res : "?").collect(Collectors.joining("\n"))
            : "");
    }
}
