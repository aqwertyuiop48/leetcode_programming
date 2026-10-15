import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining()).chars().filter(c -> c == '.' || c == 'O').toArray()).ifPresent(cells ->
            System.out.println(
                new int[]{0, 3, 7, 12, 16} instanceof int[] off
                && new int[]{3, 4, 5, 4, 3} instanceof int[] len
                && IntStream.range(0, 19).map(i -> i < 3 ? 0 : i < 7 ? 1 : i < 12 ? 2 : i < 16 ? 3 : 4).toArray() instanceof int[] row
                && ((BiFunction<Integer, Integer, Integer>) (x, d) -> new int[]{row[x], x - off[row[x]]} instanceof int[] rc
                    && new int[]{d == 0 ? rc[0] : rc[0] + 1, d == 0 ? rc[1] + 1 : d == 1 ? (rc[0] < 2 ? rc[1] : rc[1] - 1) : (rc[0] < 2 ? rc[1] + 1 : rc[1])} instanceof int[] nrc
                    && nrc[0] < 5 && nrc[1] >= 0 && nrc[1] < len[nrc[0]] ? off[nrc[0]] + nrc[1] : -1) instanceof BiFunction<Integer, Integer, Integer> nb
                && IntStream.range(0, 19).boxed().flatMap(s -> IntStream.range(0, 3).boxed().flatMap(d -> Stream.iterate(s, x -> x >= 0, x -> nb.apply(x, d)).toList() instanceof List<Integer> chain
                    ? IntStream.rangeClosed(1, chain.size()).map(k -> chain.subList(0, k).stream().mapToInt(x -> 1 << x).sum()).boxed()
                    : Stream.<Integer>empty())).distinct().mapToInt(m -> m).toArray() instanceof int[] moves
                && Integer.valueOf(IntStream.range(0, 19).filter(i -> cells[i] == 'O').map(i -> 1 << i).sum()) instanceof Integer init
                && new boolean[1 << 19] instanceof boolean[] win
                && IntStream.range(0, 1 << 19).allMatch(mask -> (mask & ~init) != 0 || ((win[mask] = Arrays.stream(moves).anyMatch(m -> (mask & m) == m && !win[mask ^ m])) || true))
                ? (win[init] ? "Karlsson" : "Lillebror")
                : ""));
    }
}


