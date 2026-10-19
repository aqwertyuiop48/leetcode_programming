import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long y && Long.valueOf(s.nextLong()) instanceof Long k && Long.valueOf(s.nextLong()) instanceof Long n
            && LongStream.iterate((y / k + 1) * k, t -> t <= n, t -> t + k).map(t -> t - y).boxed().map(String::valueOf).collect(Collectors.joining(" ")) instanceof String res
            ? res.isEmpty() ? "-1" : res : "");
    }
}
