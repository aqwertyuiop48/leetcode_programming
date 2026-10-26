import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && s.next() instanceof String a && s.next() instanceof String b
            ? IntStream.range(0, n).map(i -> Math.min(Math.abs(a.charAt(i) - b.charAt(i)), 10 - Math.abs(a.charAt(i) - b.charAt(i)))).sum() : 0);
    }
}
