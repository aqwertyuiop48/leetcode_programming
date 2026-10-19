import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner in && Integer.valueOf(in.nextInt()) instanceof Integer n && Integer.valueOf(in.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M
            && new long[n + 2][4] instanceof long[][] cur && (cur[0][1] = 1) == 1
            && new long[n + 2] instanceof long[] f && new long[n + 1] instanceof long[] fact && (fact[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(i -> (fact[i] = fact[i - 1] * i % M) > 0)
            && new long[][][]{cur} instanceof long[][][] holder
            && IntStream.rangeClosed(1, n).allMatch(i -> new long[n + 2][4] instanceof long[][] nx
                && IntStream.rangeClosed(0, i - 1).allMatch(j -> IntStream.range(0, 4).allMatch(sb -> holder[0][j][sb] == 0 || Integer.valueOf(sb & 1) instanceof Integer ua && Integer.valueOf(sb >> 1) instanceof Integer ub
                    && (nx[j][ub] = (nx[j][ub] + holder[0][j][sb]) % M) >= 0
                    && (ua == 1 || i < 2 || (nx[j + 1][ub] = (nx[j + 1][ub] + holder[0][j][sb]) % M) >= 0)
                    && (i >= n || (nx[j + 1][ub | 2] = (nx[j + 1][ub | 2] + holder[0][j][sb]) % M) >= 0)))
                && (holder[0] = nx) != null)
            && IntStream.rangeClosed(0, n).allMatch(j -> (f[j] = Arrays.stream(holder[0][j]).sum() % M * fact[n - j] % M) >= 0)
            && new long[n + 1][n + 1] instanceof long[][] c && IntStream.rangeClosed(0, n).allMatch(i -> (c[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (c[i][j] = (c[i - 1][j - 1] + (j <= i - 1 ? c[i - 1][j] : 0)) % M) >= 0))
            ? IntStream.rangeClosed(k, n).mapToLong(j -> (j - k) % 2 == 0 ? c[j][k] * f[j] % M : (M - c[j][k] * f[j] % M) % M).sum() % M : "");
    }
}
