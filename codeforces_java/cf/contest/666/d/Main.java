import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] all
            && IntStream.range(0, 256).filter(c -> IntStream.range(0, 4).map(i -> 1 << ((c >> (2 * i)) & 3)).sum() == 15).toArray() instanceof int[] PC
            && new int[]{0, 0, 0, 1, 1, 2} instanceof int[] pa && new int[]{1, 2, 3, 2, 3, 3} instanceof int[] pb
            ? IntStream.range(0, (int) all[0]).mapToObj(p -> IntStream.range(0, 4).mapToLong(i -> all[1 + 8 * p + 2 * i]).toArray() instanceof long[] x
                && IntStream.range(0, 4).mapToLong(i -> all[2 + 8 * p + 2 * i]).toArray() instanceof long[] y
                && IntStream.range(0, 12).mapToLong(j -> j < 6 ? Math.abs(x[pa[j]] - x[pb[j]]) : Math.abs(y[pa[j - 6]] - y[pb[j - 6]])).toArray() instanceof long[] D
                && new long[]{Long.MAX_VALUE, 0, 0, 0, 0} instanceof long[] best
                && IntStream.range(0, 12 * 16 * 24).filter(idx -> Long.valueOf(D[idx / 384]) instanceof Long d && d > 0
                    && Integer.valueOf((idx / 24) % 16) instanceof Integer mask && Integer.valueOf(PC[idx % 24]) instanceof Integer pc
                    && IntStream.range(0, 4).filter(i -> ((mask >> i) & 1) == 1).mapToLong(i -> x[i] - ((pc >> (2 * i)) & 1) * d).distinct().count() <= 1
                    && IntStream.range(0, 4).filter(i -> ((mask >> i) & 1) == 0).mapToLong(i -> y[i] - ((pc >> (2 * i + 1)) & 1) * d).distinct().count() <= 1
                    && Long.valueOf(mask != 0
                        ? IntStream.range(0, 4).filter(i -> ((mask >> i) & 1) == 1).mapToLong(i -> x[i] - ((pc >> (2 * i)) & 1) * d).findFirst().getAsLong()
                        : Math.floorDiv(IntStream.range(0, 4).mapToLong(i -> x[i] - ((pc >> (2 * i)) & 1) * d).min().getAsLong() + IntStream.range(0, 4).mapToLong(i -> x[i] - ((pc >> (2 * i)) & 1) * d).max().getAsLong(), 2L)) instanceof Long X
                    && Long.valueOf(mask != 15
                        ? IntStream.range(0, 4).filter(i -> ((mask >> i) & 1) == 0).mapToLong(i -> y[i] - ((pc >> (2 * i + 1)) & 1) * d).findFirst().getAsLong()
                        : Math.floorDiv(IntStream.range(0, 4).mapToLong(i -> y[i] - ((pc >> (2 * i + 1)) & 1) * d).min().getAsLong() + IntStream.range(0, 4).mapToLong(i -> y[i] - ((pc >> (2 * i + 1)) & 1) * d).max().getAsLong(), 2L)) instanceof Long Y
                    && Long.valueOf(IntStream.range(0, 4).mapToLong(i -> ((mask >> i) & 1) == 1 ? Math.abs(y[i] - Y - ((pc >> (2 * i + 1)) & 1) * d) : Math.abs(x[i] - X - ((pc >> (2 * i)) & 1) * d)).max().getAsLong()) instanceof Long cost
                    && cost < best[0] && (best[0] = cost) >= 0 && (best[1] = X) == X && (best[2] = Y) == Y && (best[3] = d) > 0 && (best[4] = pc) >= 0).count() >= 0
                ? (best[0] == Long.MAX_VALUE ? "-1" : best[0] + "\n" + IntStream.range(0, 4).mapToObj(i -> (best[1] + ((best[4] >> (2 * i)) & 1) * best[3]) + " " + (best[2] + ((best[4] >> (2 * i + 1)) & 1) * best[3])).collect(Collectors.joining("\n")))
                : "").collect(Collectors.joining("\n")) : "");
    }
}
