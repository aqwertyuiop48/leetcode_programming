import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer k && sc.next().toCharArray() instanceof char[] s
            && new int[n + 1] instanceof int[] pi
            && IntStream.range(1, n).allMatch(i -> (Integer) IntStream.iterate(pi[i], j -> j > 0 && s[i] != s[j], j -> pi[j]).reduce(-1, (x, y) -> y) instanceof Integer last
                && (Integer) (last < 0 ? pi[i] : pi[last]) instanceof Integer f && (pi[i + 1] = f + (s[i] == s[f] ? 1 : 0)) >= 0)
            ? IntStream.rangeClosed(1, n).mapToObj(len -> (Integer) (len - pi[len]) instanceof Integer p && (Integer) (len / p) instanceof Integer q
                ? q >= k && (len % p == 0 ? (q + k) / (k + 1) <= q / k : q % k <= q / k - 1) ? "1" : "0" : "").collect(Collectors.joining()) : "");
    }
}
