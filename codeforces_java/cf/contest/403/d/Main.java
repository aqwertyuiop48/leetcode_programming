import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer t
            && new long[2002] instanceof long[] f && (f[0] = 1) > 0
            && IntStream.rangeClosed(1, 2001).allMatch(i -> (f[i] = f[i - 1] * i % 1000000007L) > 0)
            && new long[2002][2002] instanceof long[][] c
            && IntStream.rangeClosed(0, 2001).allMatch(i -> (c[i][0] = 1) > 0 && IntStream.rangeClosed(1, i).allMatch(j -> (c[i][j] = (c[i - 1][j - 1] + (j <= i - 1 ? c[i - 1][j] : 0)) % 1000000007L) >= 0))
            ? IntStream.range(0, t).mapToObj(q -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
                ? String.valueOf(2 * k > n + 1 ? 0 : c[n + 1][2 * k] * f[k] % 1000000007L) : "").collect(Collectors.joining("\n")) : "");
    }
}
