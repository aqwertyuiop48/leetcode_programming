import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim() instanceof String s
            && (Integer) s.length() instanceof Integer n
            && new int[n] instanceof int[] pi
            && IntStream.range(1, n).allMatch(i ->
                (Integer) IntStream.iterate(pi[i - 1], j -> pi[j - 1]).filter(j -> j == 0 || s.charAt(i) == s.charAt(j)).findFirst().getAsInt() instanceof Integer j
                && (pi[i] = j + (s.charAt(i) == s.charAt(j) ? 1 : 0)) >= 0)
            && (Integer) IntStream.range(0, n - 1).map(i -> pi[i]).max().orElse(0) instanceof Integer mx
            ? (IntStream.iterate(pi[n - 1], l -> l > 0, l -> pi[l - 1]).filter(l -> l <= mx).findFirst() instanceof OptionalInt o && o.isPresent()
                ? s.substring(0, o.getAsInt()) : "Just a legend")
            : "");
    }
}
