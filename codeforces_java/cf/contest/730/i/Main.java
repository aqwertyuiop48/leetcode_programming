import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer p && Integer.valueOf(s.nextInt()) instanceof Integer q
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b
            && IntStream.range(0, n).boxed().sorted((x, y) -> (a[y] - b[y]) - (a[x] - b[x])).mapToInt(x -> x).toArray() instanceof int[] ord
            && new long[n + 1] instanceof long[] pre && new long[n + 2] instanceof long[] suf && new PriorityQueue<Integer>() instanceof PriorityQueue<Integer> h1 && new PriorityQueue<Integer>() instanceof PriorityQueue<Integer> h2 && new long[]{0, 0} instanceof long[] sm
            && IntStream.range(0, n).filter(i -> h1.add(a[ord[i]]) && (sm[0] += a[ord[i]]) >= 0 && (h1.size() <= p || (sm[0] -= h1.poll()) >= Long.MIN_VALUE) && (pre[i + 1] = sm[0]) >= 0).count() >= 0
            && IntStream.range(0, n).map(k -> n - 1 - k).filter(i -> h2.add(b[ord[i]]) && (sm[1] += b[ord[i]]) >= 0 && (h2.size() <= q || (sm[1] -= h2.poll()) >= Long.MIN_VALUE) && (suf[i] = sm[1]) >= 0).count() >= 0
            && IntStream.rangeClosed(p, n - q).boxed().max(Comparator.comparingLong(i -> pre[i] + suf[i])).get() instanceof Integer sp
            ? (pre[sp] + suf[sp]) + "\n" + IntStream.range(0, sp).boxed().sorted((x, y) -> a[ord[y]] - a[ord[x]]).limit(p).map(i -> String.valueOf(ord[i] + 1)).collect(Collectors.joining(" ")) + "\n"
                + IntStream.range(sp, n).boxed().sorted((x, y) -> b[ord[y]] - b[ord[x]]).limit(q).map(i -> String.valueOf(ord[i] + 1)).collect(Collectors.joining(" ")) : "");
    }
}
