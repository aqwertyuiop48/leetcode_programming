import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer u
            && Integer.valueOf(s.nextInt()) instanceof Integer r
            && IntStream.range(0, n + 2).map(i -> i < n ? s.nextInt() : 0).toArray() instanceof int[] a0
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] k
            && IntStream.range(0, n).map(i -> s.nextInt() - 1).toArray() instanceof int[] p
            && new AtomicReference<ToLongFunction<int[]>>() instanceof AtomicReference<ToLongFunction<int[]>> f
            ? Stream.of(0).peek(z -> f.set(st -> Math.max(
                (u - st[n]) % 2 == 0 ? IntStream.range(0, n).mapToLong(i -> (long) st[i] * k[i]).sum() : Long.MIN_VALUE,
                st[n] >= u ? Long.MIN_VALUE : Math.max(
                    st[n + 1] == 1 ? Long.MIN_VALUE : f.get().applyAsLong(IntStream.range(0, n + 2).map(i -> i < n ? st[i] ^ b[i] : i == n ? st[n] + 1 : 1).toArray()),
                    f.get().applyAsLong(IntStream.range(0, n + 2).map(i -> i < n ? st[p[i]] + r : i == n ? st[n] + 1 : 0).toArray()))))).map(z -> f.get().applyAsLong(a0)).findFirst().get()
            : "");
    }
}
