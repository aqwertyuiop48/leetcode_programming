import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(q ->
            System.out.println(new long[q[0] + 1][q[1] + 1] instanceof long[][] f
                && new long[q[0] + 1][q[1] + 1] instanceof long[][] g
                && IntStream.rangeClosed(0, q[0]).allMatch(a -> IntStream.rangeClosed(0, q[1]).allMatch(b ->
                    (f[a][b] = a == 0 ? 0 : b == 0 ? (a <= q[2] ? 1 : 0)
                        : IntStream.rangeClosed(1, Math.min(q[2], a)).mapToLong(t -> g[a - t][b]).sum() % 100000000) >= 0
                    && (g[a][b] = b == 0 ? 0 : a == 0 ? (b <= q[3] ? 1 : 0)
                        : IntStream.rangeClosed(1, Math.min(q[3], b)).mapToLong(t -> f[a][b - t]).sum() % 100000000) >= 0))
                ? (f[q[0]][q[1]] + g[q[0]][q[1]]) % 100000000 : -1));
    }
}

