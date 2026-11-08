import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long a && Long.valueOf(s.nextLong()) instanceof Long b
            ? LongStream.rangeClosed(2, 62).flatMap(len -> LongStream.range(0, len - 1).map(j -> (1L << len) - 1 - (1L << j))).filter(x -> x >= a && x <= b).count() : "");
    }
}
