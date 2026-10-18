import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b && (Integer) Math.max(a, b) instanceof Integer r && (Integer) Math.min(a, b) instanceof Integer w && (Integer) (1 << w) instanceof Integer K && new int[][]{IntStream.generate(() -> 1000).limit(K * K).toArray()} instanceof int[][] cur && IntStream.range(0, K).allMatch(x -> (cur[0][x] = Integer.bitCount(x)) >= 0) && IntStream.range(0, r).allMatch(i -> IntStream.generate(() -> 1000).limit(K * K).toArray() instanceof int[] nd && IntStream.range(0, K * K).filter(st -> cur[0][st] < 1000).allMatch(st -> IntStream.range(0, i == r - 1 ? 1 : K).allMatch(c -> ((st / K | st % K | st % K << 1 | st % K >> 1 | c) & (K - 1)) != K - 1 || (nd[st % K * K + c] = Math.min(nd[st % K * K + c], cur[0][st] + Integer.bitCount(c))) >= 0)) && (cur[0] = nd) != null) ? r * w - IntStream.of(cur[0]).min().getAsInt() : -1).ifPresent(System.out::println);
    }
}
