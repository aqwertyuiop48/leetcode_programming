import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, i).boxed().flatMap(p -> IntStream.range(p, i).filter(q -> (long) a[p] + a[q] == a[i]).mapToObj(q -> (1 << p) | (1 << q))).mapToInt(Integer::intValue).toArray()).toArray(int[][]::new) instanceof int[][] pm
            && new int[1 << n] instanceof int[] q && new int[]{0} instanceof int[] tail && new int[]{0} instanceof int[] start
            && ((IntPredicate) k -> new boolean[1 << n] instanceof boolean[] vis && (vis[1] = true) && (q[0] = 1) == 1 && (tail[0] = 1) == 1 && (start[0] = 0) == 0
                && IntStream.range(0, n - 1).allMatch(i -> IntStream.of(start[0]).allMatch(lo -> IntStream.of(tail[0]).allMatch(hi -> IntStream.of(1 << (i + 1)).allMatch(top ->
                    new boolean[hi - lo] instanceof boolean[] ok
                    && Arrays.stream(pm[i + 1]).allMatch(pp -> IntStream.range(lo, hi).allMatch(idx -> (q[idx] & pp) != pp || (ok[idx - lo] = true)))
                    && IntStream.range(lo, hi).allMatch(idx -> !ok[idx - lo] || Integer.bitCount(q[idx]) >= k || vis[q[idx] | top] || ((vis[q[idx] | top] = true) && (q[tail[0]++] = q[idx] | top) >= 0) || true)
                    && IntStream.rangeClosed(0, i).allMatch(b -> IntStream.range(lo, hi).allMatch(idx -> !ok[idx - lo] || ((q[idx] >> b) & 1) == 0 || vis[(q[idx] ^ (1 << b)) | top] || ((vis[(q[idx] ^ (1 << b)) | top] = true) && (q[tail[0]++] = (q[idx] ^ (1 << b)) | top) >= 0) || true))
                    && (start[0] = hi) >= 0))))
                && tail[0] > start[0]) instanceof IntPredicate pass
            ? (IntStream.range(1, n).allMatch(i -> IntStream.range(0, i).anyMatch(p -> IntStream.range(0, i).anyMatch(r -> (long) a[p] + a[r] == a[i])))
                ? IntStream.rangeClosed(1, n).filter(pass).findFirst().getAsInt() : -1) : "");
    }
}
