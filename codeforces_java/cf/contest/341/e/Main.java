import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && LongStream.generate(() -> Long.parseLong(it.next())).limit(n).toArray() instanceof long[] a && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt
            && ((IntBinaryOperator) (x, w) -> (sb.append(x + 1).append(' ').append(w + 1).append('\n') != null) & ((a[w] -= a[x]) >= 0) & ((a[x] *= 2) > 0) & (++cnt[0] > 0) ? 1 : 0) instanceof IntBinaryOperator op
            ? (Arrays.stream(a).filter(x -> x > 0).count() < 2 ? "-1"
                : IntStream.generate(() -> 0).takeWhile(z -> IntStream.range(0, n).filter(i -> a[i] > 0).count() > 2).allMatch(z -> IntStream.range(0, n).filter(i -> a[i] > 0).limit(3).toArray() instanceof int[] tr
                    && IntStream.generate(() -> 0).takeWhile(y -> Arrays.stream(tr).allMatch(i -> a[i] > 0)).allMatch(y -> Arrays.stream(tr).boxed().sorted(Comparator.comparingLong(i -> a[i])).mapToInt(i -> i).toArray() instanceof int[] s
                        && LongStream.iterate(a[s[1]] / a[s[0]], t -> t > 0, t -> t >> 1).allMatch(t -> op.applyAsInt(s[0], (t & 1) == 1 ? s[1] : s[2]) > 0)))
                    ? cnt[0] + "\n" + sb : "") : "");
    }
}
