import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[1]) instanceof Integer n && Integer.valueOf(t[0]) instanceof Integer m && Long.valueOf(t[2]) instanceof Long s
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[3 + i])).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> Integer.parseInt(t[3 + n + i])).toArray() instanceof int[] b
            && IntStream.range(0, m).map(i -> Integer.parseInt(t[3 + n + m + i])).toArray() instanceof int[] c
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> -a[i])).mapToInt(i -> i).toArray() instanceof int[] bo
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingInt(i -> -b[i])).mapToInt(i -> i).toArray() instanceof int[] so
            && new int[n] instanceof int[] res
            && ((java.util.function.IntToLongFunction) D -> new PriorityQueue<Integer>(Comparator.comparingInt(i -> c[i])) instanceof PriorityQueue<Integer> pq && new int[]{0} instanceof int[] ptr
                ? IntStream.iterate(0, i -> i < n, i -> i + D).mapToLong(i -> (ptr[0] += IntStream.iterate(ptr[0], p -> p < m && b[so[p]] >= a[bo[i]], p -> p + 1).map(p -> pq.add(so[p]) ? 1 : 1).sum()) >= 0 && pq.isEmpty() ? 1L << 40
                    : Integer.valueOf(pq.poll()) instanceof Integer id && IntStream.range(i, Math.min(i + D, n)).map(k -> res[bo[k]] = id).sum() >= 0 ? c[id] : 0L).sum() : 0L) instanceof java.util.function.IntToLongFunction chk
            && new int[]{1, n} instanceof int[] lh
            && IntStream.range(0, 18).allMatch(it -> lh[0] >= lh[1] || (Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && (chk.applyAsLong(mid) <= s ? (lh[1] = mid) : (lh[0] = mid + 1)) > 0))
            ? chk.applyAsLong(lh[0]) <= s ? "YES\n" + Arrays.stream(res).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "NO" : "");
    }
}
