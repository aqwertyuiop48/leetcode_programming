import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 6).map(i -> s.nextInt()).toArray() instanceof int[] v
            ? IntStream.rangeClosed(-1, v[1] - 1).anyMatch(i -> IntStream.rangeClosed(-1, v[1] - 1).anyMatch(j ->
                    (i < 0 ? 0 : Math.max(0, v[2] - v[4] * i)) + (j < 0 ? 0 : Math.max(0, v[3] - v[5] * j)) == v[0])) ? "YES" : "NO"
            : "");
    }
}

