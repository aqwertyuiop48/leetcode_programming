import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] st
            && new int[2][n + 1] instanceof int[][] cnt
            && Arrays.stream(st).allMatch(v -> ++cnt[v > 0 ? 0 : 1][Math.abs(v)] > 0)
            && Long.valueOf(Arrays.stream(st).filter(v -> v < 0).count()) instanceof Long minus
            && IntStream.rangeClosed(1, n).filter(k -> cnt[0][k] + minus - cnt[1][k] == m).boxed().collect(Collectors.toSet()) instanceof Set<Integer> cand
            ? Arrays.stream(st).mapToObj(v -> v > 0
                ? cand.contains(v) ? cand.size() == 1 ? "Truth" : "Not defined" : "Lie"
                : cand.contains(-v) ? cand.size() == 1 ? "Lie" : "Not defined" : "Truth").collect(Collectors.joining("\n"))
            : "");
    }
}

