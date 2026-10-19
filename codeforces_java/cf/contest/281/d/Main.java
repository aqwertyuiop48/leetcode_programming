import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] st && new int[2] instanceof int[] sp
            && IntStream.range(0, n).allMatch(i ->
                IntStream.iterate(0, z -> sp[0] > 0 && st[sp[0] - 1] < a[i], z -> z + 1).allMatch(z -> (sp[1] = Math.max(sp[1], st[--sp[0]] ^ a[i])) >= 0)
                && (sp[0] == 0 || (sp[1] = Math.max(sp[1], st[sp[0] - 1] ^ a[i])) >= 0)
                && (st[sp[0]++] = a[i]) >= 0)
            ? sp[1] : "");
    }
}
