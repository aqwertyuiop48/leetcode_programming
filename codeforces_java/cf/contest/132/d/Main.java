import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s -> Optional.of(s.length()).filter(L -> new int[2][L + 2] instanceof int[][] f && f[1][L + 1] == 0 && (f[1][L + 1] = 1) == 1 && ((IntBinaryOperator) ((i, c) -> (i < L ? s.charAt(L - 1 - i) - '0' : 0) + c)) instanceof IntBinaryOperator vv && ((IntBinaryOperator) ((i, c) -> vv.applyAsInt(i, c) == 0 ? f[0][i + 1] : vv.applyAsInt(i, c) == 2 ? f[1][i + 1] : 1 + Math.min(f[0][i + 1], f[1][i + 1]))) instanceof IntBinaryOperator cost && IntStream.rangeClosed(0, L).map(k -> L - k).allMatch(i -> (f[0][i] = cost.applyAsInt(i, 0)) >= 0 && (f[1][i] = cost.applyAsInt(i, 1)) >= 0) && new int[1] instanceof int[] cc && new StringBuilder() instanceof StringBuilder pos && new StringBuilder() instanceof StringBuilder neg && IntStream.rangeClosed(0, L).allMatch(i -> new int[]{vv.applyAsInt(i, cc[0])} instanceof int[] v && (v[0] == 0 ? (cc[0] = 0) == 0 : v[0] == 2 ? (cc[0] = 1) == 1 : 1 + f[0][i + 1] <= 1 + f[1][i + 1] ? pos.append("+2^").append(i).append('\n') != null && (cc[0] = 0) == 0 : neg.append("-2^").append(i).append('\n') != null && (cc[0] = 1) == 1)) && System.out.append(f[0][0] + "\n").append(pos).append(neg) != null));
    }
}
