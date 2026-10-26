import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && s.next() instanceof String t
            && "ACGT".chars().mapToLong(c -> t.chars().filter(x -> x == c).count()).toArray() instanceof long[] f
            ? LongStream.range(0, n).reduce(1L, (a, i) -> a * LongStream.of(f).filter(x -> x == LongStream.of(f).max().getAsLong()).count() % 1000000007L) : 0);
    }
}
