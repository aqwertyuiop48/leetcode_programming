import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> it.next()).toList() instanceof List<String> ss && Integer.valueOf(ss.stream().mapToInt(String::length).sum() + 2) instanceof Integer L
            && new int[L] instanceof int[] par && new int[L] instanceof int[] cnt && new int[]{1} instanceof int[] nodes && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> mp
            && ss.stream().allMatch(s -> new int[]{0} instanceof int[] cur && IntStream.range(0, s.length()).allMatch(k -> (cur[0] = mp.computeIfAbsent(cur[0] * 65536L + s.charAt(s.length() - 1 - k), key -> (par[nodes[0]] = cur[0]) * 0 + nodes[0]++)) >= 0) && ++cnt[cur[0]] > 0)
            && new int[L] instanceof int[] best && IntStream.range(1, nodes[0]).allMatch(i -> (best[i] = best[par[i]] + cnt[i]) >= 0)
            ? IntStream.range(0, nodes[0]).map(i -> best[i]).max().getAsInt() : "");
    }
}
