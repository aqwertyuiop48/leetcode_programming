import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && sc.nextToken() instanceof String s && sc.nextToken() instanceof String t && new int[26] instanceof int[] m
            && IntStream.range(0, s.length()).allMatch(i -> (m[s.charAt(i) - 97] == 0 && m[t.charAt(i) - 97] == 0
                ? (m[s.charAt(i) - 97] = t.charAt(i) - 96) > 0 && (m[t.charAt(i) - 97] = s.charAt(i) - 96) > 0
                : m[s.charAt(i) - 97] == t.charAt(i) - 96 && m[t.charAt(i) - 97] == s.charAt(i) - 96))
            ? IntStream.range(0, 26).filter(x -> m[x] - 1 > x).count() + IntStream.range(0, 26).filter(x -> m[x] - 1 > x).mapToObj(x -> "\n" + (char) (97 + x) + " " + (char) (96 + m[x])).collect(Collectors.joining())
            : "-1");
    }
}
