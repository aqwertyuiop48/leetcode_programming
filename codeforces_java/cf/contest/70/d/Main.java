import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.<BiPredicate<TreeMap<Long, Long>, long[]>>of((m, p) -> Optional.ofNullable(m.floorEntry(p[0])).flatMap(fl -> Optional.ofNullable(m.ceilingEntry(p[0])).map(ce -> fl.getKey().equals(ce.getKey()) ? p[1] <= fl.getValue() : (ce.getKey() - fl.getKey()) * (p[1] - fl.getValue()) - (ce.getValue() - fl.getValue()) * (p[0] - fl.getKey()) <= 0)).orElse(false)).ifPresent(below ->
            Optional.<BiPredicate<TreeMap<Long, Long>, long[]>>of((m, p) -> !below.test(m, p)
                && (m.put(p[0], p[1]) == null | true)
                && Stream.generate(() -> 0).takeWhile(z -> Optional.ofNullable(m.lowerEntry(p[0])).flatMap(b -> Optional.ofNullable(m.lowerEntry(b.getKey())).map(a -> (b.getKey() - a.getKey()) * (p[1] - b.getValue()) - (b.getValue() - a.getValue()) * (p[0] - b.getKey()) >= 0 && m.remove(b.getKey()) != null)).orElse(false)).count() >= 0
                && Stream.generate(() -> 0).takeWhile(z -> Optional.ofNullable(m.higherEntry(p[0])).flatMap(b -> Optional.ofNullable(m.higherEntry(b.getKey())).map(c -> (b.getKey() - p[0]) * (c.getValue() - b.getValue()) - (b.getValue() - p[1]) * (c.getKey() - b.getKey()) >= 0 && m.remove(b.getKey()) != null)).orElse(false)).count() >= 0).ifPresent(ins ->
            Optional.of(new TreeMap<Long, Long>()).ifPresent(up ->
            Optional.of(new TreeMap<Long, Long>()).ifPresent(lo ->
                System.out.print(IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).map(q -> q[0] == 1 ? (ins.test(up, new long[]{q[1], q[2]}) | ins.test(lo, new long[]{q[1], -q[2]}) ? "" : "") : (below.test(up, new long[]{q[1], q[2]}) && below.test(lo, new long[]{q[1], -q[2]}) ? "YES" : "NO")).filter(r -> !r.isEmpty()).collect(Collectors.joining("\n")))))))));
    }
}


