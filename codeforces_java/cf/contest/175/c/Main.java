import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong()}).sorted(Comparator.comparingLong((long[] t) -> t[1])).toList() instanceof List<long[]> types
            && Integer.valueOf(sc.nextInt()) instanceof Integer t
            && LongStream.generate(sc::nextLong).limit(t).toArray() instanceof long[] th
            && new long[]{0} instanceof long[] d
            ? types.stream().mapToLong(ty -> ty[1] * (ty[0] + Arrays.stream(th).map(a -> Math.max(0, d[0] + ty[0] - Math.max(d[0], a))).sum()) + 0 * (d[0] += ty[0])).sum()
            : 0);
    }
}
