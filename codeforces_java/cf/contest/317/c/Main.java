import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Long.valueOf(it.nextLong()) instanceof Long V && Integer.valueOf((int) it.nextLong()) instanceof Integer e
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] cur && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] b
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toArray(ArrayList[]::new) instanceof ArrayList[] adj
            && IntStream.range(0, e).allMatch(i -> Integer.valueOf((int) it.nextLong() - 1) instanceof Integer x && Integer.valueOf((int) it.nextLong() - 1) instanceof Integer y && adj[x].add(y) && adj[y].add(x))
            && new int[n] instanceof int[] par && new int[n] instanceof int[] dep && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] comp && new int[n] instanceof int[] qu
            && IntStream.range(0, n).allMatch(r -> comp[r] != -1 || (new int[]{0, 1} instanceof int[] qp && (qu[0] = r) == r && (comp[r] = r) == r && (par[r] = -1) == -1 && (dep[r] = 0) == 0
                && IntStream.generate(() -> 0).anyMatch(z -> qp[0] >= qp[1] || (Integer.valueOf(qu[qp[0]++]) instanceof Integer u
                    && adj[u].stream().allMatch(w -> comp[(Integer) w] != -1 || ((comp[(Integer) w] = r) == r && (par[(Integer) w] = u) == u && (dep[(Integer) w] = dep[u] + 1) > 0 && (qu[qp[1]++] = (Integer) w) >= 0)) && false))))
            && new long[n] instanceof long[] sa && new long[n] instanceof long[] sb
            && IntStream.range(0, n).allMatch(i -> (sa[comp[i]] += cur[i]) >= 0 && (sb[comp[i]] += b[i]) >= 0)
            ? IntStream.range(0, n).anyMatch(i -> sa[i] != sb[i])
                ? "NO"
                : new ArrayList<String>() instanceof ArrayList<String> out && new int[n] instanceof int[] pth && new int[1] instanceof int[] pl
                    && ((Predicate<long[]>) q -> q[2] <= 0 || (cur[(int) q[0]] -= q[2]) + (cur[(int) q[1]] += q[2]) >= Long.MIN_VALUE && out.add((q[0] + 1) + " " + (q[1] + 1) + " " + q[2])) instanceof Predicate<long[]> pour
                    && new AtomicReference<Predicate<long[]>>() instanceof AtomicReference<Predicate<long[]>> go
                    && go.compareAndSet(null, q -> q[0] + 1 >= pl[0] || (Integer.valueOf(pth[(int) q[0]]) instanceof Integer x && Integer.valueOf(pth[(int) q[0] + 1]) instanceof Integer y
                        && Long.valueOf(Math.min(q[1], V - cur[y])) instanceof Long can && pour.test(new long[]{x, y, can}) && go.get().test(new long[]{q[0] + 1, q[1]}) && pour.test(new long[]{x, y, q[1] - can})))
                    && IntStream.generate(() -> 0).anyMatch(z -> Integer.valueOf(IntStream.range(0, n).filter(i -> cur[i] > b[i]).findFirst().orElse(-1)) instanceof Integer s && (s < 0
                        || (Integer.valueOf(IntStream.range(0, n).filter(i -> comp[i] == comp[s] && cur[i] < b[i]).findFirst().getAsInt()) instanceof Integer t
                            && Long.valueOf(Math.min(cur[s] - b[s], b[t] - cur[t])) instanceof Long d
                            && new int[]{s, t, 0} instanceof int[] ab && new ArrayList<Integer>() instanceof ArrayList<Integer> right && (pl[0] = 0) == 0
                            && IntStream.generate(() -> 0).anyMatch(w -> ab[0] == ab[1] || (dep[ab[0]] >= dep[ab[1]] ? (pth[pl[0]++] = ab[0]) >= 0 && (ab[0] = par[ab[0]]) >= -1 : right.add(ab[1]) && (ab[1] = par[ab[1]]) >= -1) && false)
                            && (pth[pl[0]++] = ab[0]) >= 0 && IntStream.range(0, right.size()).allMatch(i -> (pth[pl[0]++] = right.get(right.size() - 1 - i)) >= 0)
                            && go.get().test(new long[]{0, d}) && false)))
                    ? out.size() + (out.isEmpty() ? "" : "\n" + String.join("\n", out)) : "" : "");
    }
}
