import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && s.next() instanceof String t
            && t.substring(0, n).chars().sorted().toArray() instanceof int[] x
            && t.substring(n).chars().sorted().toArray() instanceof int[] y
            ? IntStream.range(0, n).allMatch(i -> x[i] < y[i]) || IntStream.range(0, n).allMatch(i -> x[i] > y[i]) ? "YES" : "NO"
            : "");
    }
}

