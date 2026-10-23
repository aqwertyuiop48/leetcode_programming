import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer s && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer e
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] b
            && IntStream.rangeClosed(1, m).boxed().collect(Collectors.groupingBy(j -> b[j - 1], Collectors.collectingAndThen(Collectors.toList(), l -> l.stream().mapToInt(x -> x).toArray()))) instanceof Map<Integer, int[]> pos
            && (Integer) Math.min(n, s / e) instanceof Integer kmax
            && IntStream.range(0, kmax + 1).map(k -> k == 0 ? 0 : 1 << 29).toArray() instanceof int[] cur
            && new int[]{0} instanceof int[] best
            && IntStream.rangeClosed(1, n).allMatch(i -> pos.getOrDefault(a[i - 1], new int[0]) instanceof int[] ps
                && (ps.length == 0 || IntStream.range(0, kmax).map(t -> kmax - t).allMatch(k -> cur[k - 1] >= 1 << 29 || (Integer) Arrays.binarySearch(ps, cur[k - 1]) instanceof Integer q
                    && (Integer) (q >= 0 ? q + 1 : -q - 1) instanceof Integer r && (r >= ps.length || (cur[k] = Math.min(cur[k], ps[r])) >= 0)))
                && IntStream.rangeClosed(1, kmax).allMatch(k -> cur[k] >= 1 << 29 || i + cur[k] + (long) k * e > s || (best[0] = Math.max(best[0], k)) >= 0))
            ? best[0] : 0);
    }
}
