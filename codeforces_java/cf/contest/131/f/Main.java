import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(a -> Optional.of(Stream.generate(s::next).limit(a[0]).toArray(String[]::new)).ifPresent(g -> Optional.of(new int[a[0] + 1][a[1] + 1]).ifPresent(A -> Optional.of(new long[1]).ifPresent(tot -> System.out.print(IntStream.range(0, a[0] * a[1]).allMatch(p -> (A[p / a[1] + 1][p % a[1] + 1] = A[p / a[1]][p % a[1] + 1] + A[p / a[1] + 1][p % a[1]] - A[p / a[1]][p % a[1]] + (p / a[1] > 0 && p / a[1] < a[0] - 1 && p % a[1] > 0 && p % a[1] < a[1] - 1 && g[p / a[1]].charAt(p % a[1]) == '1' && g[p / a[1] - 1].charAt(p % a[1]) == '1' && g[p / a[1] + 1].charAt(p % a[1]) == '1' && g[p / a[1]].charAt(p % a[1] - 1) == '1' && g[p / a[1]].charAt(p % a[1] + 1) == '1' ? 1 : 0)) >= 0) && IntStream.range(0, a[0]).allMatch(r1 -> IntStream.range(r1 + 2, a[0]).allMatch(r2 -> A[r2][a[1]] - A[r1 + 1][a[1]] < a[2] || A[r2] instanceof int[] hi && A[r1 + 1] instanceof int[] lo && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> f && f.getAndSet((c1, p) -> c1 >= a[1] ? 0 : p < c1 + 2 ? f.get().applyAsInt(c1, c1 + 2) : p >= a[1] ? 0 : hi[p] - lo[p] - hi[c1 + 1] + lo[c1 + 1] >= a[2] ? a[1] - p + f.get().applyAsInt(c1 + 1, p) : f.get().applyAsInt(c1, p + 1)) == null && (tot[0] += f.get().applyAsInt(0, 0)) >= 0)) ? tot[0] : 0))))));
    }
}

