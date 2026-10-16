import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, s.nextInt()).mapToObj(i -> s.next()).toList() instanceof List<String> f
            && s.next() instanceof String w
            && s.next() instanceof String t
            && new boolean[w.length()] instanceof boolean[] mk
            && IntStream.range(0, w.length()).allMatch(i ->
                f.stream().allMatch(x ->
                    !w.regionMatches(true, i, x, 0, x.length())
                    || IntStream.range(i, i + x.length()).allMatch(p -> mk[p] = true)))
            ? IntStream.range(0, w.length())
                .mapToObj(i -> !mk[i]
                    ? String.valueOf(w.charAt(i))
                    : String.valueOf(Character.isUpperCase(w.charAt(i))
                        ? Character.toUpperCase(Character.toLowerCase(w.charAt(i)) == t.charAt(0) ? (t.charAt(0) == 'a' ? 'b' : 'a') : t.charAt(0))
                        : Character.toLowerCase(w.charAt(i)) == t.charAt(0) ? (t.charAt(0) == 'a' ? 'b' : 'a') : t.charAt(0)))
                .collect(Collectors.joining())
            : "");
    }
}



