import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n
            && t.nextToken() instanceof String s
            ? IntStream.of(0, 1).map(p -> Math.max(
                (int) IntStream.range(0, n).filter(i -> i % 2 == p && s.charAt(i) == 'b').count(),
                (int) IntStream.range(0, n).filter(i -> i % 2 != p && s.charAt(i) == 'r').count())).min().getAsInt() : "");
    }
}
