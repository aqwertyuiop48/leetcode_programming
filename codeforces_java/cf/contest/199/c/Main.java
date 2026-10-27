import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long k
            && Long.valueOf(s.nextLong()) instanceof Long b
            && Long.valueOf(s.nextLong()) instanceof Long n
            && Long.valueOf(s.nextLong()) instanceof Long t
            ? n + 1 - LongStream.iterate(1, f -> f * k + b).limit(n + 1).takeWhile(f -> f <= t).count() : "");
    }
}

