import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && tk[1] instanceof String s
            && Integer.valueOf((int) s.chars().filter(c -> c == '?').count()) instanceof Integer q
            && Integer.valueOf(n / 2 - (n - q)) instanceof Integer k
            ? n % 2 != 0 || k < 0 || k > q ? "0"
                : new int[][] {new int[n / 2 + 3], new int[n / 2 + 3]} instanceof int[][] p && (p[0][0] = 1) == 1 && new int[] {0, 1, 0} instanceof int[] st
                && IntStream.range(0, n).allMatch(i -> s.charAt(i) != '?' ? ++st[0] > 0
                    : Integer.valueOf(st[1]) instanceof Integer K && p[st[2]] instanceof int[] cur && p[1 - st[2]] instanceof int[] nx
                    && (st[0] > 0
                        ? (nx[0] = cur[0]) == nx[0] && (nx[K] = cur[K - 1]) == nx[K] && Stream.of(0).peek(z -> IntStream.range(1, K).forEach(j -> nx[j] = cur[j - 1] + cur[j])).findFirst().isPresent() && --st[0] >= 0 && ++st[1] > 0 && (st[2] = 1 - st[2]) >= 0
                        : Stream.of(0).peek(z -> IntStream.range(0, K - 1).forEach(j -> cur[j] += cur[j + 1])).findFirst().isPresent() && (st[0] = 1) == 1))
                ? Integer.toUnsignedString((st[0] == 0 ? p[st[2]][0] : 0) * IntStream.range(0, k).reduce(1, (a, z) -> a * 25)) : "" : "");
    }
}
