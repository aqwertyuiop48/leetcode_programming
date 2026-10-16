import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(LongStream.generate(s::nextLong).limit(n).toArray()).ifPresent(a ->
            Optional.of(LongStream.generate(s::nextLong).limit(n).toArray()).ifPresent(b ->
            Optional.<Function<long[][], long[]>>of(ab ->
                Optional.of(new long[]{0}).map(acc ->
                    LongStream.concat(LongStream.of(0), IntStream.range(0, n).mapToLong(k -> acc[0] += ab[0][k] - ab[1][k])).toArray())
                .map(pn -> IntStream.rangeClosed(0, 2 * n).mapToLong(k -> (long) (k / n) * pn[n] + pn[k % n]).toArray())
                .map(d -> Optional.of(new ArrayList<long[]>(List.of(d))).map(lv ->
                    IntStream.rangeClosed(1, 17).boxed().allMatch(k -> lv.add(IntStream.range(0, Math.max(0, d.length - (1 << k) + 1)).mapToLong(i -> Math.min(lv.get(k - 1)[i], lv.get(k - 1)[i + (1 << (k - 1))])).toArray()))
                        ? IntStream.range(0, n).mapToLong(i -> Math.min(lv.get(31 - Integer.numberOfLeadingZeros(n))[i + 1], lv.get(31 - Integer.numberOfLeadingZeros(n))[i + n - (1 << (31 - Integer.numberOfLeadingZeros(n))) + 1]) - d[i] >= 0 ? 1 : 0).toArray()
                        : null).get())
                .get())
            .ifPresent(g ->
                Optional.of(g.apply(new long[][]{a, b})).ifPresent(f ->
                Optional.of(g.apply(new long[][]{IntStream.range(0, n).mapToLong(k -> a[n - 1 - k]).toArray(), IntStream.range(0, n).mapToLong(k -> b[((n - 2 - k) % n + n) % n]).toArray()})).ifPresent(r ->
                Optional.of(IntStream.rangeClosed(1, n).filter(i -> f[i - 1] + r[n - i] > 0).boxed().toList()).ifPresent(res ->
                    System.out.print(res.size() + "\n" + res.stream().map(String::valueOf).collect(Collectors.joining(" "))))))
            )))));
    }
}



