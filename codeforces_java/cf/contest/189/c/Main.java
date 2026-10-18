import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt((String) it.next())).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] pos
            && IntStream.range(0, n).allMatch(i -> (pos[Integer.parseInt((String) it.next())] = i) >= 0)
            && new int[]{-1} instanceof int[] last
            ? n - IntStream.range(0, n).takeWhile(i -> pos[a[i]] > last[0] && (last[0] = pos[a[i]]) >= 0).count()
            : 0);
    }
}
