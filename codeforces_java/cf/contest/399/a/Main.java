import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer p && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? (p - k > 1 ? "<< " : "") + IntStream.rangeClosed(Math.max(1, p - k), Math.min(n, p + k)).mapToObj(i -> i == p ? "(" + i + ")" : "" + i).collect(Collectors.joining(" ")) + (p + k < n ? " >>" : "") : "");
    }
}
