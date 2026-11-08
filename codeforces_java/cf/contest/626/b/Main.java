import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            && IntStream.range(0, 3).map(i -> (int) s.chars().filter(ch -> ch == "BGR".charAt(i)).count()).toArray() instanceof int[] c && Integer.valueOf((int) IntStream.of(c).filter(x -> x > 0).count()) instanceof Integer k
            && Integer.valueOf(IntStream.of(c).filter(x -> x > 0).min().getAsInt()) instanceof Integer mn
            ? IntStream.range(0, 3).filter(i -> k == 3 || (k == 1 ? c[i] > 0 : mn >= 2 || c[i] == 0 || (c[i] == 1 && n - 1 >= 2))).mapToObj(i -> String.valueOf("BGR".charAt(i))).collect(Collectors.joining()) : "");
    }
}
