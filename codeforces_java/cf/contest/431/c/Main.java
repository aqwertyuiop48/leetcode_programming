import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer d
            && ((java.util.function.IntFunction<Long>) kk -> new long[n + 1] instanceof long[] f && (f[0] = 1) > 0
                && IntStream.rangeClosed(1, n).allMatch(i -> (f[i] = IntStream.rangeClosed(1, Math.min(kk, i)).mapToLong(j -> f[i - j]).sum() % 1000000007L) >= 0) ? f[n] : 0L) instanceof java.util.function.IntFunction<Long> cnt
            ? (cnt.apply(k) - cnt.apply(d - 1) + 1000000007L) % 1000000007L : 0);
    }
}
