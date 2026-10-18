import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(s -> Integer.parseInt((String) s)).toArray()).map(in -> (Integer) in[1] instanceof Integer m && (Integer) (in[0] * in[1]) instanceof Integer nm && IntStream.concat(Arrays.stream(in, 2, 2 + 2 * nm), IntStream.of(0)).filter(v -> v >= 0).distinct().sorted().toArray() instanceof int[] vs && (Integer) vs.length instanceof Integer kk && IntStream.range(0, nm).map(i -> Arrays.binarySearch(vs, in[2 + i])).toArray() instanceof int[] pc && IntStream.range(0, nm).map(i -> in[2 + nm + i] < 0 ? -1 : Arrays.binarySearch(vs, in[2 + nm + i])).toArray() instanceof int[] sc && new int[kk] instanceof int[] cnt && IntStream.range(0, nm).map(i -> cnt[pc[i]]++ * 0).sum() == 0 && IntStream.range(0, kk).toArray() instanceof int[] p && IntStream.range(0, kk).toArray() instanceof int[] val && IntStream.range(0, kk).map(i -> cnt[i] > 0 ? i : -1).toArray() instanceof int[] cur && IntStream.range(0, kk).mapToObj(i -> new ArrayList<Integer>()).collect(Collectors.toList()) instanceof List<ArrayList<Integer>> lst && IntStream.range(0, nm).map(i -> sc[i] >= 0 && lst.get(pc[i]).add(i) ? 0 : 0).sum() == 0 && new boolean[nm] instanceof boolean[] rm && new int[601 * 601] instanceof int[] rk && new int[] {300, 300, 0} instanceof int[] ps && new int[] {0, -1, 0, 1} instanceof int[] dr && new int[] {-1, 0, 1, 0} instanceof int[] dc && IntStream.range(0, 1210).flatMap(s -> IntStream.range(0, s / 2 + 1).map(j -> (ps[0] += dr[s % 4]) * 0 + (ps[1] += dc[s % 4]) * 0 + (ps[0] >= 0 && ps[0] < 601 && ps[1] >= 0 && ps[1] < 601 ? rk[ps[0] * 601 + ps[1]] = ++ps[2] : 0) * 0)).sum() == 0 && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr && fr.getAndSet(x -> p[x] == x ? x : (p[x] = fr.get().applyAsInt(p[x]))) == null && (Integer) ((in[2 + 2 * nm] - 1) * m + in[3 + 2 * nm] - 1) instanceof Integer st && new long[1] instanceof long[] ans && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> q && q.add(st) && (rm[st] = true) && Stream.generate(q::poll).takeWhile(Objects::nonNull).mapToInt(c -> (Integer) fr.get().applyAsInt(pc[c]) instanceof Integer r && (Integer) val[r] instanceof Integer v && v != 0 && v != sc[c] && (ans[0] += cnt[r]) >= 0 && lst.get(r).stream().filter(e -> !rm[e]).sorted(Comparator.comparingInt(e -> rk[(e / m - c / m + 300) * 601 + e % m - c % m + 300])).collect(Collectors.toList()) instanceof List<Integer> sl && sl.stream().allMatch(e -> (rm[e] = true) && q.add(e)) && (lst.get(r).removeIf(e -> true) | true) ? ((cur[sc[c]] >= 0 ? (p[r] = cur[sc[c]]) >= 0 && (cnt[cur[sc[c]]] += cnt[r]) >= 0 : (val[r] = sc[c]) >= 0 && (cur[sc[c]] = r) >= 0) && (cur[v] = -1) < 0 ? 1 : 0) : 0).sum() >= 0 ? ans[0] : -1L).ifPresent(System.out::println);
    }
}
