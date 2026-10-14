import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nh ->
            System.out.println(
                new long[nh[0] + 1][nh[0] + 1] instanceof long[][] f
                && IntStream.rangeClosed(0, nh[0]).allMatch(H -> (f[0][H] = 1) >= 0)
                && IntStream.rangeClosed(1, nh[0]).allMatch(n ->
                    IntStream.rangeClosed(1, nh[0]).allMatch(H ->
                        (f[n][H] = IntStream.rangeClosed(1, n).mapToLong(m -> f[m - 1][H - 1] * f[n - m][H - 1]).sum()) >= 0))
                ? (f[nh[0]][nh[0]] - (nh[1] - 1 < 0 ? 0 : f[nh[0]][Math.min(nh[1] - 1, nh[0])]))
                : 0L)));
    }
}
