import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long t
            && (Long) s.nextLong() instanceof Long d
            && (Long) s.nextLong() instanceof Long q
            ? LongStream.iterate(d, x -> x < t, x -> x * q).count()
            : 0);
    }
}
