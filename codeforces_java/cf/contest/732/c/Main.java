import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && LongStream.generate(s::nextLong).limit(3).toArray() instanceof long[] c
            && Long.valueOf(Math.max(c[0], Math.max(c[1], c[2]))) instanceof Long m
            ? Arrays.stream(c).map(v -> Math.max(0L, m - 1 - v)).sum() : 0L);
    }
}
