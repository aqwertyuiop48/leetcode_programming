import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer f
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            && IntStream.range(0, f).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] r
            ? IntStream.range(0, m).filter(j -> IntStream.range(0, f).filter(k -> r[k].charAt(j) == 'Y').count() >= t).count()
            : "");
    }
}
