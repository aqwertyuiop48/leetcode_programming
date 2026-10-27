import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.next(), it.next()}).toList() instanceof List<int[]> qs
            && new int[n + 2] instanceof int[] tot && Arrays.stream(a).filter(x -> x <= n).allMatch(x -> ++tot[x] > 0)
            && new int[m] instanceof int[] ans
            && IntStream.rangeClosed(1, n).filter(x -> tot[x] >= x).allMatch(x -> new int[n + 1] instanceof int[] pre
                && IntStream.rangeClosed(1, n).allMatch(i -> (pre[i] = pre[i - 1] + (a[i - 1] == x ? 1 : 0)) >= 0)
                && IntStream.range(0, m).allMatch(q -> pre[qs.get(q)[1]] - pre[qs.get(q)[0] - 1] != x || ++ans[q] > 0))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

