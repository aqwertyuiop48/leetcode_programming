import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            ? IntStream.range(0, k).mapToObj(j -> IntStream.rangeClosed(1, n).mapToObj(i -> "" + Math.min((long) n, i + (1L << j))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
