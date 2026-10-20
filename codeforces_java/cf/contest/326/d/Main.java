import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(3002) instanceof Integer W
            && new short[W * W] instanceof short[] rL && new short[W * W] instanceof short[] rR && new short[W * W] instanceof short[] rD && new short[W * W] instanceof short[] rU
            && new int[W * W] instanceof int[] P
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(t[1 + 4 * i]) instanceof Integer a && Integer.valueOf(t[2 + 4 * i]) instanceof Integer b
                && Integer.valueOf(t[3 + 4 * i]) instanceof Integer c && Integer.valueOf(t[4 + 4 * i]) instanceof Integer d
                && IntStream.range(b, d).allMatch(y -> (rL[a * W + y] = 1) > 0 && (rR[c * W + y] = 1) > 0)
                && IntStream.range(a, c).allMatch(x -> (rD[b * W + x] = 1) > 0 && (rU[d * W + x] = 1) > 0 && IntStream.range(b, d).allMatch(y -> (P[(x + 1) * W + y + 1] = 1) > 0)))
            && IntStream.range(0, W).allMatch(x -> IntStream.iterate(W - 2, y -> y >= 0, y -> y - 1).allMatch(y -> rL[x * W + y] == 0 || (rL[x * W + y] += rL[x * W + y + 1]) > 0)
                && IntStream.iterate(W - 2, y -> y >= 0, y -> y - 1).allMatch(y -> rD[x * W + y] == 0 || (rD[x * W + y] += rD[x * W + y + 1]) > 0)
                && IntStream.range(1, W).allMatch(y -> rR[x * W + y] == 0 || (rR[x * W + y] += rR[x * W + y - 1]) > 0)
                && IntStream.range(1, W).allMatch(y -> rU[x * W + y] == 0 || (rU[x * W + y] += rU[x * W + y - 1]) > 0))
            && IntStream.range(1, W).allMatch(x -> IntStream.range(1, W).allMatch(y -> (P[x * W + y] += P[(x - 1) * W + y] + P[x * W + y - 1] - P[(x - 1) * W + y - 1]) >= 0))
            && ((IntUnaryOperator) i -> Integer.valueOf(t[1 + 4 * i]) instanceof Integer a && Integer.valueOf(t[2 + 4 * i]) instanceof Integer b
                ? IntStream.rangeClosed(1, Math.min(rL[a * W + b], rD[b * W + a])).takeWhile(s -> P[(a + s) * W + b + s] - P[(a + s - 1) * W + b + s] - P[(a + s) * W + b + s - 1] + P[(a + s - 1) * W + b + s - 1] == 1)
                    .filter(s -> rR[(a + s) * W + b + s - 1] >= s && rU[(b + s) * W + a + s - 1] >= s && P[(a + s) * W + b + s] - P[a * W + b + s] - P[(a + s) * W + b] + P[a * W + b] == s * s).findFirst().orElse(0) : 0) instanceof IntUnaryOperator sol
            && IntStream.range(0, n).filter(i -> sol.applyAsInt(i) > 0).findFirst() instanceof OptionalInt f
            ? (f.isPresent() ? (Integer.valueOf(t[1 + 4 * f.getAsInt()]) instanceof Integer a && Integer.valueOf(t[2 + 4 * f.getAsInt()]) instanceof Integer b && Integer.valueOf(sol.applyAsInt(f.getAsInt())) instanceof Integer s
                && IntStream.range(0, n).filter(i -> t[1 + 4 * i] >= a && t[2 + 4 * i] >= b && t[3 + 4 * i] <= a + s && t[4 + 4 * i] <= b + s).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.toList()) instanceof List<String> ids
                ? "YES " + ids.size() + "\n" + String.join(" ", ids) : "") : "NO") : "");
    }
}
