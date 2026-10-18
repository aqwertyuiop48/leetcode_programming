import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && sc.next().toCharArray() instanceof char[] s
            && Integer.valueOf(s.length) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(sc.nextInt()) instanceof Integer L
            && Integer.valueOf(sc.nextInt()) instanceof Integer R
            && new int[k] instanceof int[] cc
            && new int[k] instanceof int[] lo
            && new int[k] instanceof int[] hi
            && IntStream.range(0, k).allMatch(i -> (cc[i] = sc.next().charAt(0) - 'a') >= 0 && (lo[i] = sc.nextInt()) >= 0 && (hi[i] = sc.nextInt()) >= 0)
            && new int[26] instanceof int[] occN
            && new int[n] instanceof int[] rank
            && IntStream.range(0, n).allMatch(e -> (rank[e] = ++occN[s[e] - 'a']) > 0)
            && new int[26][] instanceof int[][] occ
            && IntStream.range(0, 26).allMatch(c -> (occ[c] = new int[occN[c]]) != null)
            && new int[26] instanceof int[] fill
            && IntStream.range(0, n).allMatch(e -> (occ[s[e] - 'a'][fill[s[e] - 'a']++] = e) >= 0)
            && Integer.valueOf((int) IntStream.range(0, k).filter(i -> lo[i] == 0).count()) instanceof Integer z0
            && new int[n] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(x -> (cnt[x] = z0) >= 0)
            && new long[]{z0 >= L && z0 <= R ? n : 0} instanceof long[] good
            && new int[k] instanceof int[] ia
            && IntStream.range(0, k).map(i -> lo[i] == 0 ? n - 1 : -1).toArray() instanceof int[] ib
            && IntStream.range(0, 26).mapToObj(c -> IntStream.range(0, k).filter(i -> cc[i] == c).toArray()).toArray(int[][]::new) instanceof int[][] by
            && new long[]{0} instanceof long[] ans
            && ((IntPredicate) x -> (good[0] += (--cnt[x] >= L && cnt[x] <= R ? 1 : 0) - (cnt[x] + 1 >= L && cnt[x] + 1 <= R ? 1 : 0)) >= 0) instanceof IntPredicate dec
            && ((IntPredicate) x -> (good[0] += (++cnt[x] >= L && cnt[x] <= R ? 1 : 0) - (cnt[x] - 1 >= L && cnt[x] - 1 <= R ? 1 : 0)) >= 0) instanceof IntPredicate inc
            && IntStream.range(0, n).allMatch(e -> Integer.valueOf(s[e] - 'a') instanceof Integer c
                && Integer.valueOf(rank[e]) instanceof Integer t
                && Arrays.stream(by[c]).allMatch(i ->
                    Integer.valueOf(t - hi[i] >= 1 ? occ[c][t - hi[i] - 1] + 1 : 0) instanceof Integer a2
                    && Integer.valueOf(lo[i] == 0 ? n - 1 : t - lo[i] + 1 >= 1 ? occ[c][t - lo[i]] : -1) instanceof Integer b2
                    && Integer.valueOf(Math.min(ib[i], a2 - 1)) instanceof Integer h1
                    && (ia[i] > h1 || (dec.test(ia[i]) && (h1.equals(ia[i]) || IntStream.rangeClosed(ia[i] + 1, h1).allMatch(dec))))
                    && Integer.valueOf(Math.max(a2, ib[i] + 1)) instanceof Integer l2
                    && (l2 > b2 || (inc.test(l2) && (b2.equals(l2) || IntStream.rangeClosed(l2 + 1, b2).allMatch(inc))))
                    && (ia[i] = a2) >= 0
                    && (ib[i] = b2) >= -1)
                && (ans[0] += good[0] - (z0 >= L && z0 <= R ? n - 1 - e : 0)) >= 0)
            ? ans[0]
            : -1);
    }
}
