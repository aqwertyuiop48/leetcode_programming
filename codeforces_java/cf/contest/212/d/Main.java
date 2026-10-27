import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.range(0, n).map(i -> it.next()).toArray() instanceof long[] a
            && new int[n] instanceof int[] pl && new int[n] instanceof int[] nr && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st
            && IntStream.range(0, n).allMatch(i -> Stream.generate(() -> st.peek()).takeWhile(top -> top != null && a[top] > a[i]).map(top -> st.pollFirst()).count() >= 0
                && (pl[i] = st.isEmpty() ? -1 : st.peek()) > -2 && st.offerFirst(i))
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st2
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Stream.generate(() -> st2.peek()).takeWhile(top -> top != null && a[top] >= a[i]).map(top -> st2.pollFirst()).count() >= 0
                && (nr[i] = st2.isEmpty() ? n : st2.peek()) >= 0 && st2.offerFirst(i))
            && new long[n + 4] instanceof long[] d
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(i - pl[i]) instanceof Integer x && Integer.valueOf(nr[i] - i) instanceof Integer y
                && (d[1] += a[i]) > 0 && (d[Math.min(x, y) + 1] -= a[i]) < 1000000000000000000L && (d[Math.max(x, y) + 1] -= a[i]) < 1000000000000000000L && (d[x + y + 1] += a[i]) > Long.MIN_VALUE)
            && new double[n + 2] instanceof double[] f && new long[]{0} instanceof long[] s1
            && IntStream.rangeClosed(1, n).allMatch(k -> (s1[0] += d[k]) > Long.MIN_VALUE && (f[k] = f[k - 1] + s1[0]) >= 0)
            && Integer.valueOf(it.next().intValue()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> Integer.valueOf(it.next().intValue()) instanceof Integer k ? String.format("%.15f", f[k] / (n - k + 1)) : "").collect(Collectors.joining("\n")) : "");
    }
}

