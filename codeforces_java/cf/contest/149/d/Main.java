import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.print(new Scanner(System.in).next() instanceof String t && new int[t.length()] instanceof int[] mt && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st && IntStream.range(0, t.length()).allMatch(i -> t.charAt(i) == '(' ? st.offerFirst(i) : (mt[st.pollFirst()] = i) >= 0) && new AtomicReference<Function<Integer, long[][]>>() instanceof AtomicReference<Function<Integer, long[][]>> sv && ((BiFunction<List<long[][]>, Integer, long[]>) (kids, a) -> kids.stream().reduce(IntStream.range(0, 3).mapToLong(c -> c == a ? 1 : 0).toArray(), (stt, k) -> IntStream.range(0, 3).mapToLong(c2 -> IntStream.range(0, 3).mapToLong(last -> IntStream.range(0, 3).filter(c1 -> last == 0 || c1 == 0 || last != c1).mapToLong(c1 -> stt[last] * k[c1][c2] % 1000000007L).sum() % 1000000007L).sum() % 1000000007L).toArray(), (x, y) -> x)) instanceof BiFunction<List<long[][]>, Integer, long[]> chain && sv.compareAndSet(null, l -> Optional.of(Stream.iterate(l + 1, c -> c < mt[l], c -> mt[c] + 1).map(c -> sv.get().apply(c)).toList()).map(kids -> IntStream.range(0, 3).mapToObj(a -> Optional.of(chain.apply(kids, a)).map(r -> IntStream.range(0, 3).mapToLong(b -> (a != 0) == (b != 0) ? 0 : IntStream.range(0, 3).filter(last -> last == 0 || b == 0 || last != b).mapToLong(last -> r[last]).sum() % 1000000007L).toArray()).get()).toArray(long[][]::new)).get()) ? Arrays.stream(chain.apply(Stream.iterate(0, c -> c < t.length(), c -> mt[c] + 1).map(c -> sv.get().apply(c)).toList(), 0)).sum() % 1000000007L : -1), "", 1L << 28).start();
    }
}
