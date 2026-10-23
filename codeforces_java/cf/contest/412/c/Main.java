import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] p
            ? IntStream.range(0, p[0].length()).mapToObj(j -> Arrays.stream(p).map(x -> x.charAt(j)).filter(c -> c != '?').distinct().toList() instanceof List<Character> l
                ? l.isEmpty() ? "x" : l.size() == 1 ? String.valueOf(l.get(0)) : "?" : "").collect(Collectors.joining()) : "");
    }
}
