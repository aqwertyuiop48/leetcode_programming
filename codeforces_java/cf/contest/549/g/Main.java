import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong() + i).sorted().toArray() instanceof long[] b
            && IntStream.range(0, n).mapToLong(i -> b[i] - i).toArray() instanceof long[] r
            ? IntStream.range(1, n).allMatch(i -> r[i] >= r[i - 1]) ? Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : ":(" : "");
    }
}
