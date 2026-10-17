import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()} instanceof long[] h
            && IntStream.range(0, (int) h[2]).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()}).toList() instanceof List<long[]> cells
            && (Long) sc.nextLong() instanceof Long p
            && (Boolean) (h[0] >= h[1]) instanceof Boolean tall
            && (Long) Math.max(h[0], h[1]) instanceof Long N
            && (Long) Math.min(h[0], h[1]) instanceof Long M
            && cells.stream().collect(Collectors.groupingBy(c -> tall ? c[0] : c[1])) instanceof Map<Long, List<long[]>> byRow
            ? (N + M) % 2 == 0 && byRow.values().stream().allMatch(l -> l.size() < M || l.stream().mapToLong(c -> c[2]).reduce(1, (x, y) -> x * y) == -1)
                ? BigInteger.TWO.modPow(BigInteger.valueOf((N - byRow.size()) * (M - 1) + byRow.values().stream().mapToLong(l -> l.size() < M ? M - l.size() - 1 : 0).sum() - (M - 1)), BigInteger.valueOf(p))
                : BigInteger.ZERO
            : BigInteger.ZERO));
    }
}
