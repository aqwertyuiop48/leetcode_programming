import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Long.valueOf(n + 1) instanceof Long N && Long.valueOf(m + 1) instanceof Long L && Long.valueOf(n - m) instanceof Long U
            && ((IntToLongFunction) w -> Long.valueOf(Math.max(L, Math.min(U + 1, -Math.floorDiv(-(U * (2 * N - w) + 1 - (long) w * (N - 2L * w)), w + U)))) instanceof Long yFull
                && Long.valueOf(Math.max(L, Math.min(U + 1, -Math.floorDiv(-(L * (2 * N - w) + 1 - (long) w * (N - 2L * w)), w + L)))) instanceof Long yPos
                && Long.valueOf(2 * N - w) instanceof Long D0 && Long.valueOf(3L * w * (N - w) - 1) instanceof Long M
                ? (U - yFull + 1) * (U - L + 1) + (yFull <= yPos ? 0L
                    : Long.valueOf(D0 - yPos) instanceof Long Dhi && Long.valueOf(D0 - yFull + 1) instanceof Long Dlo && Long.valueOf(M / Dhi) instanceof Long vlo0 && Long.valueOf(M / Dlo) instanceof Long vhi
                    ? vlo0 * (Dhi - Dlo + 1) + LongStream.rangeClosed(vlo0 + 1, vhi).map(v -> (long) ((double) M / v)).sum() - Math.max(0, vhi - vlo0) * (Dlo - 1) - (yFull - yPos) * (w + L - 1) : 0L) : 0L) instanceof IntToLongFunction W
            ? L > U ? 0L : 3 * (2 * IntStream.rangeClosed((int) (long) L, (int) ((N - 1) / 2)).parallel().mapToLong(W).sum() + (N % 2 == 0 ? W.applyAsLong((int) (N / 2)) : 0L)) : "");
    }
}
