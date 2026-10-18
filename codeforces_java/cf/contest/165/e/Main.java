import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> rd.getAsInt()).toArray() instanceof int[] a
            && IntStream.generate(() -> -1).limit(1 << 22).toArray() instanceof int[] dp
            && Arrays.stream(a).allMatch(x -> (dp[x] = x) > 0)
            && IntStream.range(0, 22).allMatch(b -> IntStream.range(0, 1 << 22).allMatch(m -> (m >> b & 1) == 0 || dp[m] != -1 || (dp[m] = dp[m ^ (1 << b)]) != Integer.MIN_VALUE))
            ? Arrays.stream(a).mapToObj(x -> String.valueOf(dp[((1 << 22) - 1) ^ x])).collect(Collectors.joining(" "))
            : "");
    }
}
