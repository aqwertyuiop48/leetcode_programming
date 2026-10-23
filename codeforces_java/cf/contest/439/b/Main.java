import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer x
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).sorted().toArray() instanceof long[] c
            ? IntStream.range(0, n).mapToLong(i -> c[i] * Math.max(x - i, 1)).sum() : 0);
    }
}
