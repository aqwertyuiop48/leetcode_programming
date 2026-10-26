import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String s && sc.next() instanceof String t && new int[]{0} instanceof int[] k
            && (Long) IntStream.range(0, s.length()).filter(i -> s.charAt(i) != t.charAt(i)).count() instanceof Long d
            ? d % 2 == 1 ? "impossible" : IntStream.range(0, s.length()).mapToObj(i -> s.charAt(i) != t.charAt(i) && k[0]++ % 2 == 1 ? String.valueOf(t.charAt(i)) : String.valueOf(s.charAt(i))).collect(Collectors.joining()) : "");
    }
}
