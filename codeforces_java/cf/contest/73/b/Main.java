import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && IntStream.range(0, n).mapToObj(i -> new Object[]{s.next(), s.nextLong()}).toList() instanceof List<Object[]> tm
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && LongStream.concat(IntStream.range(0, m).mapToLong(i -> s.nextLong()), LongStream.generate(() -> 0L).limit(n - m)).sorted().toArray() instanceof long[] a
                && s.next() instanceof String me
                && tm.stream().filter(o -> o[0].equals(me)).findFirst().get() instanceof Object[] t
                && tm.stream().filter(o -> o != t).toList() instanceof List<Object[]> others
                && new int[1] instanceof int[] p1
                && new int[1] instanceof int[] p2
                && Long.valueOf((long) t[1] + a[n - 1]) instanceof Long top
                && Long.valueOf((long) t[1] + a[0]) instanceof Long low
                && others.stream().mapToLong(o -> top - (long) o[1] - (((String) o[0]).compareTo(me) < 0 ? 1 : 0)).sorted().toArray() instanceof long[] caps
                && others.stream().mapToLong(o -> low - (long) o[1] + (((String) o[0]).compareTo(me) < 0 ? 0 : 1)).sorted().toArray() instanceof long[] needs
                ? (1 + n - 1 - LongStream.of(caps).filter(c -> a[p1[0]] <= c && ++p1[0] > 0).count())
                    + " "
                    + (1 + LongStream.of(a).skip(1).filter(x -> p2[0] < needs.length && x >= needs[p2[0]] && ++p2[0] > 0).count())
                : ""));
    }
}
