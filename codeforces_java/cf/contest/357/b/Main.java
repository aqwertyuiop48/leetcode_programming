import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && new int[n + 1] instanceof int[] res
            && IntStream.range(0, m).allMatch(d -> new int[]{it.next(), it.next(), it.next()} instanceof int[] t
                && Integer.valueOf(Arrays.stream(t).map(x -> res[x]).filter(c -> c > 0).map(c -> 1 << c).sum()) instanceof Integer used
                && IntStream.rangeClosed(1, 3).filter(c -> (used >> c & 1) == 0).toArray() instanceof int[] rest && new int[1] instanceof int[] ptr
                && Arrays.stream(t).filter(x -> res[x] == 0).allMatch(x -> (res[x] = rest[ptr[0]++]) > 0))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(Math.max(1, res[i]))).collect(Collectors.joining(" ")) : "");
    }
}
