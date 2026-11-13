import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] f && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] del
            && Integer.valueOf(f[del[0] - 1].length()) instanceof Integer len && IntStream.of(del).allMatch(d -> f[d - 1].length() == len)
            && IntStream.range(0, len).mapToObj(i -> IntStream.of(del).allMatch(d -> f[d - 1].charAt(i) == f[del[0] - 1].charAt(i)) ? String.valueOf(f[del[0] - 1].charAt(i)) : "?").collect(Collectors.joining()) instanceof String p
            && IntStream.rangeClosed(1, n).filter(k -> IntStream.of(del).noneMatch(d -> d == k)).noneMatch(k -> f[k - 1].length() == len && IntStream.range(0, len).allMatch(i -> p.charAt(i) == '?' || p.charAt(i) == f[k - 1].charAt(i)))
            ? "Yes\n" + p : "No");
    }
}
