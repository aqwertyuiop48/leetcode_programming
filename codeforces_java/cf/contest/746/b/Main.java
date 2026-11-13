import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, n).filter(i -> sb.insert(sb.length() / 2, s.charAt(n - 1 - i)) != null).count() >= 0
            ? sb : "");
    }
}
