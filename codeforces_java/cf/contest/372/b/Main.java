import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer q
            && Integer.valueOf(42) instanceof Integer D
            && new int[D * D] instanceof int[] P
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (P[i * D + j] = P[(i - 1) * D + j] + P[i * D + j - 1] - P[(i - 1) * D + j - 1] + t[2 + i].charAt(j - 1) - 48) >= 0))
            && ((java.util.function.IntPredicate) k -> P[(k >> 18 & 63) * D + (k & 63)] - P[((k >> 24 & 63) - 1) * D + (k & 63)] - P[(k >> 18 & 63) * D + (k >> 6 & 63) - 1] + P[((k >> 24 & 63) - 1) * D + (k >> 6 & 63) - 1] == 0) instanceof java.util.function.IntPredicate zero
            && new int[D * D * D * D] instanceof int[] G && new int[D * D * D * D] instanceof int[] C
            && IntStream.rangeClosed(1, n).allMatch(r2 -> IntStream.rangeClosed(1, m).allMatch(c2 -> IntStream.iterate(r2, r1 -> r1 >= 1, r1 -> r1 - 1).allMatch(r1 -> IntStream.iterate(c2, c1 -> c1 >= 1, c1 -> c1 - 1).allMatch(c1 ->
                (G[((r2 * D + c2) * D + r1) * D + c1] = (zero.test(r1 << 24 | r2 << 18 | c1 << 6 | c2) ? 1 : 0) + G[((r2 * D + c2) * D + r1 + 1) * D + c1] + G[((r2 * D + c2) * D + r1) * D + c1 + 1] - G[((r2 * D + c2) * D + r1 + 1) * D + c1 + 1]) >= 0))))
            && IntStream.rangeClosed(1, n).allMatch(r1 -> IntStream.rangeClosed(1, m).allMatch(c1 -> IntStream.rangeClosed(r1, n).allMatch(r2 -> IntStream.rangeClosed(c1, m).allMatch(c2 ->
                (C[((r1 * D + c1) * D + r2) * D + c2] = C[((r1 * D + c1) * D + r2 - 1) * D + c2] + C[((r1 * D + c1) * D + r2) * D + c2 - 1] - C[((r1 * D + c1) * D + r2 - 1) * D + c2 - 1] + G[((r2 * D + c2) * D + r1) * D + c1]) >= 0))))
            ? IntStream.range(0, q).mapToObj(i -> String.valueOf(C[((Integer.parseInt(t[3 + n + 4 * i]) * D + Integer.parseInt(t[4 + n + 4 * i])) * D + Integer.parseInt(t[5 + n + 4 * i])) * D + Integer.parseInt(t[6 + n + 4 * i])])).collect(Collectors.joining("\n")) : "");
    }
}
