import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new HashMap<String, Integer>(Map.of("polycarp", 1)) instanceof HashMap<String, Integer> d
            ? IntStream.range(0, n).map(i -> s.next().toLowerCase() instanceof String a && s.next() != null && s.next().toLowerCase() instanceof String b ? d.merge(a, d.get(b) + 1, Math::max) : 0).max().getAsInt() : 0);
    }
}
