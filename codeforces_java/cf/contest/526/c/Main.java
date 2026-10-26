import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long c && (Long) s.nextLong() instanceof Long hr && (Long) s.nextLong() instanceof Long hb
            && (Long) s.nextLong() instanceof Long wr && (Long) s.nextLong() instanceof Long wb
            ? Math.max(LongStream.rangeClosed(0, Math.min(c / wr, 100000)).map(x -> x * hr + (c - x * wr) / wb * hb).max().getAsLong(),
                LongStream.rangeClosed(0, Math.min(c / wb, 100000)).map(y -> y * hb + (c - y * wb) / wr * hr).max().getAsLong()) : 0);
    }
}
