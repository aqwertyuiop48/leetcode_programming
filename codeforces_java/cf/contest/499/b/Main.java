import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && new HashMap<String, String>() instanceof HashMap<String, String> d
            && IntStream.range(0, m).allMatch(i ->
                sc.next() instanceof String a
                && sc.next() instanceof String b
                && d.put(a, b.length() < a.length() ? b : a) == null)
            ? IntStream.range(0, n).mapToObj(i -> d.get(sc.next())).collect(Collectors.joining(" "))
            : "");
    }
}
