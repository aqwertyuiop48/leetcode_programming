import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && new int[n + 2] instanceof int[] a && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = Integer.parseInt(it.next())) >= 0) && (a[n + 1] = n + 1) > 0
            && new int[8] instanceof int[] mv && new int[1] instanceof int[] used && new int[1] instanceof int[] tl && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> rec
            && ((BiPredicate<Integer, Integer>) (l, r) -> IntStream.range(0, (r - l + 1) / 2).allMatch(k -> (a[l + k] = a[r - k] + a[l + k] - (a[r - k] = a[l + k])) >= 0)) instanceof BiPredicate<Integer, Integer> rev
            && rec.compareAndSet(null, rem -> Long.valueOf(IntStream.rangeClosed(0, n).filter(i -> Math.abs(a[i] - a[i + 1]) != 1).count()) instanceof Long bp
                && ((bp == 0 && (used[0] = tl[0] - rem) >= 0)
                    || rem > 0 && bp <= 2L * rem && IntStream.rangeClosed(1, n).filter(i -> Math.abs(a[i] - a[i - 1]) != 1 || Math.abs(a[i] - a[i + 1]) != 1).boxed().toList() instanceof List<Integer> c
                        && c.stream().anyMatch(l -> c.stream().filter(r -> r > l).anyMatch(r -> rev.test(l, r) && (mv[2 * (tl[0] - rem)] = l) >= 0 && (mv[2 * (tl[0] - rem) + 1] = r) >= 0 && (rec.get().test(rem - 1) || !rev.test(l, r))))))
            ? (IntStream.rangeClosed(0, 3).anyMatch(T -> (tl[0] = T) >= 0 && rec.get().test(T)) ? used[0] + "\n" + IntStream.range(0, used[0]).mapToObj(i -> mv[2 * i] + " " + mv[2 * i + 1]).collect(Collectors.joining("\n")) : "") : "");
    }
}
