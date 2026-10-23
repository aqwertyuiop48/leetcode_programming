import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new String(System.in.readAllBytes()).split("[ \r\n]+") instanceof String[] t && (Integer) Integer.parseInt(t[0]) instanceof Integer n && (Integer) Integer.parseInt(t[1]) instanceof Integer m && (Integer) (m + 1) instanceof Integer W && new int[(n + 1) * W] instanceof int[] P
                && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (P[(i + 1) * W + j + 1] = P[i * W + j + 1] + P[(i + 1) * W + j] - P[i * W + j] + (t[2 + i].charAt(j) == 'X' ? 1 : 0)) >= 0))
                && (Integer) IntStream.range(0, n).filter(i -> t[2 + i].indexOf('X') >= 0).findFirst().orElse(-1) instanceof Integer x && x >= 0 && (Integer) t[2 + x].indexOf('X') instanceof Integer y
                && (Integer) (int) IntStream.range(y, m).takeWhile(j -> t[2 + x].charAt(j) == 'X').count() instanceof Integer tr
                && (Integer) (int) IntStream.range(x, n).takeWhile(i -> t[2 + i].charAt(y) == 'X').count() instanceof Integer lr
                && Optional.<IntBinaryOperator>of((h, w) -> new int[]{x, y, 0, 0} instanceof int[] s && P[(x + h) * W + y + w] - P[x * W + y + w] - P[(x + h) * W + y] + P[x * W + y] == h * w
                        && IntStream.range(0, n + m).anyMatch(z -> !(s[1] + w < m && P[(s[0] + h) * W + s[1] + w + 1] - P[s[0] * W + s[1] + w + 1] - P[(s[0] + h) * W + s[1] + w] + P[s[0] * W + s[1] + w] == h ? s[1]++ >= 0 && s[2]++ >= 0 : s[0] + h < n && P[(s[0] + h + 1) * W + s[1] + w] - P[(s[0] + h) * W + s[1] + w] - P[(s[0] + h + 1) * W + s[1]] + P[(s[0] + h) * W + s[1]] == w && s[0]++ >= 0 && s[3]++ >= 0))
                        && h * w + h * s[2] + w * s[3] == P[n * W + m] ? h * w : Integer.MAX_VALUE).get() instanceof IntBinaryOperator sim
                && (Integer) IntStream.concat(IntStream.rangeClosed(1, tr).map(w -> sim.applyAsInt(lr, w)), IntStream.rangeClosed(1, lr).map(h -> sim.applyAsInt(h, tr))).min().getAsInt() instanceof Integer best ? (best == Integer.MAX_VALUE ? -1 : best) : "");
    }
}
