import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer m
            && (Long) s.nextLong() instanceof Long h1 && (Long) s.nextLong() instanceof Long a1 && (Long) s.nextLong() instanceof Long x1 && (Long) s.nextLong() instanceof Long y1
            && (Long) s.nextLong() instanceof Long h2 && (Long) s.nextLong() instanceof Long a2 && (Long) s.nextLong() instanceof Long x2 && (Long) s.nextLong() instanceof Long y2
            && ((Function<long[], int[]>) p -> new long[m + 1] instanceof long[] sq && IntStream.range(0, m + 1).allMatch(i -> (sq[i] = i == 0 ? p[0] : (p[2] * sq[i - 1] + p[3]) % m) >= 0)
                && new long[m + 1] instanceof long[] sa && IntStream.range(0, m + 1).allMatch(i -> (sa[i] = i == 0 ? p[1] : (p[2] * sa[i - 1] + p[3]) % m) >= 0)
                ? new int[]{IntStream.range(0, m + 1).filter(i -> sq[i] == p[1]).findFirst().orElse(-1), IntStream.rangeClosed(1, m).filter(i -> sa[i] == p[1]).findFirst().orElse(0)} : null) instanceof Function<long[], int[]> info
            && info.apply(new long[]{h1, a1, x1, y1}) instanceof int[] f1 && info.apply(new long[]{h2, a2, x2, y2}) instanceof int[] f2
            ? f1[0] < 0 || f2[0] < 0 ? -1L : LongStream.rangeClosed(0, 2L * m + 2).map(k -> f1[1] == 0 && k > 0 ? -1 : f1[0] + k * (long) f1[1]).filter(t -> t >= 0 && t >= f2[0] && (f2[1] == 0 ? t == f2[0] : (t - f2[0]) % f2[1] == 0)).findFirst().orElse(-1) : 0L);
    }
}
