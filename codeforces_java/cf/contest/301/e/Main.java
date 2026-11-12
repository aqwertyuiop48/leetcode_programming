
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(n / 2) instanceof Integer N && Long.valueOf(1000000007L) instanceof Long MOD
            && new int[101][101] instanceof int[][] cb
            && IntStream.range(0, 101).allMatch(a -> IntStream.range(0, 101).allMatch(b -> (cb[a][b] = b == 0 ? 1 : a == 0 ? 0 : Math.min(1000, cb[a - 1][b - 1] + cb[a - 1][b])) >= 0))
            && ((Function<long[][][], long[][][]>) cur -> new long[N + 2][N + 2][k + 1] instanceof long[][][] nx
                && IntStream.rangeClosed(1, N).allMatch(e -> IntStream.rangeClosed(e, N).allMatch(S -> IntStream.rangeClosed(1, k).allMatch(P -> cur[e][S][P] == 0
                    || IntStream.rangeClosed(1, N - S).allMatch(e2 -> Long.valueOf((long) P * cb[e + e2 - 1][e2]) instanceof Long np
                        && (np > k || (nx[e2][S + e2][(int) (long) np] = (nx[e2][S + e2][(int) (long) np] + cur[e][S][P]) % MOD) >= 0)))))
                ? nx : null) instanceof Function<long[][][], long[][][]> step
            && new long[N + 2][N + 2][k + 1] instanceof long[][][] init && IntStream.rangeClosed(1, N).allMatch(e -> (init[e][e][1] = 1) == 1)
            ? Stream.iterate(Map.entry(1, init), en -> Map.entry(en.getKey() + 1, step.apply(en.getValue()))).limit(Math.max(0, Math.min(m - 1, N)))
                .mapToLong(en -> Arrays.stream(en.getValue()).flatMap(Arrays::stream).flatMapToLong(Arrays::stream).sum() % MOD * (m - en.getKey()) % MOD).sum() % MOD : "");
    }
}



