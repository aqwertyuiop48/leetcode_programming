import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new long[40] instanceof long[] avail
            && IntStream.range(0, n).map(i -> it.next()).allMatch(a -> IntStream.range(0, 31).allMatch(k -> (avail[k] += a >> k & 1) >= 0))
            ? IntStream.range(0, m).map(i -> it.next()).sorted().takeWhile(b -> IntStream.rangeClosed(b, 31).filter(k -> avail[k] > 0).boxed().findFirst()
                .map(k -> avail[k]-- > 0 && IntStream.range(b, k).allMatch(j -> ++avail[j] > 0)).orElse(false)).count() : "");
    }
}
