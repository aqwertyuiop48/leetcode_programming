import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long w && (Long) s.nextLong() instanceof Long m
            && LongStream.iterate(m, x -> x < 0 ? -1 : x % w == 0 ? x / w : x % w == 1 ? (x - 1) / w : x % w == w - 1 ? (x + 1) / w : -1).limit(101).noneMatch(x -> x < 0)
            ? "YES" : "NO");
    }
}
