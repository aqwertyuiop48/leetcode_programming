import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && sc.next() instanceof String s && sc.next() instanceof String t
            && (Integer) (int) IntStream.range(0, n).filter(i -> s.charAt(i) != t.charAt(i)).count() instanceof Integer d
            && new int[26][26] instanceof int[][] pos && IntStream.range(0, 26).allMatch(i -> IntStream.range(0, 26).allMatch(j -> (pos[i][j] = -1) < 0))
            && IntStream.range(0, n).filter(i -> s.charAt(i) != t.charAt(i)).allMatch(i -> (pos[s.charAt(i) - 'a'][t.charAt(i) - 'a'] = i) >= 0)
            && IntStream.range(0, n).filter(i -> s.charAt(i) != t.charAt(i)).filter(i -> pos[t.charAt(i) - 'a'][s.charAt(i) - 'a'] >= 0).findFirst() instanceof OptionalInt two
            && IntStream.range(0, n).filter(i -> s.charAt(i) != t.charAt(i)).filter(i -> IntStream.range(0, 26).anyMatch(c -> pos[t.charAt(i) - 'a'][c] >= 0)).findFirst() instanceof OptionalInt one
            ? two.isPresent() ? (d - 2) + "\n" + (two.getAsInt() + 1) + " " + (pos[t.charAt(two.getAsInt()) - 'a'][s.charAt(two.getAsInt()) - 'a'] + 1)
                : one.isPresent() ? (d - 1) + "\n" + (one.getAsInt() + 1) + " " + (IntStream.range(0, 26).filter(c -> pos[t.charAt(one.getAsInt()) - 'a'][c] >= 0).map(c -> pos[t.charAt(one.getAsInt()) - 'a'][c]).findFirst().getAsInt() + 1)
                : d + "\n-1 -1" : "");
    }
}
