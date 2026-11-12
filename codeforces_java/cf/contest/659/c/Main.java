import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && Long.valueOf(st.nextToken()) instanceof Long m
            && IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).boxed().collect(Collectors.toSet()) instanceof Set<Integer> own
            && new long[1] instanceof long[] sum
            && IntStream.iterate(1, x -> x + 1).filter(x -> !own.contains(x)).takeWhile(x -> (sum[0] += x) <= m).boxed().toList() instanceof List<Integer> l
            ? l.size() + "\n" + l.stream().map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}
