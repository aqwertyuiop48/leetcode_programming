import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && s.next() instanceof String m
            && new int[n + 1] instanceof int[] P && new int[n + 1] instanceof int[] Q
            && IntStream.range(0, n).allMatch(i -> (P[i + 1] = P[i] + a[i]) >= 0 && (Q[i + 1] = Q[i] + (m.charAt(i) == '1' ? a[i] : 0)) >= 0)
            ? Math.max(Q[n], IntStream.range(0, n).filter(i -> m.charAt(i) == '1').map(i -> Q[n] - Q[i + 1] + P[i]).max().orElse(0)) : "");
    }
}
