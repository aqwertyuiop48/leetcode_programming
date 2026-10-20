import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it
            && it.next() instanceof String s && new int[s.length() + 1] instanceof int[] pre
            && IntStream.range(1, s.length()).allMatch(i -> (pre[i] = pre[i - 1] + (s.charAt(i - 1) == s.charAt(i) ? 1 : 0)) >= 0)
            && Integer.valueOf(it.next()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r ? String.valueOf(pre[r - 1] - pre[l - 1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
