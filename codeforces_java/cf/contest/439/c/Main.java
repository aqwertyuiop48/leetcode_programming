import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer k && Integer.valueOf(t.nextToken()) instanceof Integer p
            && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(n).toArray() instanceof int[] a
            && Arrays.stream(a).filter(v -> v % 2 != 0).toArray() instanceof int[] od
            && Arrays.stream(a).filter(v -> v % 2 == 0).toArray() instanceof int[] ev
            && Integer.valueOf(k - p) instanceof Integer q
            ? (q <= od.length && (od.length - q) % 2 == 0 && ev.length + (od.length - q) / 2 >= p
                ? "YES\n" + IntStream.range(0, k).mapToObj(i -> IntStream.concat(
                    i < q ? IntStream.of(od[i]) : i - q < ev.length ? IntStream.of(ev[i - q])
                        : IntStream.of(od[q + 2 * (i - q - ev.length)], od[q + 2 * (i - q - ev.length) + 1]),
                    i == k - 1 ? IntStream.concat(Arrays.stream(ev, Math.min(p, ev.length), ev.length),
                        Arrays.stream(od, q + 2 * Math.max(0, p - ev.length), od.length)) : IntStream.empty()).toArray() instanceof int[] s
                    ? s.length + " " + Arrays.stream(s).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "").collect(Collectors.joining("\n"))
                : "NO") : "");
    }
}
