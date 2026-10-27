import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong()}).ifPresent(a ->
            System.out.println(
                (Long) Math.abs(a[1] - a[3]) instanceof Long d
                && (Long) a[0] instanceof Long N
                && (Long) a[2] instanceof Long M
                ? 1 + LongStream.rangeClosed(1, N).map(i -> 2 * Math.max(0, Math.min(i + d - 1, M) - Math.abs(i - d)) + (i + d <= M ? 1 : 0) + (Math.abs(i - d) >= 1 && Math.abs(i - d) <= M ? 1 : 0)).sum()
                    + (N - Math.max(0, Math.min(N, d + M) - Math.max(1, d - M) + 1)) + (M - Math.max(0, Math.min(M, d + N) - Math.max(1, d - N) + 1))
                    + (Math.min(N, d + M) >= Math.max(1, d - M) ? 1 : 0)
                : 0)));
    }
}


