import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] x
            && new boolean[n] instanceof boolean[] forced && Integer.valueOf(it.next()) instanceof Integer t
            && IntStream.range(0, t).allMatch(i -> (forced[it.next() - 1] = true))
            && new int[n] instanceof int[] res && new int[n + 1] instanceof int[] stack && new int[]{0} instanceof int[] sp
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> !forced[i] && sp[0] > 0 && stack[sp[0] - 1] == x[i]
                ? (res[i] = x[i]) > 0 && (sp[0]--) > 0
                : (res[i] = -x[i]) < 0 && (stack[sp[0]++] = x[i]) > 0)
            ? sp[0] == 0 ? "YES\n" + Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "NO" : "");
    }
}

