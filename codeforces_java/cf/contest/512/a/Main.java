import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> w
            && new boolean[26][26] instanceof boolean[][] e && new int[26] instanceof int[] indeg && new boolean[1] instanceof boolean[] bad
            && IntStream.range(0, n - 1).allMatch(i -> w.get(i) instanceof String a && w.get(i + 1) instanceof String b
                && IntStream.range(0, Math.min(a.length(), b.length())).filter(j -> a.charAt(j) != b.charAt(j)).findFirst() instanceof OptionalInt d
                && (d.isPresent() ? !e[a.charAt(d.getAsInt()) - 'a'][b.charAt(d.getAsInt()) - 'a'] ? (e[a.charAt(d.getAsInt()) - 'a'][b.charAt(d.getAsInt()) - 'a'] = true) && ++indeg[b.charAt(d.getAsInt()) - 'a'] > 0 : true
                    : a.length() <= b.length() || (bad[0] = true)))
            && new boolean[26] instanceof boolean[] used && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, 26).allMatch(z -> IntStream.range(0, 26).filter(c -> !used[c] && indeg[c] == 0).findFirst() instanceof OptionalInt c
                && (c.isEmpty() || (used[c.getAsInt()] = true) && sb.append((char) ('a' + c.getAsInt())) != null
                    && IntStream.range(0, 26).filter(t -> e[c.getAsInt()][t]).allMatch(t -> --indeg[t] >= 0)))
            ? bad[0] || sb.length() < 26 ? "Impossible" : sb.toString() : "");
    }
}
