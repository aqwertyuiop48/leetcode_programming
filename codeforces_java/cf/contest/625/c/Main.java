import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long k
            ? (n * (n * (k - 1) + 1) + (n - k + 1) * (n * (n - 1) / 2)) + "\n" + LongStream.range(0, n).mapToObj(i -> LongStream.range(0, n).mapToObj(j -> String.valueOf(j < k - 1 ? i * (k - 1) + j + 1 : n * (k - 1) + 1 + i * (n - k + 1) + (j - k + 1))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
