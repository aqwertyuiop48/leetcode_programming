import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong()}).sorted(Comparator.comparingLong(f -> f[1])).toArray(long[][]::new) instanceof long[][] fs
            && Arrays.stream(fs).mapToLong(f -> f[0]).sorted().toArray() instanceof long[] sp
            && Long.valueOf(sp[n - k]) instanceof Long p0
            && ((LongUnaryOperator) P -> Long.valueOf(Arrays.stream(fs).filter(f -> f[0] > P).count()) instanceof Long af
                && Long.valueOf(Arrays.stream(fs).filter(f -> f[0] == P || f[0] == P - 1).count()) instanceof Long c
                && Long.valueOf(Math.max(0, af + c - (k - 1))) instanceof Long t
                && P >= 0 && P <= n && t <= c && t <= P
                && new int[1] instanceof int[] cnt && new boolean[n] instanceof boolean[] fd
                ? IntStream.range(0, n).filter(i -> (fs[i][0] == P || fs[i][0] == P - 1) && cnt[0] < t && ++cnt[0] > 0 && (fd[i] = true)).mapToLong(i -> fs[i][1]).sum()
                    + IntStream.range(0, n).filter(i -> !fd[i]).limit(P - t).mapToLong(i -> fs[i][1]).sum() : -1L) instanceof LongUnaryOperator cost
            ? LongStream.rangeClosed(p0 - 2, p0 + 3).map(cost).filter(x -> x >= 0).min().orElse(-1L) : "");
    }
}
