import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Long.valueOf(it.nextLong()) instanceof Long a
            && LongStream.generate(it::nextLong).limit(n).sorted().toArray() instanceof long[] B && LongStream.generate(it::nextLong).limit(m).sorted().toArray() instanceof long[] P
            && ((IntPredicate) r -> IntStream.range(0, r).mapToLong(i -> Math.max(0, P[i] - B[n - r + i])).sum() <= a) instanceof IntPredicate feas
            && new int[]{0, Math.min(n, m)} instanceof int[] lh
            && IntStream.range(0, 21).allMatch(z -> Integer.valueOf((lh[0] + lh[1] + 1) / 2) instanceof Integer mid && (lh[0] >= lh[1] || (feas.test(mid) ? (lh[0] = mid) : (lh[1] = mid - 1)) >= 0))
            ? lh[0] + " " + Math.max(0, Arrays.stream(P, 0, lh[0]).sum() - a) : "");
    }
}
