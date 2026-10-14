import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && new long[n + 3][n + 1] instanceof long[][] f
            && IntStream.rangeClosed(1, n).map(x -> n + 1 - x).allMatch(i -> IntStream.range(0, i).allMatch(j ->
                (f[i][j] = i == n ? t[1 + j] : i == n - 1 ? Math.max(t[1 + j], t[1 + i])
                    : Math.min(Math.min(Math.max(t[1 + j], t[1 + i]) + f[i + 2][i + 1], Math.max(t[1 + j], t[2 + i]) + f[i + 2][i]), Math.max(t[1 + i], t[2 + i]) + f[i + 2][j])) >= 0))
            && ((IntBinaryOperator) (i, j) -> Long.valueOf(Math.max(t[1 + j], t[1 + i]) + f[i + 2][i + 1]) instanceof Long ca
                && Long.valueOf(Math.max(t[1 + j], t[2 + i]) + f[i + 2][i]) instanceof Long cb
                && Long.valueOf(Math.max(t[1 + i], t[2 + i]) + f[i + 2][j]) instanceof Long cc
                ? (ca <= cb && ca <= cc ? 0 : cb <= cc ? 1 : 2) : 0) instanceof IntBinaryOperator pick
            ? f[1][0] + "\n" + Stream.iterate(new int[]{1, 0}, s -> s != null, s -> s[0] >= n - 1 ? null
                    : pick.applyAsInt(s[0], s[1]) == 0 ? new int[]{s[0] + 2, s[0] + 1} : pick.applyAsInt(s[0], s[1]) == 1 ? new int[]{s[0] + 2, s[0]} : new int[]{s[0] + 2, s[1]})
                .map(s -> s[0] == n ? "" + (s[1] + 1) : s[0] == n - 1 ? (s[1] + 1) + " " + (s[0] + 1)
                    : pick.applyAsInt(s[0], s[1]) == 0 ? (s[1] + 1) + " " + (s[0] + 1) : pick.applyAsInt(s[0], s[1]) == 1 ? (s[1] + 1) + " " + (s[0] + 2) : (s[0] + 1) + " " + (s[0] + 2))
                .collect(Collectors.joining("\n")) : "");
    }
}
