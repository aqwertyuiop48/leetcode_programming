import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> s.next() instanceof String name ? IntStream.range(0, m).mapToObj(t -> new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).toList() : null).toList() instanceof List<List<int[]>> pl
            ? IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, n).filter(j -> j != i).mapToObj(j -> new int[]{i, j}))
                .mapToLong(ij -> new long[]{k} instanceof long[] room
                    ? IntStream.range(0, m).mapToObj(t -> new long[]{pl.get(ij[1]).get(t)[1] - pl.get(ij[0]).get(t)[0], pl.get(ij[0]).get(t)[2]})
                        .filter(p -> p[0] > 0).sorted(Comparator.comparingLong((long[] p) -> -p[0]))
                        .mapToLong(p -> Long.valueOf(Math.min(room[0], p[1])) instanceof Long take && (room[0] -= take) >= 0 ? take * p[0] : 0).sum() : 0).max().getAsLong()
            : 0);
    }
}

