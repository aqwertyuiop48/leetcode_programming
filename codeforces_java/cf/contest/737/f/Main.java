import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(CompletableFuture.supplyAsync(() -> new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer a
            && Integer.valueOf(sc.nextInt()) instanceof Integer b
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] p
            && new int[n + 2] instanceof int[] suf
            && IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> (suf[i] = Math.max(p[i], suf[i + 1])) < 0).count() == 0
            && new int[n + 2] instanceof int[] pos
            && IntStream.range(0, n).filter(i -> (pos[p[i]] = i) < 0).count() == 0
            && IntStream.rangeClosed(0, n + 1).map(v -> IntStream.rangeClosed(v + 1, n).map(u -> pos[u] + 1).max().orElse(0)).toArray() instanceof int[] pidx
            && new HashSet<String>() instanceof HashSet<String> seen
            && new String[n + 1] instanceof String[] ops && new int[n + 1] instanceof int[] nxt
            && new ArrayList<BiPredicate<Integer, int[]>>() instanceof List<BiPredicate<Integer, int[]>> dfs
            && dfs.add((k, stk) -> k.intValue() == n.intValue() ? true
                : (k + "|" + IntStream.range(0, stk.length / 3).mapToObj(i -> (i > 0 && stk[3 * i - 2] == stk[3 * i] - 1 ? "x" : stk[3 * i] + "/" + stk[3 * i + 2]) + "~" + pidx[stk[3 * i + 1]]).collect(Collectors.joining(","))) instanceof String key
                && !seen.contains(key)
                && (IntStream.rangeClosed(1, Math.min(a, n - k)).anyMatch(L ->
                        Arrays.copyOf(stk, stk.length + 3 * L) instanceof int[] buf && new int[]{stk.length / 3} instanceof int[] cnt
                        && IntStream.range(0, L).map(i -> p[k + L - 1 - i]).allMatch(z ->
                            cnt[0] > 0 && z == buf[3 * cnt[0] - 3] - 1
                                ? (buf[3 * cnt[0] - 3] = z) >= 0 && ++buf[3 * cnt[0] - 1] <= b
                                : (cnt[0] == 0 || z > buf[3 * cnt[0] - 2]) && (buf[3 * cnt[0]] = z) >= 0 && (buf[3 * cnt[0] + 1] = z) >= 0 && (buf[3 * cnt[0] + 2] = 1) >= 0 && ++cnt[0] > 0)
                        && new StringBuilder() instanceof StringBuilder pb
                        && IntStream.iterate(0, x -> x + 1).takeWhile(x -> cnt[0] > 0 && buf[3 * cnt[0] - 2] > suf[k + L])
                            .filter(x -> pb.append("2 ").append(buf[3 * cnt[0] - 1]).append('\n') != null && cnt[0]-- > 0).count() >= 0
                        && Arrays.copyOf(buf, 3 * cnt[0]) instanceof int[] ns
                        && dfs.get(0).test(k + L, ns)
                        && (ops[k] = "1 " + L + "\n" + pb) != null && (nxt[k] = L) > 0)
                    || (seen.add(key) && false)))
            && dfs.get(0).test(0, new int[0])
            && IntStream.iterate(0, kk -> kk < n, kk -> kk + nxt[kk]).mapToObj(kk -> ops[kk]).collect(Collectors.joining()) instanceof String txt
            ? "YES\n" + txt.chars().filter(ch -> ch == 10).count() + "\n" + txt.trim() : "NO", r -> new Thread(null, r, "t", 1L << 29).start()).join());
    }
}
