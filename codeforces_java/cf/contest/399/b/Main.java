import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String s
            ? IntStream.range(0, n).filter(i -> s.charAt(i) == 'B').mapToLong(i -> 1L << i).sum() : "");
    }
}
