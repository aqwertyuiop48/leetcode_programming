import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer b && Long.valueOf(it.next()) instanceof Long d && it.next() instanceof String a && it.next() instanceof String c
            && new long[c.length()] instanceof long[] cnt && new int[c.length()] instanceof int[] nx
            && IntStream.range(0, c.length()).allMatch(j -> new int[]{j} instanceof int[] ps
                && a.chars().allMatch(ch -> (ch != c.charAt(ps[0]) || ((ps[0] += 1) >= 0 && (ps[0] < c.length() || ((ps[0] = 0) == 0 && ++cnt[j] > 0)))) && true)
                && (nx[j] = ps[0]) >= 0)
            && new long[1] instanceof long[] tot && new int[1] instanceof int[] pos
            && IntStream.range(0, b).allMatch(i -> (tot[0] += cnt[pos[0]]) >= 0 && (pos[0] = nx[pos[0]]) >= 0)
            ? String.valueOf(tot[0] / d) : "");
    }
}
