import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s
            && LongStream.generate(sc::nextLong).limit(7).toArray() instanceof long[] v
            && "BSC".chars().mapToLong(c -> s.chars().filter(x -> x == c).count()).toArray() instanceof long[] need
            && Long.valueOf(v[6]) instanceof Long r
            && new long[]{0, 4000000000000L} instanceof long[] bs
            ? LongStream.range(0, 50).allMatch(z -> Long.valueOf((bs[0] + bs[1] + 1) / 2) instanceof Long mid
                && (IntStream.range(0, 3).mapToLong(i -> Math.max(0, need[i] * mid - v[i]) * v[3 + i]).sum() <= r ? (bs[0] = mid) >= 0 : (bs[1] = mid - 1) >= 0)) ? bs[0] : "" : "");
    }
}
