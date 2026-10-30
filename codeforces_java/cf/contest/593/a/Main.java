import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] w
            ? IntStream.range(0, 676).map(p -> Arrays.stream(w).filter(x -> x.chars().allMatch(ch -> ch - 'a' == p / 26 || ch - 'a' == p % 26)).mapToInt(String::length).sum()).max().getAsInt() : 0);
    }
}
