import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && Integer.valueOf(t[2]) instanceof Integer a && Integer.valueOf(t[3]) instanceof Integer b
            && Integer.valueOf(t[4]) instanceof Integer c && Integer.valueOf(t[5]) instanceof Integer d
            ? (n == 4 || k <= n ? "-1"
                : IntStream.concat(IntStream.concat(IntStream.of(a, c), IntStream.rangeClosed(1, n).filter(x -> x != a && x != b && x != c && x != d)), IntStream.of(d, b)).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                + "\n" + IntStream.concat(IntStream.concat(IntStream.of(c, a), IntStream.rangeClosed(1, n).filter(x -> x != a && x != b && x != c && x != d)), IntStream.of(b, d)).mapToObj(String::valueOf).collect(Collectors.joining(" ")))
            : "");
    }
}
