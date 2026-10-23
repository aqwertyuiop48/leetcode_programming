import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> new int[] {sc.nextInt(), sc.nextInt()}).filter(nm ->
            IntStream.of(0, 1, nm[0] - 1, nm[0]).filter(x -> x >= 0 && x <= nm[0]).distinct().boxed().flatMap(x ->
                IntStream.of(0, 1, nm[1] - 1, nm[1]).filter(y -> y >= 0 && y <= nm[1]).distinct().mapToObj(y -> x * 1024 + y)).mapToInt(v -> v).toArray() instanceof int[] pts
            && (Integer) pts.length instanceof Integer c
            && ((IntToDoubleFunction) k ->
                (Integer) (k % c) instanceof Integer a
                && (Integer) (k / c % c) instanceof Integer b
                && (Integer) (k / c / c % c) instanceof Integer e
                && (Integer) (k / c / c / c) instanceof Integer d
                && (a - b) != 0 && (a - e) != 0 && (a - d) != 0 && (b - e) != 0 && (b - d) != 0 && (e - d) != 0
                ? Math.hypot((pts[a] >> 10) - (pts[b] >> 10), (pts[a] & 1023) - (pts[b] & 1023))
                    + Math.hypot((pts[b] >> 10) - (pts[e] >> 10), (pts[b] & 1023) - (pts[e] & 1023))
                    + Math.hypot((pts[e] >> 10) - (pts[d] >> 10), (pts[e] & 1023) - (pts[d] & 1023))
                : -1.0) instanceof IntToDoubleFunction len
            && IntStream.range(0, c * c * c * c).boxed().max(Comparator.comparingDouble(k -> len.applyAsDouble(k))).get() instanceof Integer best
            && IntStream.of(best % c, best / c % c, best / c / c % c, best / c / c / c).allMatch(i ->
                System.out.append(String.valueOf(pts[i] >> 10)).append(' ').append(String.valueOf(pts[i] & 1023)).append('\n') != null));
    }
}
