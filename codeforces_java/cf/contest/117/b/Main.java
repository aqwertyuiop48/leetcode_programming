import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(q ->
            System.out.println(LongStream.rangeClosed(0, Math.min(q[0], q[2]))
                .filter(x -> Math.floorMod(-x * 1000000000L, q[2]) > q[1])
                .boxed().findFirst()
                .map(x -> "1 " + String.format("%09d", x)).orElse("2")));
    }
}

