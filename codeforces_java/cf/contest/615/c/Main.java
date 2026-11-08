import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t
            && Integer.valueOf(s.length()) instanceof Integer S && Integer.valueOf(t.length()) instanceof Integer m && Integer.valueOf(m + 2) instanceof Integer W
            ? (!t.chars().allMatch(ch -> s.indexOf(ch) >= 0) ? "-1"
                : new short[(S + 2) * W] instanceof short[] F && new short[(S + 2) * W] instanceof short[] R
                && IntStream.range(0, S).map(r -> S - 1 - r).allMatch(i -> IntStream.range(0, m).allMatch(j -> (F[i * W + j] = (short) (s.charAt(i) == t.charAt(j) ? F[(i + 1) * W + j + 1] + 1 : 0)) >= 0))
                && IntStream.range(0, S).allMatch(i -> IntStream.range(0, m).allMatch(j -> (R[i * W + j] = (short) (s.charAt(i) == t.charAt(j) ? (i > 0 ? R[(i - 1) * W + j + 1] : 0) + 1 : 0)) >= 0))
                && ((IntToLongFunction) j -> IntStream.range(0, S).mapToLong(i -> Math.max(
                    (long) F[i * W + j] << 24 | (long) (i + 1) << 12 | (i + F[i * W + j]),
                    (long) R[i * W + j] << 24 | (long) (i + 1) << 12 | (i + 2 - R[i * W + j]))).max().getAsLong()) instanceof IntToLongFunction best
                && Stream.iterate(0, j -> j < m, j -> j + (int) (best.applyAsLong(j) >> 24))
                    .map(j -> Long.valueOf(best.applyAsLong(j)) instanceof Long b ? ((b >> 12) & 4095) + " " + (b & 4095) : "").collect(Collectors.toList()) instanceof List<String> pieces
                ? pieces.size() + "\n" + String.join("\n", pieces) : "") : "");
    }
}
