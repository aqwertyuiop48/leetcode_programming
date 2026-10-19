import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && new int[1] instanceof int[] d
            ? IntStream.range(0, n).mapToObj(i -> Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer g
                ? d[0] + a <= 500 ? (d[0] += a) >= -500 ? "A" : "" : (d[0] -= g) >= -500 ? "G" : "" : "").collect(Collectors.joining()) : "");
    }
}
