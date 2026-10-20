import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? (long) n * (n - 1) / 2 > k ? IntStream.range(0, n).mapToObj(i -> "0 " + i).collect(Collectors.joining("\n")) : "no solution" : "");
    }
}
